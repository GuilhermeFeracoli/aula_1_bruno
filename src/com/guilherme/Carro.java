package com.guilherme;

public class Carro {
    String nomeDoCarro;
    short anoDoCarro;
    Marca marcaDoCarro;
    boolean quitado;

    @Override
    public String toString() {
        return "Dados do Carro:\n" +
                "Nome do Carro: " + nomeDoCarro + "\n" +
                "Ano do Carro: " + anoDoCarro + "\n" +
                "Marca do Carro: " + marcaDoCarro + "\n" +
                "O carro está quitado?: " + quitado;
    }
}
