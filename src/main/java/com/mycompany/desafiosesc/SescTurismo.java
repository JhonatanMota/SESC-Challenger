package com.mycompany.desafiosesc;

import com.mycompany.desafiosesc.builder.HotelBuilder;
import com.mycompany.desafiosesc.builder.ValorBuilder;
import com.mycompany.desafiosesc.leitor.ConversorEntradaDados;
import com.mycompany.desafiosesc.leitor.Leitor;
import com.mycompany.desafiosesc.model.CategoriaCliente;
import com.mycompany.desafiosesc.model.Hotel;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Jhonatan
 * @since 17/02/2018
 */
public class SescTurismo {

    private static List<Hotel> hoteis = new ArrayList<>();
    private static String filePath = "";

    public static void main(String[] args) {
        contrutorDeHoteis();

        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite o caminho da entrada de dados:");
            filePath = sc.next();
            List<ConversorEntradaDados> entradas = new Leitor(filePath).readLines();
            for (ConversorEntradaDados entrada : entradas) {
                System.out.println(Hotel.encontrarHotelMaisBarato(entrada, hoteis)
                        + "------------------------------------");
            }
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (UnsupportedEncodingException e) {
            System.err.println(e.getMessage());
        }

    }

    /**
     * Cria instâncias de hoteis com os dados informados na descrição do
     * desafio;
     */
    private static void contrutorDeHoteis() {
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
    }

}
