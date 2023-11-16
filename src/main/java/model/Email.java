package model;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class Email {

    private static final String marvEmail = "marvspprt@gmail.com";
    private static final String senhaEmail = "eurpmiemapqqqjtv";
    private String assunto;
    private String mensagem;
    private String destinatario;

    public Email(String assunto, String mensagem, String destinatario) {
        this.assunto = assunto;
        this.mensagem = mensagem;
        this.destinatario = destinatario;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    // Adiciona um método para verificar se o email é válido
    private boolean isEmailValid(String email) {
        // Implemente sua lógica de validação de email aqui
        // Por exemplo, você pode usar expressões regulares ou outras verificações
        return email.matches("^[^\\s@]+@[^\\s@]+\\.[^\\s@]+$");
    }

    public void enviar() {
        // Verifica se o destinatário é um email válido
        if (!isEmailValid(destinatario)) {
            System.out.println("O endereço de email: " + destinatario + " não é válido.");
            return;
        }

        SimpleEmail email = new SimpleEmail();
        email.setSSLOnConnect(true);
        email.setStartTLSEnabled(true);
        email.setHostName("smtp.gmail.com");
        email.setSmtpPort(587);
        email.setAuthenticator(new DefaultAuthenticator(marvEmail, senhaEmail));

        try {
            email.setFrom(marvEmail);
            email.setDebug(true);
            email.setSubject(this.assunto);
            email.setMsg(this.mensagem);
            email.addTo(this.destinatario);
            email.send();
        } catch (EmailException e) {
            e.printStackTrace();
        }
    }
}
