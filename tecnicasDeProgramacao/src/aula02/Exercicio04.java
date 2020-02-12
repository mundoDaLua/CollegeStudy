package aula02;

public class Exercicio04 {

    public static void main(String[] args) {

        int penultimo = 1;
        int ultimo = 1;
        int fibonacci = ultimo + penultimo;
        System.out.print(penultimo + " " + ultimo + " " + fibonacci);
        for (int i = 3; i <= 30; i++) {
            penultimo = ultimo;
            ultimo = fibonacci;
            fibonacci = penultimo + ultimo;

            System.out.print(" " + fibonacci);
        }
    }
}
