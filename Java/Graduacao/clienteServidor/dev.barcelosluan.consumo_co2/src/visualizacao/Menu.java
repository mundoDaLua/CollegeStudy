package visualizacao;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import modelo.Barco;
import modelo.Bicicleta;
import modelo.Carro;
import modelo.Veiculo;

public class Menu {

    private ArrayList<Veiculo> listaVeiculo = new ArrayList<>();
    private Veiculo veiculo = null;
    private Scanner sc = new Scanner(System.in);

    public void init() {
        int quantidade = 0;

        System.out.println("Quantos veículos serão adicionados?");

        try {
            quantidade = Integer.parseInt(sc.next());

            for (int i = 0; i < quantidade; i++) {
                menu();
                escolha();
            }

            imprime();
        } catch (NumberFormatException e) {
            System.out.println("Erro: Não foi informado um valor numérico\n");
            init();
        }
    }

    private void menu() {
        System.out.println("\nAdicionando um novo Veículo...");
        System.out.println("\n##################################");
        System.out.println("# 1. Adicionar Carro             #");
        System.out.println("# 2. Adicionar Barco             #");
        System.out.println("# 3. Adicionar Bicicleta         #");
        System.out.println("##################################");
        System.out.println("\nDigite um dos numeros do Menu acima para selecionar uma opção: ");
    }

    private void escolha() {
        int opcao = 0;

        try {
            opcao = Integer.parseInt(sc.next());;

            switch (opcao) {
                case 1:
                    adicionarCarro();
                    break;
                case 2:
                    adicionarBarco();
                    break;
                case 3:
                    adicionarBicicleta();
                    break;
                default:
                    System.out.println("Opção invalida, digite novemente...\n");
                    menu();
                    escolha();
            }
        } catch (NumberFormatException e) {
            System.out.println("Erro: Não foi informado um valor numérico, digite novamente...\n");
            menu();
            escolha();
        }
    }

    private void imprime() {
        int i = -1;

        System.out.println("\nRelatório de veículos cadastrados:");
        System.out.println("--------------------------------------------");

        if (!listaVeiculo.isEmpty()) {
            for (i = 0; i <= listaVeiculo.size() - 1; i++) {
                Veiculo veiculo = listaVeiculo.get(i);

                System.out.println("\n    Veículo Número "+ (i + 1) + ":");
                System.out.println(veiculo.print(veiculo));

                if (i < listaVeiculo.size() - 1) {
                    System.out.println("    ----------------------------");
                }
            }
        } else {
            System.out.println("\n    Nenhum veículo encontrado!");
        }

        System.out.println("\n--------------------------------------------");

        if (i > 0) {
            System.out.println("Total de Veículos: " + i);
        }

        System.out.println("\nObrigado!");
    }

    private void adicionarCarro() {
        System.out.println("\nAdicionando um novo Carro...");
        System.out.println("Qual o modelo do carro?");
        String modelo = sc.next();
        System.out.println("Qual o motor do carro " + modelo + "?");
        String motor = sc.next();
        System.out.println("Qual a quilometragem do carro " + modelo + "?");
        double quilometragem = sc.nextDouble();

        veiculo = new Carro(modelo, motor, quilometragem);
        listaVeiculo.add(veiculo);
    }

    private void adicionarBarco() {
        System.out.println("\nAdicionando um novo Barco...");
        System.out.println("Qual o modelo do barco?");
        String modelo = sc.next();
        System.out.println("Qual o motor do barco " + modelo + "?");
        String motor = sc.next();
        System.out.println("Qual a quilometragem do barco " + modelo + "?");
        double quilometragem = sc.nextDouble();

        veiculo = new Barco(modelo, motor, quilometragem);
        listaVeiculo.add(veiculo);
    }

    private void adicionarBicicleta() {
        System.out.println("\nAdicionando uma nova Bicicleta...");
        System.out.println("Qual o modelo da bicicleta?");
        String modelo = sc.next();

        veiculo = new Bicicleta(modelo);
        listaVeiculo.add(veiculo);
    }

}
