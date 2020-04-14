package ed_aula25;

import java.util.Scanner;

public class Menu {

    private int opcao;

    private ListaLigadaOrdenada lista = new ListaLigadaOrdenada();
    private Scanner sc = new Scanner(System.in);

    public int getOpcao() {
        return opcao;
    }

    private void adicionar() {
        System.out.println("\nAdicionando uma nova Fruta...");
        System.out.println("Qual a fruta a ser adicionada?");
        Fruta fruta = new Fruta(sc.next());
        try {
            lista.add(fruta);
            System.out.println(fruta.getNome() + " adicionada com sucesso!");
        } catch (Exception e) {
            System.out.println("    Erro: " + fruta.getNome() + " não adicionada, pois ja constava na Lista!");
        }
    }

    private void remover() {
        System.out.println("\nRemovendo uma Fruta da Lista...");
        System.out.println("Qual a fruta a ser removida?");
        String frutaRemovida = lista.delete(new Fruta(sc.next()));
        if (frutaRemovida != null) {
            System.out.println(frutaRemovida + " Removida com sucesso");
        } else {
            System.out.println("Fruta não está presente na Lista!");
        }
    }

    private void buscar() {
        System.out.println("\nBuscando uma Fruta na Lista...");
        System.out.println("Qual a fruta que quer consultar?");
        Fruta fruta = lista.search(new Fruta(sc.next()));
        if (fruta != null) {
            System.out.println(fruta.getNome() + " Presente na Lista!");
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
        System.out.println("# 1. Adicionar nova Fruta        #");
        System.out.println("# 2. Remover Fruta               #");
        System.out.println("# 3. Buscar Fruta                #");
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
