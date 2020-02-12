package aula02;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        double serie = 1;
        double numero;
        int denominador;

        Scanner sc = new Scanner(System.in);

        denominador = sc.nextInt();

        if (denominador == 0) {
            System.out.println("Não se executa divisão por ZERO!");
        } else {
            for (int i = 2; i <= denominador; i++) {
                numero = 1.0/i;
                serie += numero;
            }

            System.out.println(serie);
        }
    }
}
