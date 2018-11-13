package com.mycompany.desafiosesc.model;

/**
 *
 * @author Jhonatan
 * @since 18/02/2018
 * Enum para gerenciar os tipos de clientes;
 */
public enum CategoriaCliente {
    Usuario("Usuário"), Comerciario("Comerciário");

    private final String descricao;

    private CategoriaCliente(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
