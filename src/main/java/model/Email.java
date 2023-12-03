package model;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;

public class Email {
    // variáveis locais
    private static final String marvEmail = "marvspprt@gmail.com"; //Email do software
    private static final String senhaEmail = "eurpmiemapqqqjtv"; //senha gerada pelo Gmail pra acesso externo
    private String assunto = "Novo chamado aberto - MARVSupport"; // Título do Email
    private String mensagem;
    private String mensagem2;
    private String destinatario;

    // construtor padrão
    public Email(){
        
    }
    // construtor do método pra coletar mensagem e destinatário
    public Email(String mensagem, String mensagem2, String destinatario) {
        this.mensagem = mensagem;
        this.mensagem2 = mensagem2;
        this.destinatario = destinatario;
    }
    //getters e setters

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
    
    // método para verificar se o email é válido através de um padrão de matches
    public boolean isEmailValid(String email) {
        return email.matches("^[^\\s@]+@[^\\s@]+\\.[^\\s@]+$");
    }
// método de envio do email
    public void enviar() {
        // Verifica se o destinatário é um email válido
        if (!isEmailValid(destinatario)) {
            System.out.println("O endereço de email: " + destinatario + " não é válido.");
            return;
        } else {
            // utilizando o HtmlEmail pra enviar um email em formato HTML
            HtmlEmail email = new HtmlEmail();
            email.setSSLOnConnect(true);
            email.setStartTLSEnabled(true);
            email.setHostName("smtp.gmail.com");
            email.setSmtpPort(587); //porta Smtp
            email.setAuthenticator(new DefaultAuthenticator(marvEmail, senhaEmail));
            // tenta enviar o email:
            try {
                email.setFrom(marvEmail); //enviar do email do software
                email.setDebug(true);
                email.setSubject(this.assunto); //assunto setado
                // Estilização da mensagem
                String mensagemHtml = "<html><body style='font-family: Cabin, sans-serif; background-color: #101010; border: 1px solid #fff'>";
                mensagemHtml += "<h2 style='color: #fff; text-align: center; font-weight: 600;'>Olá, você tem um novo chamado aberto!</h2>";
                mensagemHtml += "<p style='color: #fff; text-align: center; font-weight: 500; font-size: 1rem;'>" + this.mensagem + "</p>";
                mensagemHtml += "<p style='color: #fff; text-align: center; font-weight: 500;font-size: 1rem;'>" + this.mensagem2 + "</p>";
                mensagemHtml += "<p style='color: #fff; text-align: center; font-weight: 600;font-size: 1rem;'>Entre no software MARVSupport e verifique o chamado aberto<br></p>";
                mensagemHtml += "<p style='color: #00cccc; font-size: 1rem; text-align: center;  font-weight: 600;'>Atenciosamente,<br>Equipe MARVSupport.</p>";
                mensagemHtml += "<p style='color: #D0D0D0; font-size: 0.8rem; text-align: center;  font-weight: 500;'>Este e-mail é uma mensagem automática, por favor não responde-lo.</p>";
                mensagemHtml += "</body></html>";
                email.setHtmlMsg(mensagemHtml);  // Define a mensagem como HTML
                email.setTextMsg("Seu cliente de email não suporta HTML."); //caso cliente de email não suporte emails html
                email.addTo(this.destinatario);
                email.send(); // envia o email
            } catch (EmailException e) {
                e.printStackTrace();
            }
        }
    }
}