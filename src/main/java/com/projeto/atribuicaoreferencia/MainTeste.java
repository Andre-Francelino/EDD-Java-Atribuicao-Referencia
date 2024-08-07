package com.projeto.atribuicaoreferencia;

public class MainTeste {
    public static void main(String[] args) {

        int a = 5;
        int b = a; // b atribuindo o mesmo valor de a
        System.out.println("valor da variável A: " + a);
        System.out.println("valor da variável B: " + b);

        b = 10; // atribuindo outro valor para b
        System.out.println("valor da variável A: " + a);
        System.out.println("valor da variável B: " + b);
        System.out.println("A e B são valores de tipos primitivos e são independentes após a atribuição.");

        Pessoa pessoa1 = new Pessoa("Bruna");
        Pessoa pessoa2 = pessoa1;

        System.out.println("Pessoa1 é: " + pessoa1);
        System.out.println("Pessoa2 é: " + pessoa2);

        pessoa2.nome = "Julia";
        System.out.println("Pessoa1 agora é: " + pessoa1);
        System.out.println("Pessoa2 agora é: " + pessoa2);

    }
}
