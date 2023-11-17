package Steps;

import controller.TicketConnections;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import model.Ticket;
import java.util.List;
import org.junit.Assert;

public class listaTickets {
    private TicketConnections serviceTicket;
    private List<Ticket> tkts;

    @Dado("usuario chamou TicketConnections")
    public void usuarioChamouAFunção() {
        serviceTicket = new TicketConnections();
    }
    @Quando("chamar a função listarTodosTickets")
    public void executouAFunção() {
        tkts = serviceTicket.listarTodosTickets();
    }
    @Entao("recebe lista de tickets")
    public void deveTrazerTodosOsTickets() {
        Assert.assertEquals(4,tkts.size());
    }

}
