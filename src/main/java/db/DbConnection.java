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
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Conexão com banco de dados
 *
 * @author Victor Silva
 * @version 1.0.2
 */
public class DbConnection {

    private static final String HOSTNAME = "localhost";
    private static final String DB_NAME = "marvsupport";
    private static final int PORT = 3306;
    private static final String USERNAME = "root";
    private static final String PASSWORD = "rootadmin";
    String erro = "Erro ao conectar ao banco de dados.";
    private Connection conexao;
    public boolean verificar;

    /**
     * Método responsável pela conexão com o banco
     *
     * @return conexao
     */
    // Conexão ao BANCO DE DADOS
    public Connection conectarBD() {
        if (conexao != null) {
            return conexao;
        } else {
            try {
                conexao = DriverManager.getConnection("jdbc:mysql://" + HOSTNAME + ":" + PORT + "/" + DB_NAME, USERNAME, PASSWORD);
                verificar = true;
            } catch (SQLException e) {
                verificar = false;
                System.out.println(erro);
                desconectarBD();
            }
            return conexao;
        }
    }

    /**
     * Método responsável pela desconexão do banco
     *
     */
    // Desconecta do BANCO DE DADOS
    public void desconectarBD() {
        try {
            if (!conexao.isClosed()) {
                conexao.close();
            }
        } catch (SQLException e) {
            System.out.println(erro);
        }
    }

    /**
     * Método responsável por verificar o status do banco de dados
     *
     * @return verificar
     */
    // verifica o status da conexão com o banco de dados
    public boolean verificarStatus() {
        conectarBD();
        return verificar;
    }
}
