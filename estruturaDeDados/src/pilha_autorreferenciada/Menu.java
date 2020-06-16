package pilha_autorreferenciada;

import lista_vetor.Item;
import java.util.Scanner;

public class Menu {

    private int opcao;

    private PilhaAutorreferenciada pilha = new PilhaAutorreferenciada();
    private Scanner sc = new Scanner(System.in);

    public int getOpcao() {
        return opcao;
    }

    private void adicionar() {
        System.out.println("\nAdicionando um novo Item...");
        System.out.println("Qual o Item a ser adicionado?");
        Item item = new Item(sc.next());
        pilha.push(item);
        System.out.println(item.getDescricao() + " adicionado com sucesso!");
    }

    private void remover() {
        System.out.println("\nRemovendo uma o ultimo Item da Pilha...");
        String itemRemovido = pilha.pop();
        if (itemRemovido != null) {
            System.out.println(itemRemovido + " Removido com sucesso");
        } else {
            System.out.println("Item não está presente na Pilha!");
        }
    }

    public void menu() {
        System.out.println("\n##################################");
        System.out.println("# 1. Adicionar novo Item         #");
        System.out.println("# 2. Remover Item                #");
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
            default:
                System.out.println("Opção invalida, digite novemente...\n");
        }
    }
}
