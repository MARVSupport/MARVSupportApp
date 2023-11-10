
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modal.Fail;
import modal.Sucess;
import db.DbConnection;
import model.Ticket;


public class TicketConnections {
    
     Connection conexao;
     Fail fail = new Fail();
     Sucess ok = new Sucess();
     
         // CRIAR ticket
    public void criarTicket(Ticket ticket) {
        conexao = new DbConnection().conectarBD();

        try {
            String novoTicket = "INSERT INTO tb_ticket (titulo, assunto , data, status, criador)"
                    + "VALUES (?, ?, ?, ?, ?)";

            PreparedStatement stm = conexao.prepareStatement(novoTicket);
            stm.setString(1, ticket.getTitulo());
            stm.setString(2, ticket.getAssunto());
            stm.setString(3, ticket.getData());
            stm.setInt(4, ticket.getStatus());
            stm.setString(5, ticket.getCriador());
            stm.executeUpdate();
            stm.close();
            ok.informarAssunto("Chamado aberto com sucesso.");

        } catch (SQLException erro) {
            fail.informarErro("TicketConnections | criarTicket " + erro);
        }

    }
    
    // EDITAR ticket
    public void editarTicket(Ticket ticket){
        conexao = new DbConnection().conectarBD();
        
        try {
            String editarTicket = "UPDATE tb_ticket SET comentario = ?, status = ? WHERE id = ?;";
            
            PreparedStatement stm = conexao.prepareStatement(editarTicket);
            stm.setString(1, ticket.getComentario());
            stm.setInt(2, ticket.getStatus());
            stm.setInt(3, ticket.getId());
            stm.executeUpdate();
            stm.close();
            ok.informarAssunto("Chamado editado com sucesso.");
            ok.setVisible(true);
            
        } catch (Exception e) {
            fail.informarErro("TicketConnections | editarTicket " + e);
        }
    }
    
    
    // EXCLUIR ticket
    public void excluirTicket(Ticket ticket){
        
        String excluirTicket = "DELETE FROM tb_ticket WHERE id = ?;";
        conexao = new DbConnection().conectarBD();
        
        try {
            PreparedStatement stm = conexao.prepareStatement(excluirTicket);
            stm.setInt(1, ticket.getId());
            stm.executeUpdate();
            stm.close();
            ok.informarAssunto("Chamado excluido com sucesso.");
            ok.setVisible(true);
        } catch (Exception e){
            fail.informarErro("TicketConnections | excluirTicket " + e);
        }
    }
   
    

    // lista os tickets da empresa
    public List<Ticket> listarTicketsEspecificos(int status) {
        conexao = new DbConnection().conectarBD();
        String busca = "SELECT id, titulo, data, status FROM tb_ticket WHERE status = '" + status + "';";
        List<Ticket> lista = new ArrayList<>();

        try {
            PreparedStatement stm = conexao.prepareStatement(busca);
            ResultSet result = stm.executeQuery();
            while (result.next()) {
                Ticket ticket = new Ticket();
                ticket.setId(result.getInt("id"));
                ticket.setTitulo(result.getString("titulo"));
                ticket.setData(result.getString("data"));
                ticket.setStatus(result.getInt("status"));
                lista.add(ticket);
            }
        } catch (SQLException erro) {
            fail.informarErro("TicketConnections | listarTicketsEspecificos " + erro);
        }
        return lista;
    }
    
     // lista os tickets da empresa
    public List<Ticket> listarTodosTickets() {
        conexao = new DbConnection().conectarBD();
        String busca = "SELECT id, titulo, data, status FROM tb_ticket;";
        List<Ticket> lista = new ArrayList<>();

        try {
            PreparedStatement stm = conexao.prepareStatement(busca);
            ResultSet result = stm.executeQuery();
            while (result.next()) {
                Ticket ticket = new Ticket();
                ticket.setId(result.getInt("id"));
                ticket.setTitulo(result.getString("titulo"));
                ticket.setData(result.getString("data"));
                ticket.setStatus(result.getInt("status"));
                lista.add(ticket);
            }
        } catch (SQLException erro) {
            fail.informarErro("TicketConnections | listarTodosTickets " + erro);
        }
        return lista;
    }   
    
    
    
        // exibindo dados do ticket
        public ResultSet mostrarDados(int idTicket) throws SQLException{
        conexao = new DbConnection().conectarBD();
        String verificarDados = "SELECT * FROM tb_ticket WHERE id = '" + idTicket + "';";
        PreparedStatement stm = conexao.prepareStatement(verificarDados);
        ResultSet result = stm.executeQuery();
        return result;
    }
}