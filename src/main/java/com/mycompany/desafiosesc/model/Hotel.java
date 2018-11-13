package com.mycompany.desafiosesc.model;

import com.mycompany.desafiosesc.leitor.ConversorEntradaDados;
import java.math.BigDecimal;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Jhonatan
 * @since 17/02/2018
 * @version 1.0
 *
 * Classe que mapeia para objetos instâncias de Hoteis
 */
public class Hotel {

    private String nome;
    private List<Valor> valores;
    private Integer classificacao;
    private BigDecimal valorAPagar;

    public Hotel() {
        this.valores = new ArrayList();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Valor> getValores() {
        return valores;
    }

    public void setValores(List<Valor> valores) {
        this.valores = valores;
    }

    public void addValor(Valor valor) {
        this.valores.add(valor);
    }

    public Integer getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(Integer classificacao) {
        this.classificacao = classificacao;
    }

    public static Hotel encontrarHotelMaisBarato(ConversorEntradaDados entrada, List<Hotel> hoteis) {
        for (Hotel hotel : hoteis) {
            hotel.valorAPagar = BigDecimal.ZERO;
            for (Valor valor : hotel.getValores()) {
                if (entrada.getCategoria().equals(valor.getCategoria())) {
                    for (LocalDate data : entrada.getDatas()) {
                        if ((data.getDayOfWeek() == DayOfWeek.SATURDAY
                                || data.getDayOfWeek() == DayOfWeek.SUNDAY)) {
                            if (!valor.isDiaDeSemana()) {
                                hotel.valorAPagar = hotel.valorAPagar.add(valor.getValor());
                            }
                        } else {
                            if (valor.isDiaDeSemana()) {
                                hotel.valorAPagar = hotel.valorAPagar.add(valor.getValor());
                            }
                        }
                    }
                }
            }
        }

        // Ordernando hoteis por valor;
        Collections.sort(hoteis, new Comparator<Hotel>() {
            @Override
            public int compare(Hotel hotel1, Hotel hotel2) {
                if (hotel1.valorAPagar.compareTo(hotel2.valorAPagar) == 0) {
                    return hotel2.classificacao.compareTo(hotel1.classificacao);
                }
                return hotel1.valorAPagar.compareTo(hotel2.valorAPagar);
            }
        });
        System.out.println(entrada.getRow());
        return hoteis.get(0);
    }

    @Override
    public String toString() {
        return "\n Nome: " + this.nome + "\t Valor: " + valorAPagar + "\n";
    }

}
