package com.mycompany.desafiosesc.builder;

import com.mycompany.desafiosesc.model.CategoriaCliente;
import com.mycompany.desafiosesc.model.Valor;
import java.math.BigDecimal;

/**
 *
 * @author Jhonatan
 *
 * Classe responsável por criar objetos de Valor
 */
public class ValorBuilder {

    private static ValorBuilder builder;
    private static Valor valor;

    private ValorBuilder() {
    }

    public static ValorBuilder inicializaValor() {
        builder = new ValorBuilder();
        valor = new Valor();
        return builder;
    }

    /**
     * @return Valor caso os campos estejam preenchidos;
     */
    public Valor build() {
        if (valor.getValor() == null || valor.isDiaDeSemana() == null
                || valor.getCategoria() == null) {
            return null;
        }
        return valor;
    }

    public ValorBuilder comValor(BigDecimal vlr) {
        valor.setValor(vlr);
        return builder;
    }

    public ValorBuilder comDiaSemana(Boolean bool) {
        valor.setDiaDeSemana(bool);
        return builder;
    }

    public ValorBuilder comCategoria(CategoriaCliente categoria) {
        valor.setCategoria(categoria);
        return builder;
    }
}
