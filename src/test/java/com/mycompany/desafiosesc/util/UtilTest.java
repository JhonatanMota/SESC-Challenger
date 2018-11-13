package com.mycompany.desafiosesc.util;

import com.mycompany.desafiosesc.builder.ValorBuilder;
import com.mycompany.desafiosesc.model.CategoriaCliente;
import com.mycompany.desafiosesc.model.Valor;
import java.math.BigDecimal;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jhonatan
 */
public class UtilTest {

    public UtilTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Test
    public void testIsNullOrEmpty_List() {
        assertEquals(Util.isNullOrEmpty(new ArrayList()), true);
        List<Valor> valores = new ArrayList<>();

        Valor valor = ValorBuilder.inicializaValor()
                .comCategoria(CategoriaCliente.Usuario)
                .comValor(new BigDecimal(10))
                .comDiaSemana(Boolean.TRUE).build();

        valores.add(valor);

        assertEquals(Util.isNullOrEmpty(valores), false);
    }

    @Test
    public void testIsNullOrEmpty_String() {
        assertEquals(Util.isNullOrEmpty(""), true);
        assertEquals(Util.isNullOrEmpty("Valor"), false);
    }

    @Test
    public void testConvertStringToMonth() {
        assertEquals(Util.convertStringToMonth("Jan"), Month.JANUARY);
    }

}
