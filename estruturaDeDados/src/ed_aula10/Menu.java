package ed_aula10;

import java.util.Scanner;

public class Menu {

    private int opcao;

    private FilaVetor fila = new FilaVetor();
    private Scanner sc = new Scanner(System.in);

    public int getOpcao() {
        return opcao;
    }

    private void adicionar() {
        System.out.println("\nAdicionando uma nova Pessoa...");
        System.out.println("Qual o nome da Pessoa a ser adicionada?");
        Pessoa pessoa = new Pessoa(sc.next());
        fila.add(pessoa);
        System.out.println(pessoa.getNome() + " adicionada com sucesso!");
    }

    private void remover() {
        System.out.println("\nRemovendo a primeira Pessoa da Fila...");
        String itemRemovido = fila.remove();
        if (itemRemovido != null) {
            System.out.println(itemRemovido + " Removido com sucesso");
        } else {
            System.out.println("Fila está vazia!");
        }
    }

    private void mostrar() {
        System.out.println("\nMostrando a primeira Pessoa da Fila...");
        System.out.println(fila.peek());
    }

    public void menu() {
        System.out.println("\n#################################");
        System.out.println("# 1. Adicionar nova Pessoa       #");
        System.out.println("# 2. Remover Pessoa              #");
        System.out.println("# 3. Mostrar Pessoa sem Remover  #");
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
