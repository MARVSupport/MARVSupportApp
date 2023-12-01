/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package model;

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
public class TicketTest {
    
    public TicketTest() {
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
     * Test of getId method, of class Ticket.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Ticket instance = new Ticket();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Ticket.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Ticket instance = new Ticket();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatus method, of class Ticket.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        Ticket instance = new Ticket();
        int expResult = 0;
        int result = instance.getStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStatus method, of class Ticket.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        int status = 0;
        Ticket instance = new Ticket();
        instance.setStatus(status);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTitulo method, of class Ticket.
     */
    @Test
    public void testGetTitulo() {
        System.out.println("getTitulo");
        Ticket instance = new Ticket();
        String expResult = "";
        String result = instance.getTitulo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTitulo method, of class Ticket.
     */
    @Test
    public void testSetTitulo() {
        System.out.println("setTitulo");
        String titulo = "";
        Ticket instance = new Ticket();
        instance.setTitulo(titulo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAssunto method, of class Ticket.
     */
    @Test
    public void testGetAssunto() {
        System.out.println("getAssunto");
        Ticket instance = new Ticket();
        String expResult = "";
        String result = instance.getAssunto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAssunto method, of class Ticket.
     */
    @Test
    public void testSetAssunto() {
        System.out.println("setAssunto");
        String assunto = "";
        Ticket instance = new Ticket();
        instance.setAssunto(assunto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getData method, of class Ticket.
     */
    @Test
    public void testGetData() {
        System.out.println("getData");
        Ticket instance = new Ticket();
        String expResult = "";
        String result = instance.getData();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setData method, of class Ticket.
     */
    @Test
    public void testSetData() {
        System.out.println("setData");
        String data = "";
        Ticket instance = new Ticket();
        instance.setData(data);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCriador method, of class Ticket.
     */
    @Test
    public void testGetCriador() {
        System.out.println("getCriador");
        Ticket instance = new Ticket();
        String expResult = "";
        String result = instance.getCriador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCriador method, of class Ticket.
     */
    @Test
    public void testSetCriador() {
        System.out.println("setCriador");
        String criador = "";
        Ticket instance = new Ticket();
        instance.setCriador(criador);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComentario method, of class Ticket.
     */
    @Test
    public void testGetComentario() {
        System.out.println("getComentario");
        Ticket instance = new Ticket();
        String expResult = "";
        String result = instance.getComentario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setComentario method, of class Ticket.
     */
    @Test
    public void testSetComentario() {
        System.out.println("setComentario");
        String comentario = "";
        Ticket instance = new Ticket();
        instance.setComentario(comentario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
