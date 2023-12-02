package controller;

import db.DbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modal.Fail;
import modal.Sucess;
import model.Email;
import model.User;

public class UserConnections {

    Connection conexao;
    String erro = "Ocorreu um erro: ";
    Fail fail = new Fail();
    Sucess ok = new Sucess();

    // VERIFICANDO SE EXISTE O USUÁRIO E AUTENTICANDO
    public ResultSet autenticarUsuario(User user) {
        conexao = new DbConnection().conectarBD();
        try {
            String buscarUserPass = "SELECT usuario, senha FROM tb_usuario WHERE usuario = ? AND senha = ?;";
            PreparedStatement stm = conexao.prepareStatement(buscarUserPass);
            stm.setString(1, user.getUsuario());
            stm.setString(2, user.getSenha());
            ResultSet resultado = stm.executeQuery();
            return resultado;
            // realizando a busca de usuário/senha e retornando o resultado
        } catch (SQLException e) {
            System.out.println(erro + e);
            // caso der erro, retorna a mensagem e não faz nada
            return null;
        }
    }

    // resgatar dados do usuário selecionado
    public ResultSet verificarDados(User user) {
        conexao = new DbConnection().conectarBD();
        try {
            String buscarUserPass = "SELECT * FROM tb_usuario WHERE usuario = ?;";
            PreparedStatement stm = conexao.prepareStatement(buscarUserPass);
            stm.setString(1, user.getUsuario());
            ResultSet resultado = stm.executeQuery();
            return resultado;
            // realizando a busca dos dados do usuário

        } catch (SQLException e) {
            fail.informarErro("ConexaoUsuario | verificarDados: " + e);
            // caso der erro, retorna a mensagem e não faz nada
            return null;
        }
    }

    // verifica o nível do usuário em alguma requisição
    public ResultSet verificarNivelUsuario(User user) {
        conexao = new DbConnection().conectarBD();
        try {
            String buscarUser = "SELECT nivel FROM tb_usuario WHERE usuario = ?;";
            PreparedStatement stm = conexao.prepareStatement(buscarUser);
            stm.setString(1, user.getUsuario());
            ResultSet resultado = stm.executeQuery();
            return resultado;

        } catch (SQLException e) {
            fail.informarErro("ConexaoUsuario | verificarNivelUsuario: " + e);
            return null;
        }
    }

    // envia um email para todos os administradores do sistema 
    public void enviarEmailAdmin(String mensagem1, String mensagem2) {
        conexao = new DbConnection().conectarBD();
        try {
            String buscarUser = "SELECT email FROM tb_usuario WHERE nivel = 2;";
            PreparedStatement stm = conexao.prepareStatement(buscarUser);
            ResultSet resultado = stm.executeQuery();
            while (resultado.next()) {
                String destinatario = resultado.getString("email");
                Email email = new Email(mensagem1, mensagem2, destinatario);
                email.enviar();
            }
        } catch (SQLException e) {
            fail.informarErro("ConexaoUsuario | verificarEmailAdmin: " + e);
        }
    }

    // verifica se aquele usuário está autenticado
    public boolean userAutenticado(User user) {
        boolean auth = false;
        ResultSet resultadoLogin = this.autenticarUsuario(user);
        try {
            if (resultadoLogin.next()) {
                auth = true;
            }
        } catch (SQLException ex) {
            fail.informarErro("ConexaoUsuario | UserAutenticado: " + ex);
        }
        return auth;
    }

    // Edição do email dos usuários
    public void editarEmailUsuario(User user) {
        conexao = new DbConnection().conectarBD();
        try {
            String editarTicket = "UPDATE tb_usuario SET email = ? WHERE usuario = ?;";
            PreparedStatement stm = conexao.prepareStatement(editarTicket);
            stm.setString(1, user.getEmail());
            stm.setString(2, user.getUsuario());
            stm.executeUpdate();
            stm.close();
            ok.informarAssunto("Email editado com sucesso.");
            ok.setVisible(true);
        } catch (Exception e) {
            fail.informarErro("ConexaoUsuario | editarEmailUsuario " + e);
        }
    }
}
