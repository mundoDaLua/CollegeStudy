package aula02;

public class Exercicio01 {

    public static void somar() {
        int soma = 0;

        for (int i = 1; i <= 100; i++) {
            soma += i;
        }

        System.out.println(soma);
    }

    public static void main(String[] args) {
        somar();
    }

}

