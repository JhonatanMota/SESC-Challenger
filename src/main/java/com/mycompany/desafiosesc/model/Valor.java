package com.mycompany.desafiosesc.model;

import java.math.BigDecimal;

/**
 *
 * @author Jhonatan
 *
 * Classe utilizada para gerenciar os valores, de acordo com a classe de usuário
 * e dias da semana;
 */
public class Valor {

    private BigDecimal valor;
    private Boolean diaDeSemana;
    private CategoriaCliente categoria;

    public Valor() {
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Boolean isDiaDeSemana() {
        return diaDeSemana;
    }

    public void setDiaDeSemana(Boolean diaDeSemana) {
        this.diaDeSemana = diaDeSemana;
    }

    public CategoriaCliente getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaCliente categoria) {
        this.categoria = categoria;
    }
}
