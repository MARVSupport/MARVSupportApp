package junitTests;

import controller.UserConnections;
import modal.Logout;
import model.User;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("MARV")
public class UserConnectionsTest {

    UserConnections uc = new UserConnections();

    @Test
// teste de usuário correto
    public void testLoginAuthOk() {
        System.out.println("testLoginAuthOk = Passou");
        User user = new User();
        user.setUsuario("admin");
        user.setSenha("admin");
        boolean verificarAuth = uc.userAutenticado(user);
        assertTrue(verificarAuth);
    }

    @Test
// Teste de usuário incorreto
    public void testLoginAuthFail() {
        System.out.println("testLoginAuthFail = Passou");
        User user = new User();
        user.setUsuario("test");
        user.setSenha("test");
        boolean verificarAuth = uc.userAutenticado(user);
        // verificar se a autenticação falhou
        if (verificarAuth) {
            fail("O usuário e senha não deveriam ter sido encontrados no banco de dados.");
        }
    }
// Teste pra verificar se um usuário é administrador

    @Test
    public void testUsuarioAdmin() {
        System.out.println("testUsuarioAdmin = Passou");
        // se retornar true é que é administrador
        User user = new User();
        user.setUsuario("admin");
        assertTrue(uc.nivelUsuario(user));
    }

    // Teste pra verificar se um usuário é colaborador
    @Test
    public void testUsuarioColaborador() {
        System.out.println("testUsuarioColaborador = Passou");
        // se retornar false é colaborador
        User user = new User();
        user.setUsuario("beca");
        assertFalse(uc.nivelUsuario(user));
    }

    // Teste pra verificar se foram encontrado dados de um usuário
    @Test
    public void testDadosUsuarioExistem() {
        System.out.println("testDadosUsuarioExistem = Passou");
        // se retornar false é colaborador
        User user = new User();
        user.setUsuario("admin");
        assertTrue(uc.dadosEncontrados(user));
    }

    //verificar se está deslogado
    @Test
    public void testDeslogado() {
        System.out.println("testDeslogado = Passou");
        Logout logout = new Logout();
        // se o teste der certo é porque o usuário está deslogado
        assertFalse(logout.deslogado(false));
    }
    //verificar se está logado

    @Test
    public void testLogado() {
        System.out.println("testLogado = Passou");
        Logout logout = new Logout();
        // se o teste der certo é porque o usuário está logado
        assertTrue(logout.deslogado(true));
    }

}
