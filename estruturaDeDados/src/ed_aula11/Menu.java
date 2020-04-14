package ed_aula11;

import java.util.Scanner;

public class Menu {

    private int opcao;

    private ListaDesordenadaVetor lista = new ListaDesordenadaVetor();
    private Scanner sc = new Scanner(System.in);

    public int getOpcao() {
        return opcao;
    }

    private void adicionar() {
        System.out.println("\nAdicionando um novo Item...");
        System.out.println("Qual o Item a ser adicionada?");
        Item item = new Item(sc.next());
        if (!lista.isFull()) {
            lista.add(item);
            System.out.println(item.getDescricao() + " adicionada com sucesso!");
        } else {
            System.out.println("    Erro: " + item.getDescricao() + " não adicionado, pois a Lista está cheia!");
        }
    }

    private void remover() {
        System.out.println("\nRemovendo um Item da Lista...");
        System.out.println("Qual o item a ser removida?");
        Item itemRemovido = lista.delete(new Item(sc.next()));
        if (itemRemovido != null) {
            System.out.println(itemRemovido.getDescricao() + " Removida com sucesso");
        } else {
            System.out.println("Item não está presente na Lista!");
        }
    }

    private void buscar() {
        System.out.println("\nBuscando um Item na Lista...");
        System.out.println("Qual p Item que você quer consultar?");
        Item item = lista.get(new Item(sc.next()));
        if (item != null) {
            System.out.println(item.getDescricao()+ " Presente na Lista!");
        } else {
            System.out.println("Fruta não está presente na Lista!");
        }
    }

    private void mostrar() {
        System.out.println("\nMostrando todas as Frutas da Lista...");
        System.out.println(lista.print());
    }

    public void menu() {
        System.out.println("\n##################################");
        System.out.println("# 1. Adicionar novo Item         #");
        System.out.println("# 2. Remover Item                #");
        System.out.println("# 3. Buscar Item                 #");
        System.out.println("# 4. Mostrar toda a Lista        #");
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
                buscar();
                break;
            case 4:
                mostrar();
                break;
            default:
                System.out.println("Opção invalida, digite novemente...\n");
        }
    }
}
