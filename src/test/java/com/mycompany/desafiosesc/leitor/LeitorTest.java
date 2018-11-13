package com.mycompany.desafiosesc.leitor;

import com.mycompany.desafiosesc.util.Util;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jhonatan
 */
public class LeitorTest {

    public LeitorTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of readLines method, of class Leitor.
     */
    @Test
    public void testReadLines() {
        String filePath = "C:\\Users\\Jhonatan\\Documents\\NetBeansProjects\\DesafioSESC\\src\\main\\java\\com.mycompany.desafiosesc.src\\entradaDeDados.txt";

        try {
            Leitor leitor = new Leitor(filePath);
            assertTrue(!Util.isNullOrEmpty(leitor.readLines()));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LeitorTest.class.getName()).log(Level.SEVERE, null, ex);
            assertTrue(false);
        } catch (UnsupportedEncodingException ex) {
            assertTrue(false);
        }
    }

}
