package com.mycompany.desafiosesc.model;

import com.mycompany.desafiosesc.builder.ValorBuilder;
import java.math.BigDecimal;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Jhonatan
 *
 * Testa a classe {@link  Valor}
 */
public class ValorTest {

    public ValorTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Test
    public void testGetValor() {
        Valor valor = ValorBuilder.inicializaValor()
                .comCategoria(CategoriaCliente.Usuario)
                .comValor(new BigDecimal(10))
                .comDiaSemana(Boolean.TRUE).build();

        assertEquals(valor.getValor(), new BigDecimal(10));
    }

    @Test
    public void testSetValor() {
        Valor valor = ValorBuilder.inicializaValor()
                .comCategoria(CategoriaCliente.Usuario)
                .comValor(new BigDecimal(10))
                .comDiaSemana(Boolean.TRUE).build();

        valor.setValor(new BigDecimal(100));

        assertEquals(valor.getValor(), new BigDecimal(100));
    }

    @Test
    public void testIsDiaDeSemana() {
        Valor valor = ValorBuilder.inicializaValor()
                .comCategoria(CategoriaCliente.Usuario)
                .comValor(new BigDecimal(10))
                .comDiaSemana(Boolean.TRUE).build();

        assertEquals(valor.isDiaDeSemana(), true);
    }

    @Test
    public void testSetDiaDeSemana() {
        Valor valor = ValorBuilder.inicializaValor()
                .comCategoria(CategoriaCliente.Usuario)
                .comValor(new BigDecimal(10))
                .comDiaSemana(Boolean.TRUE).build();

        valor.setDiaDeSemana(Boolean.FALSE);

        assertEquals(valor.isDiaDeSemana(), false);
    }

    @Test
    public void testGetCategoria() {
        Valor valor = ValorBuilder.inicializaValor()
                .comCategoria(CategoriaCliente.Usuario)
                .comValor(new BigDecimal(10))
                .comDiaSemana(Boolean.TRUE).build();

        assertEquals(valor.getCategoria(), CategoriaCliente.Usuario);
    }

    @Test
    public void testSetCategoria() {
        Valor valor = ValorBuilder.inicializaValor()
                .comCategoria(CategoriaCliente.Usuario)
                .comValor(new BigDecimal(10))
                .comDiaSemana(Boolean.TRUE).build();

        valor.setCategoria(CategoriaCliente.Comerciario);

        assertEquals(valor.getCategoria(), CategoriaCliente.Comerciario);

    }

}
