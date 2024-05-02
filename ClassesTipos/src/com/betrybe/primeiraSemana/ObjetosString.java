package com.betrybe.primeiraSemana;

public class ObjetosString {
    public static void main(String[] args) {
        StringBuilder frase = new StringBuilder();
        String palavra1= "Bom ";
        String palavra2= "Dia!";
        frase.append(palavra1).append(palavra2);
        frase.deleteCharAt(4);
        System.out.println(frase);
        StringBuilder frase2 = new StringBuilder("bom dia!");
        if (frase.compareTo(frase2) > 0) {
            System.out.println("frases iguais");
         }
        else {
            System.out.println("Frases diferentes");
        }

    }
}
