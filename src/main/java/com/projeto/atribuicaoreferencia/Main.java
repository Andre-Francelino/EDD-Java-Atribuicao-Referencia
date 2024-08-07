package com.projeto.atribuicaoreferencia;

public class Main {

    public static void main(String[] args) {

        int intA = 1;
        int intB = intA;
        System.out.println("intA é = " + intA + "\nintB é = " + intB + "\n");

        intA = 2;
        System.out.println("intA é = " + intA + "\nintB é = " + intB + "\n");


        MeuObjeto objetoA = new MeuObjeto(33);
        MeuObjeto objetoB = objetoA;
        System.out.println("ObjetoA = " + objetoA);
        System.out.println("ObjetoB = " + objetoB);

        objetoA.setNumero(32);
        System.out.println("ObjetoA = " + objetoA);
        System.out.println("ObjetoB = " + objetoB);

    }

}
