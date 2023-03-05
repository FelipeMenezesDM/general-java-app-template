# Build
FROM maven:3.9.0-eclipse-temurin-11-alpine AS build
USER root
ARG APP_ENV
ARG PORT

ENV APP_ENV=$APP_ENV
ENV PORT=$PORT

WORKDIR /home/app

COPY ./app .

RUN mvn clean package -s settings.xml

# Execution
FROM adoptopenjdk/openjdk11:x86_64-alpine-jre-11.0.18_10
USER root
ARG APP_ENV
ARG PORT
ARG PORT_DEBUG

ENV APP_ENV=$APP_ENV
ENV PORT=$PORT
ENV PORT_DEBUG=$PORT_DEBUG
ENV JAVA_TOOL_OPTIONS="-agentlib:jdwp=transport=dt_socket,address=*:${PORT_DEBUG},server=y,suspend=n"

WORKDIR /home/app/target

COPY --from=build /home/app/target/*.jar package.jar

HEALTHCHECK --interval=4m --retries=3 --timeout=8s CMD curl -f http://localhost:${PORT}/api/v1/health-check || exit 1

ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=${APP_ENV}", "package.jar"]
