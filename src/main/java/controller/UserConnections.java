package controller;

import db.DbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modal.Fail;
import modal.Sucess;
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

}