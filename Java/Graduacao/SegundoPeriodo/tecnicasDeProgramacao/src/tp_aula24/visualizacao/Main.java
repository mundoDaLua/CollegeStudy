package tp_aula24.visualizacao;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();

        System.out.println("Quantas figuras geométricas você deseja criar?");
        int qtdFiguras = sc.nextInt();
        for (int i = 0; i < qtdFiguras; i++) {
            menu.menu();
            menu.escolha();
        }
        System.out.println("\nTodas as " + qtdFiguras + " foram adicionadas...");
        System.out.println("A lista completa de figuras geométricas é:\n");
        System.out.println(menu.listar());;
    }
}
