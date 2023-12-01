package junitTests;

import controller.UserConnections;
import model.User;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
        

@Tag("MARV")
public class UserConnectionsTest {
    

@Test
// teste de usuário correto
public void testLoginAuthOk() {
    System.out.println("testLoginAuthOk");

        UserConnections uc = new UserConnections();
        User user = new User();
        user.setUsuario("admin");
        user.setSenha("admin");
        boolean verificarAuth = uc.userAutenticado(user);
        assertTrue(verificarAuth);
    }

@Test
// Teste de usuário incorreto
public void testLoginAuthFail() {
    System.out.println("testLoginAuthFail");

    UserConnections uc = new UserConnections();
    User user = new User();
    user.setUsuario("test");
    user.setSenha("test");
    boolean verificarAuth = uc.userAutenticado(user);

    // verificar se a autenticação falhou
    if (verificarAuth) {
        fail("O usuário e senha não deveriam ter sido encontrados no banco de dados.");
    }
}

}

