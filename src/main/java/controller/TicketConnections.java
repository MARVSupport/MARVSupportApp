/*
 * The MIT License
 *
 * Copyright 2023 MARVSupport..
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
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
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Ticket;

/**
 * Conexão com banco de dados para ações com os chamados
 *
 * @author Victor Silva
 * @version 1.0.2
 */
public class TicketConnections {

    Connection conexao;
    Fail fail = new Fail();
    Sucess ok = new Sucess();

    // CRIAR ticket
    public void criarTicket(Ticket ticket) {
        conexao = new DbConnection().conectarBD();
        try {
            String novoTicket = "INSERT INTO tb_ticket (titulo, assunto , data, status, criador) VALUES (?, ?, ?, ?, ?)";
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
    public void editarTicket(Ticket ticket) {
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
    public void excluirTicket(Ticket ticket) {
        String excluirTicket = "DELETE FROM tb_ticket WHERE id = ?;";
        conexao = new DbConnection().conectarBD();
        try {
            PreparedStatement stm = conexao.prepareStatement(excluirTicket);
            stm.setInt(1, ticket.getId());
            stm.executeUpdate();
            stm.close();
            ok.informarAssunto("Chamado excluido com sucesso.");
            ok.setVisible(true);
        } catch (Exception e) {
            fail.informarErro("TicketConnections | excluirTicket " + e);
        }
    }

    /**
     * Método responsável por listar os dados do ticket via status
     *
     * @return lista
     */
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

    /**
     * Método responsável por listar todos os tickets
     *
     * @return lista
     */
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

    /**
     * Método responsável por buscar os dados do ticket
     *
     * @return result
     */
    public ResultSet mostrarDados(int idTicket) throws SQLException {
        conexao = new DbConnection().conectarBD();
        String verificarDados = "SELECT * FROM tb_ticket WHERE id = '" + idTicket + "';";
        PreparedStatement stm = conexao.prepareStatement(verificarDados);
        ResultSet result = stm.executeQuery();
        return result;
    }

    /**
     * Método responsável por pesquisar o chamado pelo ID
     *
     * @return t
     */
    public Ticket pesquisarTicket(int id) {
        for (Ticket t : this.listarTodosTickets()) {
            if (t.getId() == id) {
                return t;
            }
        }
        return null;
    }

    /**
     * Método responsável por pesquisar o chamado pelo status
     *
     * @return t
     */
    public Ticket pesquisarTicketStatus(int status) {
        for (Ticket t : this.listarTicketsEspecificos(status)) {
            if (t.getStatus() == status) {
                return t;
            }
        }
        return null;
    }

    /**
     * Método responsável por retornar a quantidade total dependendo do status e
     * retorna em String pra ser exibida
     *
     * @return total
     */
    public String qntTotalTicket(int status) {
        String total = "";
        conexao = new DbConnection().conectarBD();
        String search = "SELECT count(1) as total from tb_ticket where status = " + status + ";";
        try {
            PreparedStatement stm = conexao.prepareStatement(search);
            ResultSet result = stm.executeQuery();
            result.next();
            total = String.valueOf(result.getInt(1));
        } catch (SQLException ex) {
            Logger.getLogger(TicketConnections.class.getName()).log(Level.SEVERE, null, ex);
        }
        return total;
    }

    /**
     * Método responsável por retornar quantidade total independente do status e
     * retorna em String pra ser exibida
     *
     * @return totalFormated
     */
    public String totalTickets() {
        int open = Integer.parseInt(qntTotalTicket(1));
        int pending = Integer.parseInt(qntTotalTicket(2));
        int closed = Integer.parseInt(qntTotalTicket(3));
        int total = open + pending + closed;
        String totalFormated = String.valueOf(total);
        return totalFormated;
    }
}
