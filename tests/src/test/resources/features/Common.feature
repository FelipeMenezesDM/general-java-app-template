#language: pt
Funcionalidade: Modelo de testes integrados para a aplicação utilizando Cucumber
  Cenario: Validar endpoint do health check da Aplicação
    Dado que uma requisição foi realizada para o endpoint de health check da aplicação
    Então confirmar retorno de status http 200
