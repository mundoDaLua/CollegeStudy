package lista_duplamente_ligada.visualisacao;

import lista_duplamente_ligada.modelo.Item;
import lista_duplamente_ligada.modelo.ListaDuplamenteLigada;
import lista_duplamente_ligada.controle.ManipularArquivo; // TODO
import java.util.Scanner;

public class Menu {

    private int opcao;

    private ListaDuplamenteLigada lista = new ListaDuplamenteLigada();
    private Scanner sc = new Scanner(System.in);

    public int getOpcao() {
        return opcao;
    }

    private void adicionarEsquerda() {
        System.out.println("\nAdicionando um novo Item no inicio da Lista...");
        System.out.println("Qual o nome do item a ser adicionado?");
        String nome = sc.next();
        System.out.println("Qual a quantidade de " + nome + "?");
        int quantidade = sc.nextInt();
        Item item = new Item(nome, quantidade);
        try {
            lista.addLeft(item);
            System.out.println(item.getNome() + " adicionado com sucesso!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    // TODO
    private void adicionarDireita() {
        System.out.println("Metodo em Desenvolvimento... Utilize o \"Adicionar a Esquerda \"");
//        System.out.println("\nAdicionando um novo Item no final da Lista...");
//        System.out.println("Qual o nome do item a ser adicionado?");
//        String nome = sc.next();
//        System.out.println("Qual a quantidade de " + nome + "?");
//        int quantidade = sc.nextInt();
//        Item item = new Item(nome, quantidade);
//        try {
//            lista.addRight(item);
//            System.out.println(item.getNome() + " adicionado com sucesso!");
//        } catch (Exception e) {
//            System.out.println(e.getCause());
//        }
    }

    private void remover() {
        System.out.println("\nRemovendo um item da Lista...");
        System.out.println("Qual o nome do item a ser removido?");
        Item item = new Item(sc.next());
        try {
            lista.delete(item);
            System.out.println(item.getNome() + " removido com sucesso");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void buscar() {
        System.out.println("\nBuscando um item na Lista...");
        System.out.println("Qual o nome do item que deseja consultar?");
        Item item = lista.search(new Item(sc.next()));
        if (item != null){
            System.out.println(item.getNome() + " Presente na Lista!");
            System.out.println("Item: {");
            System.out.println("    Nome: " + item.getNome() + ",");
            System.out.println("    Quantidade: " + item.getQuantidade());
            System.out.println("}");
        } else {
            System.out.println("    Erro ao Buscar: O item não consta na Lista!");
        }
    }

    private void mostrar() {
        System.out.println("\nMostrando todas os Itens da Lista...");
        System.out.println(lista.print());
    }

    public void menu() {
        System.out.println("\n###################################");
        System.out.println("# 1. Adicionar Item a Esquerda    #");
        System.out.println("# 2. Adicionar Item a Direita     #");
        System.out.println("# 3. Remover Item                 #");
        System.out.println("# 4. Buscar Item                  #");
        System.out.println("# 5. Mostrar a Lista              #");
        System.out.println("# 0. SAIR                         #");
        System.out.println("###################################");
        System.out.println("\nDigite um dos numeros do Menu acima para selecionar uma opção: ");
    }

    public void escolha(){

        opcao = sc.nextInt();

        switch (opcao) {
            case 0:
                System.out.println("\nObrigado!");
                break;
            case 1:
                adicionarEsquerda();
                break;
            case 2:
                adicionarDireita();
                break;
            case 3:
                remover();
                break;
            case 4:
                buscar();
                break;
            case 5:
                mostrar();
                break;
            default:
                System.out.println("Opção invalida, digite novemente...\n");
        }
    }

}
