/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package db;

import java.sql.Connection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Louise
 */
public class DbConnectionTest {
    
    public DbConnectionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of conectarBD method, of class DbConnection.
     */
    @Test
    public void testConectarBD() {
        System.out.println("conectarBD");
        DbConnection instance = new DbConnection();
        Connection expResult = null;
        Connection result = instance.conectarBD();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of desconectarBD method, of class DbConnection.
     */
    @Test
    public void testDesconectarBD() {
        System.out.println("desconectarBD");
        DbConnection instance = new DbConnection();
        instance.desconectarBD();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verificarStatus method, of class DbConnection.
     */
    @Test
    public void testVerificarStatus() {
        System.out.println("verificarStatus");
        DbConnection instance = new DbConnection();
        boolean expResult = false;
        boolean result = instance.verificarStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
