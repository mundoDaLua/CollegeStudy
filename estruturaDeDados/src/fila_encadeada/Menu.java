package fila_encadeada;

import lista_vetor.Item;
import java.util.Scanner;

public class Menu {

    private int opcao;

    private FilaEncadeada fila = new FilaEncadeada();
    private Scanner sc = new Scanner(System.in);

    public int getOpcao() {
        return opcao;
    }

    private void adicionar() {
        System.out.println("\nAdicionando um novo Item...");
        System.out.println("Qual o Item a ser adicionado?");
        Item item = new Item(sc.next());
        fila.add(item);
        System.out.println(item.getDescricao() + " adicionado com sucesso!");
    }

    private void remover() {
        System.out.println("\nRemovendo o primeiro Item da Fila...");
        String itemRemovido = fila.remove();
        if (itemRemovido != null) {
            System.out.println(itemRemovido + " Removido com sucesso");
        } else {
            System.out.println("Fila está vazia!");
        }
    }


    private void mostrar() {
        System.out.println("\nMostrando o primeiro Item da Fila...");
        System.out.println(fila.peek());
    }

    public void menu() {
        System.out.println("\n##################################");
        System.out.println("# 1. Adicionar novo Item         #");
        System.out.println("# 2. Remover Item                #");
        System.out.println("# 3. Mostrar Item sem Remover    #");
        System.out.println("# 0. SAIR                        #");
        System.out.println("##################################");
        System.out.println("\nDigite um dos numeros do Menu acima para selecionar uma opção: ");
    }

    public void escolha(){

        opcao = sc.nextInt();

        switch (opcao) {
            case 0:
                System.out.println("\nObrigado!");
                break;
            case 1:
                adicionar();
                break;
            case 2:
                remover();
                break;
            case 3:
                mostrar();
                break;
            default:
                System.out.println("Opção invalida, digite novemente...\n");
        }
    }
}
