# language: pt

Funcionalidade: conferir conexão com DB

  Cenario: verificar conexão com banco
    Dado usuario chamou DbConnection
    Quando chamar a função verificarStatus
    Entao recebe true para conexão
