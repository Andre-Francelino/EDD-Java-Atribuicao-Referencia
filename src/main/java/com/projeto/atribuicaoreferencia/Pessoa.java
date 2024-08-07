package com.projeto.atribuicaoreferencia;

public class Pessoa {

    String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return this.nome.toString();
    }

}
