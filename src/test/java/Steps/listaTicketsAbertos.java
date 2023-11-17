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
    @Dado("usuario chamou TicketConnections para verificação")
    public void usuarioChamouTicketConnectionsParaVerificação() {
        serviceTicket = new TicketConnections();
    }

    @Quando("chamou a função listarTicketsEspecificos")
    public void chamouAFunçãoListarTicketsEspecificos() {
        tktsAbertos = serviceTicket.listarTicketsEspecificos(1);
    }

    @Entao("recebe lista de tickets Abertos")
    public void recebeListaDeTicketsAbertos() {
        Assert.assertEquals(3,tktsAbertos.size());
    }
}
