package ed_aula19;

import ed_aula11.Item;

public class Main {

    public static void main(String[] args) {
        FilaEncadeada filaItem = new FilaEncadeada();

        System.out.println("Vazio? " + filaItem.isEmpty());
        System.out.println("Tamanho da Fila: " + filaItem.getTamanhoFila());
        System.out.println("Ultimo da fila: \n" + filaItem.peek());
        System.out.println("Saiu o ultimo da fila: \n" + filaItem.remove());

        Item bolaAzul = new Item("Bola Azul");

        filaItem.add(bolaAzul);
        System.out.println("\nVazio? " + filaItem.isEmpty());
        System.out.println("Tamanho da Fila: " + filaItem.getTamanhoFila());
        System.out.println("Ultimo da fila: \n" + filaItem.peek());
        System.out.println("Saiu o ultimo da fila: \n" + filaItem.remove());
        System.out.println("Vazio? " + filaItem.isEmpty());
        System.out.println("Tamanho da Fila: " + filaItem.getTamanhoFila());
        System.out.println("Ultimo da fila: \n" + filaItem.peek());

        filaItem.add(new Item("Bola Preta"));
        filaItem.add(new Item("Bola Roxa"));
        filaItem.add(new Item("Bola Vermelha"));
        filaItem.add(new Item("Bola Amarela"));
        System.out.println("\nVazio? " + filaItem.isEmpty());
        System.out.println("Tamanho da Fila: " + filaItem.getTamanhoFila());
        System.out.println("Ultimo da fila: \n" + filaItem.peek());
        System.out.println("Saiu o ultimo da fila: \n" + filaItem.remove());
        System.out.println("Ultimo da fila: \n" + filaItem.peek());
        System.out.println("Saiu o ultimo da fila: \n" + filaItem.remove());
        System.out.println("Vazio? " + filaItem.isEmpty());
        System.out.println("Tamanho da Fila: " + filaItem.getTamanhoFila());
    }

}
