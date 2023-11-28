# language: pt

Funcionalidade: listar tickets
  Cenario: Pesquisa por tickets
   Dado usuario chamou TicketConnections para verificação
   Quando chamou a função listarTicketsEspecificos

   Entao recebe lista de tickets Pendente

   Entao recebe lista de tickets Fechado