# language: pt

Funcionalidade: listar tickets Abertos

  Cenario: Pesquisa por tickets Abertos
   Dado chamada TicketConnections para verificação de tkt abertos
   Quando chamada função listarTicketsEspecificos para verificação
   Entao receb lista de tickets Abertos