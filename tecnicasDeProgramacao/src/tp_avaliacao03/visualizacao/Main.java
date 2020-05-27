package tp_avaliacao03.visualizacao;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();

        System.out.println("Quantos veículos serão adicionados?");

        int quantidade = sc.nextInt();

        for (int i = 0; i < quantidade; i++) {
            menu.menu();
            menu.escolha();
        }

        menu.imprime();
    }
}
