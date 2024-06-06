package com.jvneves.desafio.dominio;

import lombok.Data;

@Data
public abstract class Conteudo {
    protected static final double XP_PADRAO = 10;

    protected String titulo;
    protected String descricao;

    public abstract double calcularXp();

}
