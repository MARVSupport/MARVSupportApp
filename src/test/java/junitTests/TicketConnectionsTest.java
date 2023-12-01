/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package junitTests;

import controller.TicketConnections;
import model.Ticket;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Louise
 */
@Tag("MARV")
public class TicketConnectionsTest {
    /**
     * Test of listarTicketsEspecificos method, of class TicketConnections
     */
    @Test
    public void testListarTicketsEspecificos() {
        System.out.println("Listar Tickets Especificos");
        // teste de pesquisa de ticket pelo ID
        int id = 1;

        TicketConnections t = new TicketConnections();
        Ticket ticket = t.pesquisarTicket(id);
        Ticket tn = new Ticket(1, 1, "Teste", "assunto", "30/11/23", "admin", "comentario");
        assertEquals(ticket.getId(), tn.getId());
        assertEquals(ticket.getTitulo(), tn.getTitulo());

    }
}