package Steps;

import controller.TicketConnections;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import model.Ticket;
import org.junit.Assert;

import java.util.List;

public class listaTicketsStatus {
    private TicketConnections serviceTicket;
   // private List<Ticket> tktsPendente;
    private List<Ticket> tktsFechado;

    @Dado("usuario chamou TicketConnections para verificação")
    public void usuarioChamouTicketConnectionsParaVerificação() {

        serviceTicket = new TicketConnections();
    }

    @Quando("chamou a função listarTicketsEspecificos")
    public void chamouAFunçãoListarTicketsEspecificos() {
      //  tktsPendente = serviceTicket.listarTicketsEspecificos(2);
        tktsFechado = serviceTicket.listarTicketsEspecificos(3);

    }

//    @Entao("recebe lista de tickets Pendente")
//    public void recebeListaDeTicketsPendente() {
//        Assert.assertEquals(1,tktsPendente.size());
//    }

    @Entao("recebe lista de tickets Fechado")
    public void recebeListaDeTicketsFechado() {
        Assert.assertEquals(1,tktsFechado.size());
    }
}
