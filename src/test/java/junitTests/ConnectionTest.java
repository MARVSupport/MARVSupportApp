package junitTests;

import db.DbConnection;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("MARV")
public class ConnectionTest {
    // import
    DbConnection db = new DbConnection();

    //teste de conexão com banco de dados
    @Test
    public void testConexaoOk() {
                System.out.println("testConexaoOk = Passou");
        assertTrue(db.verificarStatus());
    }
}
