package Steps;

import controller.TicketConnections;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import java.util.List;
import model.Ticket;
import org.junit.Assert;

public class listaTicketsAbertos {
    private TicketConnections serviceTicket;
    private List<Ticket> tktsAbertos;
    @Dado("chamada TicketConnections para verificação de tkt abertos")
    public void usuarioChamouTicketConnectionsParaVerificação() {
        serviceTicket = new TicketConnections();
    }

    @Quando("chamada função listarTicketsEspecificos para verificação")
    public void chamouAFunçãoListarTicketsEspecificos() {
        tktsAbertos = serviceTicket.listarTicketsEspecificos(1);
    }

    @Entao("receb lista de tickets Abertos")
    public void recebeListaDeTicketsAbertos() {
        Assert.assertEquals(3,tktsAbertos.size());
    }
}
