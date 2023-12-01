package model;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;

public class Email {

    private static final String marvEmail = "marvspprt@gmail.com";
    private static final String senhaEmail = "eurpmiemapqqqjtv";
    private String assunto = "Novo chamado aberto - MARVSupport";
    private String mensagem;
    private String mensagem2;
    private String destinatario;

    public Email(String mensagem, String mensagem2, String destinatario) {
        this.mensagem = mensagem;
        this.mensagem2 = mensagem2;
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
        return email.matches("^[^\\s@]+@[^\\s@]+\\.[^\\s@]+$");
    }

    public void enviar() {
        // Verifica se o destinatário é um email válido
        if (!isEmailValid(destinatario)) {
            System.out.println("O endereço de email: " + destinatario + " não é válido.");
            return;
        }

        HtmlEmail email = new HtmlEmail();  // Use HtmlEmail em vez de SimpleEmail
        email.setSSLOnConnect(true);
        email.setStartTLSEnabled(true);
        email.setHostName("smtp.gmail.com");
        email.setSmtpPort(587);
        email.setAuthenticator(new DefaultAuthenticator(marvEmail, senhaEmail));

        try {
            email.setFrom(marvEmail);
            email.setDebug(true);
            email.setSubject(this.assunto);

            // Usando HTML para estilizar a mensagem
            String mensagemHtml = "<html><body style='font-family: Cabin, sans-serif; background-color: #101010; border: 1px solid #fff'>";
            mensagemHtml += "<h2 style='color: #fff; text-align: center; font-weight: 600;'>Olá, você tem um novo chamado aberto!</h2>";
            mensagemHtml += "<p style='color: #fff; text-align: center; font-weight: 500; font-size: 1rem;'>" + this.mensagem + "</p>";
            mensagemHtml += "<p style='color: #fff; text-align: center; font-weight: 500;font-size: 1rem;'>" + this.mensagem2 + "</p>";
            mensagemHtml += "<p style='color: #fff; text-align: center; font-weight: 600;font-size: 1rem;'>Entre no software MARVSupport e verifique o chamado aberto<br></p>";
            mensagemHtml += "<p style='color: #00cccc; font-size: 1rem; text-align: center;  font-weight: 600;'>Atenciosamente,<br>Equipe MARVSupport.</p>";
            mensagemHtml += "<p style='color: #D0D0D0; font-size: 0.8rem; text-align: center;  font-weight: 500;'>Este e-mail é uma mensagem automática, por favor não responde-lo.</p>";
            mensagemHtml += "</body></html>";
            email.setHtmlMsg(mensagemHtml);  // Define a mensagem como HTML
            email.setTextMsg("Seu cliente de e-mail não suporta HTML.");
            email.addTo(this.destinatario);
            email.send();
        } catch (EmailException e) {
            e.printStackTrace();
        }
    }
}