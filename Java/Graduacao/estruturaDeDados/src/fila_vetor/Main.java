package fila_vetor;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        System.out.println("Qual o tamanho da fila de pessoas? ");
//
//        FilaVetor filaPessoa = new FilaVetor(sc.nextInt());

        FilaVetor filaPessoa = new FilaVetor();
        System.out.println("Vazio? " + filaPessoa.isEmpty());
        System.out.println("Ultimo da fila: " + filaPessoa.peek());
        System.out.println("Saiu o ultimo da fila: " + filaPessoa.remove());

        Pessoa fulano = new Pessoa("Fulano");

        filaPessoa.add(fulano);
        System.out.println("\nVazio? " + filaPessoa.isEmpty());
        System.out.println("Ultimo da fila: " + filaPessoa.peek());
        System.out.println("Saiu o ultimo da fila: " + filaPessoa.remove());
        System.out.println("Vazio? " + filaPessoa.isEmpty());
        System.out.println("Ultimo da fila: " + filaPessoa.peek());

        filaPessoa.add(new Pessoa("Sicrano"));
        filaPessoa.add(new Pessoa("Beltrano"));
        filaPessoa.add(new Pessoa("Alguem"));
        filaPessoa.add(new Pessoa("Ninguem"));
        System.out.println("\nVazio? " + filaPessoa.isEmpty());
        System.out.println("Ultimo da fila: " + filaPessoa.peek());
        System.out.println("Saiu o ultimo da fila: " + filaPessoa.remove());
        System.out.println("Ultimo da fila: " + filaPessoa.peek());
        System.out.println("Saiu o ultimo da fila: " + filaPessoa.remove());
    }
}
