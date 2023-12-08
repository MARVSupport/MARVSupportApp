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

import db.DbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modal.Fail;
import modal.Sucess;
import model.Email;
import model.User;

/**
 * Conexão com banco de dados para ações com os usuários
 *
 * @author Victor Silva
 * @version 1.0.2
 */
public class UserConnections {

    Connection conexao;
    String erro = "Ocorreu um erro: ";
    Fail fail = new Fail();
    Sucess ok = new Sucess();

    /**
     * Método responsável por verificar se o usuário existe e caso sim, autentica
     *
     * @return resultado
     */
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

    /**
     * Método responsável por resgatar do banco os dados do usuário
     *
     * @return resultado
     */
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

    /**
     * Método responsável por verificar o nível do usuário em alguma requisição
     *
     * @return resultado
     */
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

       /**
     * Método responsável por verificar se o usuário está autenticado
     *
     * @return auth
     */
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
    
    
    /**
     * Método responsável por verificar o nível do usuário booleano
     *
     * @return nivel
     */
    public boolean nivelUsuario(User user) {
        boolean nivel = false;
        ResultSet resultadoBusca = verificarNivelUsuario(user);
        // realiza busca do usuário e verifica o nível do mesmo (1 Operador e 2 Administrador)
        try {
            while (resultadoBusca.next()) {
                user.setNivel(resultadoBusca.getInt("nivel"));
                int nivelUser = user.getNivel();
                switch (nivelUser) {
                    case 1:
                        nivel = false;
                        break;
                    case 2:
                        nivel = true;
                        break;
                }
            }
        } catch (SQLException ex) {
        }
        return nivel;
    }

    /**
     * Método responsável por verificar se encontrou dados daquele usuário específico
     *
     * @return encontrado
     */
    public boolean dadosEncontrados(User user) {
        boolean encontrado = false;
        ResultSet resultadoBusca = verificarDados(user);
        try {
            while (resultadoBusca.next()) {
                encontrado = true;
            }
        } catch (Exception e) {
        }
        return encontrado;
    }
}
