package com.guilherme;
import java.util.Arrays;
import java.util.List;
public class Teste {
    public static void main(String[] args) {
        Carro primeiro = new Carro();
        primeiro.nomeDoCarro = "Corolla";
        primeiro.anoDoCarro = 2012;
        primeiro.marcaDoCarro = Marca.TOYOTA;
        primeiro.quitado = true;

        Carro segundo = new Carro();
        segundo.nomeDoCarro = "Fit";
        segundo.anoDoCarro = 2018;
        segundo.marcaDoCarro = Marca.HONDA;
        segundo.quitado = false;

        Carro terceiro = new Carro();
        terceiro.nomeDoCarro = "Astra";
        terceiro.anoDoCarro = 2011;
        terceiro.marcaDoCarro = Marca.CHEVROLET;
        terceiro.quitado = true;

        System.out.println(primeiro);
        System.out.println(segundo);
        System.out.println(terceiro);
    }
}