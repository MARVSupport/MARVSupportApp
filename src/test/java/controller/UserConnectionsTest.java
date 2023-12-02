package controller;

import model.User;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
        

@Tag("MARV")
public class UserConnectionsTest {
    

@Test
public void testLoginAuth() {
    System.out.println("Teste Login Auth");
        UserConnections uc = new UserConnections();
        User user = new User();
        user.setUsuario("becalouise");
        user.setSenha("admin");
        boolean verificarAuth = uc.userAutenticado(user);
        assertTrue(verificarAuth);
    }
}

