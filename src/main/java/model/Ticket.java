package model;

public class Ticket {

    private int id;
    private int status;
    private String titulo;
    private String assunto;
    private String data;
    private String criador;
    private String comentario;

    //construtor padrão
    public Ticket() {
    }
    // construtor pra criação de tickets
    public Ticket(int id, int status, String titulo, String assunto, String data, String criador, String comentario) {
        this.id = id;
        this.status = status;
        this.titulo = titulo;
        this.assunto = assunto;
        this.data = data;
        this.criador = criador;
        this.comentario = comentario;
    }
// getters e setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getCriador() {
        return criador;
    }

    public void setCriador(String criador) {
        this.criador = criador;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}