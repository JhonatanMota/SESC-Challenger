package com.mycompany.desafiosesc.leitor;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
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
public class ConversorEntradaDadosTest {

    String row;

    public ConversorEntradaDadosTest() {
        try {
            String filePath = "C:\\Users\\Jhonatan\\Documents\\NetBeansProjects\\DesafioSESC\\src\\main\\java\\com.mycompany.desafiosesc.src\\entradaDeDados.txt";
            BufferedReader readFile = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "UTF-8"));
            row = readFile.readLine();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ConversorEntradaDadosTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(ConversorEntradaDadosTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ConversorEntradaDadosTest.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of converter method, of class ConversorEntradaDados.
     */
    @Test
    public void testConverter() {
        ConversorEntradaDados conversor = new ConversorEntradaDados().converter(row);
        assertTrue(conversor != null);
        assertTrue(conversor.getCategoria() != null);
        assertTrue(!conversor.getDatas().isEmpty());
        assertTrue(conversor.getRow() != null);
    }
}
