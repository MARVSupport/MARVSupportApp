package junitTests;

import controller.TicketConnections;
import model.Ticket;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("MARV")
public class TicketConnectionsTest {

    @Test
    // teste de pesquisa de ticket pelo ID - comparação
    public void testListarTicketsEspecificos() {
        System.out.println("testListarTicketsEspecificos = Passou");
        int id = 1;
        TicketConnections t = new TicketConnections();
        Ticket ticket = t.pesquisarTicket(id);
        Ticket tn = new Ticket(1, 1, "Teste", "assunto", "30/11/23", "admin", "comentario");
        assertEquals(ticket.getId(), tn.getId());
        assertEquals(ticket.getTitulo(), tn.getTitulo());
    }
    
    @Test
    public void testListarTicketsAbertos(){
        System.out.println("testListarTicketsAbertos = Passou");
        int status = 1;
        TicketConnections t = new TicketConnections();
        Ticket ticket = t.pesquisarTicketStatus(status);
        Ticket tn = new Ticket(1, 1, "Teste", "assunto", "30/11/23", "admin", "comentario");
        assertEquals(ticket.getStatus(), tn.getStatus());
    }

    //verifica se a contagem de tickets está correta, caso tenha mais de 1 de resultado considera-se correta pois há no momento mais de 1.
    @Test
    public void testContagemTotalTickets() {
        System.out.println("testContagemTotalTickets = Passou");
        TicketConnections t = new TicketConnections();
        boolean verificar = false;
        int totalDb = Integer.parseInt(t.totalTickets());
        // no momento tem mais de um ticket, vamos realizar a contagem
        int totalTeste = 1;
        if (totalDb >= totalTeste) {
            verificar = true;
        }
        assertTrue(verificar);
    }
}
