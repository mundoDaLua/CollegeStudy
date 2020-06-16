package fila_circular_vetor;

import java.util.Scanner;

public class Menu {

    private String opcao;

    private FilaCircularVetor filaObjeto = new FilaCircularVetor();
    private Scanner sc = new Scanner(System.in);

    public String getOpcao() {
        return opcao;
    }

    private void adicionar() {
        System.out.println("\nAdicionando um novo Objeto...");
        System.out.println("Qual o nome do Objeto a ser adicionado?");
        Objeto objeto = new Objeto(sc.next());
        filaObjeto.add(objeto);
        System.out.println(objeto.getNome() + " adicionado com sucesso!");
    }

    private void remover() {
        System.out.println("\nRemovendo o primeiro Objeto da Fila...");
        try {
            Objeto objetoRemovido = filaObjeto.remove();
            System.out.println(objetoRemovido.getNome() + " removido com sucesso!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void listarTudo() {
        System.out.println("\nListando todos os objetos da fila...");
        System.out.println(filaObjeto.print());
    }

    public void menu() {
        System.out.println("\n#################################");
        System.out.println("# 1. Adicionar novo Objeto       #");
        System.out.println("# 2. Remover Objeto              #");
        System.out.println("# 3. Listar todos os Objetos     #");
        System.out.println("# 0. SAIR                        #");
        System.out.println("##################################");

        System.out.println("\nDigite um dos numeros do Menu acima para selecionar uma opção: ");
    }

    public void escolha(){

        opcao = sc.next();

        switch (opcao) {
            case "0":
                System.out.println("\nObrigado!");
                break;
            case "1":
                adicionar();
                break;
            case "2":
                remover();
                break;
            case "3":
                listarTudo();
                break;
            default:
                System.out.println("Opção invalida, digite novemente...\n");
        }
    }
}
