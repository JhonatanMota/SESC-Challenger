package com.mycompany.desafiosesc.model;

import com.mycompany.desafiosesc.builder.HotelBuilder;
import com.mycompany.desafiosesc.builder.ValorBuilder;
import com.mycompany.desafiosesc.leitor.ConversorEntradaDados;
import com.mycompany.desafiosesc.leitor.Leitor;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jhonatan Testes da Classe {@link Hotel}
 */
public class HotelTest {

    public HotelTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Test
    public void testGetNome() {
        Hotel hotel = HotelBuilder.inicializaHotel()
                .comNome("Sesc Palmas")
                .comClassificacao(3)
                .comValor(ValorBuilder.inicializaValor()
                        .comValor(new BigDecimal(110))
                        .comCategoria(CategoriaCliente.Usuario)
                        .comDiaSemana(true).build())
                .comValor(ValorBuilder.inicializaValor()
                        .comValor(new BigDecimal(80))
                        .comCategoria(CategoriaCliente.Comerciario)
                        .comDiaSemana(true).build())
                .comValor(ValorBuilder.inicializaValor()
                        .comValor(new BigDecimal(90))
                        .comCategoria(CategoriaCliente.Usuario)
                        .comDiaSemana(false).build())
                .comValor(ValorBuilder.inicializaValor()
                        .comValor(new BigDecimal(80))
                        .comCategoria(CategoriaCliente.Comerciario)
                        .comDiaSemana(false).build())
                .build();

        assertEquals(hotel.getNome(), "Sesc Palmas");
    }

    @Test
    public void testSetNome() {
        Hotel hotel = HotelBuilder.inicializaHotel()
                .comNome("Sesc Palmas")
                .comClassificacao(3)
                .comValor(ValorBuilder.inicializaValor()
                        .comValor(new BigDecimal(110))
                        .comCategoria(CategoriaCliente.Usuario)
                        .comDiaSemana(true).build())
                .comValor(ValorBuilder.inicializaValor()
                        .comValor(new BigDecimal(80))
                        .comCategoria(CategoriaCliente.Comerciario)
                        .comDiaSemana(true).build())
                .comValor(ValorBuilder.inicializaValor()
                        .comValor(new BigDecimal(90))
                        .comCategoria(CategoriaCliente.Usuario)
                        .comDiaSemana(false).build())
                .comValor(ValorBuilder.inicializaValor()
                        .comValor(new BigDecimal(80))
                        .comCategoria(CategoriaCliente.Comerciario)
                        .comDiaSemana(false).build())
                .build();
        hotel.setNome("Hotel Editado");
        assertEquals(hotel.getNome(), "Hotel Editado");
    }

    @Test
    public void testGetValores() {
        Hotel hotel = HotelBuilder.inicializaHotel()
                .comNome("Sesc Palmas")
                .comClassificacao(3)
                .comValor(ValorBuilder.inicializaValor()
                        .comValor(new BigDecimal(110))
                        .comCategoria(CategoriaCliente.Usuario)
                        .comDiaSemana(true).build())
                .build();

        assertEquals(hotel.getValores().get(0).getCategoria(), CategoriaCliente.Usuario);
        assertEquals(hotel.getValores().get(0).getValor(), new BigDecimal(110));
    }

    @Test
    public void testAddValor() {
        Hotel hotel = HotelBuilder.inicializaHotel()
                .comNome("Sesc Palmas")
                .comClassificacao(3)
                .comValor(ValorBuilder.inicializaValor()
                        .comCategoria(CategoriaCliente.Usuario)
                        .comValor(new BigDecimal(115))
                        .comDiaSemana(Boolean.TRUE).build())
                .build();

        Valor valor = ValorBuilder.inicializaValor()
                .comCategoria(CategoriaCliente.Usuario)
                .comValor(new BigDecimal(10))
                .comDiaSemana(Boolean.TRUE).build();

        hotel.addValor(valor);

        assertEquals(hotel.getValores().get(1),valor);
    }

    @Test
    public void testGetClassificacao() {
        Hotel hotel = HotelBuilder.inicializaHotel()
                .comNome("Sesc Palmas")
                .comClassificacao(3)
                .comValor(ValorBuilder.inicializaValor()
                        .comValor(new BigDecimal(110))
                        .comCategoria(CategoriaCliente.Usuario)
                        .comDiaSemana(true).build())
                .comValor(ValorBuilder.inicializaValor()
                        .comValor(new BigDecimal(80))
                        .comCategoria(CategoriaCliente.Comerciario)
                        .comDiaSemana(true).build())
                .comValor(ValorBuilder.inicializaValor()
                        .comValor(new BigDecimal(90))
                        .comCategoria(CategoriaCliente.Usuario)
                        .comDiaSemana(false).build())
                .comValor(ValorBuilder.inicializaValor()
                        .comValor(new BigDecimal(80))
                        .comCategoria(CategoriaCliente.Comerciario)
                        .comDiaSemana(false).build())
                .build();
        Integer classificacao = 3;
        assertEquals(hotel.getClassificacao(), classificacao);
    }

    @Test
    public void testSetClassificacao() {
        Hotel hotel = HotelBuilder.inicializaHotel()
                .comNome("Sesc Palmas")
                .comClassificacao(3)
                .comValor(ValorBuilder.inicializaValor()
                        .comValor(new BigDecimal(110))
                        .comCategoria(CategoriaCliente.Usuario)
                        .comDiaSemana(true).build())
                .comValor(ValorBuilder.inicializaValor()
                        .comValor(new BigDecimal(80))
                        .comCategoria(CategoriaCliente.Comerciario)
                        .comDiaSemana(true).build())
                .comValor(ValorBuilder.inicializaValor()
                        .comValor(new BigDecimal(90))
                        .comCategoria(CategoriaCliente.Usuario)
                        .comDiaSemana(false).build())
                .comValor(ValorBuilder.inicializaValor()
                        .comValor(new BigDecimal(80))
                        .comCategoria(CategoriaCliente.Comerciario)
                        .comDiaSemana(false).build())
                .build();

        Integer classificacao = 5;
        hotel.setClassificacao(5);
        assertEquals(hotel.getClassificacao(), classificacao);
    }

    
    @Test
    public void testEncontrarHotelMaisBarato() {
        List<Hotel> hoteis = new ArrayList<>();
        String filePath = "C:\\Users\\Jhonatan\\Documents\\NetBeansProjects\\DesafioSESC\\src\\main\\java\\com.mycompany.desafiosesc.src\\entradaDeDados.txt";
        
        hoteis.add(HotelBuilder.inicializaHotel()
                .comNome("Sesc Palmas")
                .comClassificacao(3)
                .comValor(ValorBuilder.inicializaValor()
                        .comValor(new BigDecimal(110))
                        .comCategoria(CategoriaCliente.Usuario)
                        .comDiaSemana(true).build())
                .comValor(ValorBuilder.inicializaValor()
                        .comValor(new BigDecimal(80))
                        .comCategoria(CategoriaCliente.Comerciario)
                        .comDiaSemana(true).build())
                .comValor(ValorBuilder.inicializaValor()
                        .comValor(new BigDecimal(90))
                        .comCategoria(CategoriaCliente.Usuario)
                        .comDiaSemana(false).build())
                .comValor(ValorBuilder.inicializaValor()
                        .comValor(new BigDecimal(80))
                        .comCategoria(CategoriaCliente.Comerciario)
                        .comDiaSemana(false).build())
                .build());
        
        hoteis.add(HotelBuilder.inicializaHotel()
                .comNome("Sesc Araguaína")
                .comClassificacao(4)
                .comValor(ValorBuilder.inicializaValor()
                        .comValor(new BigDecimal(160))
                        .comCategoria(CategoriaCliente.Usuario)
                        .comDiaSemana(true).build())
                .comValor(ValorBuilder.inicializaValor()
                        .comValor(new BigDecimal(110))
                        .comCategoria(CategoriaCliente.Comerciario)
                        .comDiaSemana(true).build())
                .comValor(ValorBuilder.inicializaValor()
                        .comValor(new BigDecimal(60))
                        .comCategoria(CategoriaCliente.Usuario)
                        .comDiaSemana(false).build())
                .comValor(ValorBuilder.inicializaValor()
                        .comValor(new BigDecimal(50))
                        .comCategoria(CategoriaCliente.Comerciario)
                        .comDiaSemana(false).build())
                .build());
        
        hoteis.add(HotelBuilder.inicializaHotel()
                .comNome("Sesc Jalapão")
                .comClassificacao(5)
                .comValor(ValorBuilder.inicializaValor()
                        .comValor(new BigDecimal(220))
                        .comCategoria(CategoriaCliente.Usuario)
                        .comDiaSemana(true).build())
                .comValor(ValorBuilder.inicializaValor()
                        .comValor(new BigDecimal(100))
                        .comCategoria(CategoriaCliente.Comerciario)
                        .comDiaSemana(true).build())
                .comValor(ValorBuilder.inicializaValor()
                        .comValor(new BigDecimal(150))
                        .comCategoria(CategoriaCliente.Usuario)
                        .comDiaSemana(false).build())
                .comValor(ValorBuilder.inicializaValor()
                        .comValor(new BigDecimal(40))
                        .comCategoria(CategoriaCliente.Comerciario)
                        .comDiaSemana(false).build())
                .build());
        
        try {
            List<ConversorEntradaDados> entradas = new Leitor(filePath).readLines();
            
            assertEquals(Hotel.encontrarHotelMaisBarato(entradas.get(0), hoteis), hoteis.get(0));
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (UnsupportedEncodingException e) {
            System.err.println(e.getMessage());
        }
    }
}
