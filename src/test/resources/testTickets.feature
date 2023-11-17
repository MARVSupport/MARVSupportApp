# language: pt

Funcionalidade: listar todos os tickets

  Cenario: Pesquisa por todos os tickets
    Dado usuario chamou TicketConnections
    Quando chamar a função listarTodosTickets
    Entao recebe lista de tickets
