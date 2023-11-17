package Steps;
import controller.TicketConnections;
import db.DbConnection;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import model.Ticket;
import org.junit.Assert;

import java.util.List;

public class connectionDB {

    private DbConnection serviceDb;
    private boolean result;
    @Dado("usuario chamou DbConnection")
    public void usuarioChamouDbConnection() {
        serviceDb = new DbConnection();
    }

    @Quando("chamar a função verificarStatus")
    public void chamarAFunçãoVerificarStatus() {
        result = serviceDb.verificarStatus();
    }

    @Entao("recebe true para conexão")
    public void recebeTrueParaConexão() {
        Assert.assertTrue(result);
    }
}
