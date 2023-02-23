# Build
FROM maven:3.9.0-eclipse-temurin-11-alpine AS build
USER root
ARG APP_ENV
ARG GITHUB_SERVER_USER
ARG GITHUB_SERVER_PASSWORD

WORKDIR /home/app

COPY ./app .
RUN mvn clean package -s /home/app/settings.xml -Dspring.profiles.active="${APP_ENV}" -Drepo.usrnm="${GITHUB_SERVER_USER}" -Drepo.pswd="${GITHUB_SERVER_PASSWORD}"

# Execution
FROM openjdk:11-jre-slim
USER root

WORKDIR /home/app

COPY --from=build /home/app/target/*.jar /home/app/target/package.jar

ENTRYPOINT ["java", "-jar", "/home/app/target/package.jar"]
