package junitTests;

import model.Email;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("MARV")
public class EmailTest {

    String emailCorreto = "marvspprt@gmail.com";
    String emailIncorreto = "marv";

    @Test
    public void testEmailCorreto() {
        System.out.println("testEmailCorreto = Passou");
        Email email = new Email();
        assertTrue(email.isEmailValid(emailCorreto));
    }

    @Test
    public void testEmailIncorreto() {
        System.out.println("testEmailIncorreto = Passou");
        Email email = new Email();
        assertFalse(email.isEmailValid(emailIncorreto));
    }

    @Test
    public void testMensagemNula() {
        System.out.println("testMensagemNula = Passou");
        String semMensagem = "";
        Email email = new Email("", "", emailCorreto);
        // se passar é porque a mensagem do email é Nula
        assertEquals(email.getMensagem(), semMensagem);
    }
}
