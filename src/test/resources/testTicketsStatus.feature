# language: pt

Funcionalidade: listar tickets

  Cenario: Pesquisa por tickets Pendente
   Dado usuario chamou TicketConnections para verificação
   Quando chamou a função listarTicketsEspecificos
   Entao recebe lista de tickets Pendente


  Cenario: Pesquisa por tickets Fechado
    Dado usuario chamou TicketConnections para verificação
    Quando chamou a função listarTicketsEspecificos
    Entao recebe lista de tickets Fechado