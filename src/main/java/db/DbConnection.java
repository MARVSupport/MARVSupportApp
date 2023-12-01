package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

    private static final String HOSTNAME = "localhost";
    private static final String DB_NAME = "marvsupport";
    private static final int PORT = 3306;
    private static final String USERNAME = "root";
    private static final String PASSWORD = "rootadmin";
    String erro = "Erro ao conectar ao banco de dados.";
    private Connection conexao;
    public boolean verificar;

    //Conexão ao BANCO DE DADOS
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

    public boolean verificarStatus() {
        conectarBD();
        return verificar;
    }
}
