package tp_avaliacao03.visualizacao;

import tp_avaliacao03.modelo.Barco;
import tp_avaliacao03.modelo.Bicicleta;
import tp_avaliacao03.modelo.Carro;
import tp_avaliacao03.modelo.Veiculo;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    private int opcao;

    private ArrayList<Veiculo> listaVeiculo = new ArrayList<>();
    private Veiculo veiculo = null;
    private Scanner sc = new Scanner(System.in);

    private void adicionarCarro() {
        System.out.println("\nAdicionando um novo Carro...");
        System.out.println("Qual o tipo do carro?");
        String tipo = sc.next();
        System.out.println("Qual o motor do carro " + tipo + "?");
        String motor = sc.next();
        System.out.println("Qual a quilometragem do carro " + tipo + "?");
        double quilometragem = sc.nextDouble();

        veiculo = new Carro(tipo, motor, quilometragem);
        listaVeiculo.add(veiculo);
    }

    private void adicionarBarco() {
        System.out.println("\nAdicionando um novo Barco...");
        System.out.println("Qual o tipo do barco?");
        String tipo = sc.next();
        System.out.println("Qual o motor do barco " + tipo + "?");
        String motor = sc.next();
        System.out.println("Qual a quilometragem do barco " + tipo + "?");
        double quilometragem = sc.nextDouble();

        veiculo = new Barco(tipo, motor, quilometragem);
        listaVeiculo.add(veiculo);
    }


    private void adicionarBicicleta() {
        System.out.println("\nAdicionando uma nova Bicicleta...");
        System.out.println("Qual o tipo da bicicleta?");
        String tipo = sc.next();
        System.out.println("Qual o motor da bicicleta " + tipo + "?");
        String motor = sc.next();
        System.out.println("Qual a quilometragem da bicicleta " + tipo + "?");
        double quilometragem = sc.nextDouble();

        veiculo = new Bicicleta(tipo, motor, quilometragem);
        listaVeiculo.add(veiculo);
    }

    public void menu() {
        System.out.println("\nAdicionando um novo Veículo...");
        System.out.println("\n##################################");
        System.out.println("# 1. Adicionar Carro             #");
        System.out.println("# 2. Adicionar Barco             #");
        System.out.println("# 3. Adicionar Bicicleta         #");
        System.out.println("##################################");
        System.out.println("\nDigite um dos numeros do Menu acima para selecionar uma opção: ");
    }

    public void escolha() {

        opcao = sc.nextInt();

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
    }

    public void imprime() {
        System.out.println("\nRelatório de veículos cadastrados:");
        System.out.println("--------------------------------------------\n");

        if (!listaVeiculo.isEmpty()) {
            for (int i = 1; i <= listaVeiculo.size(); i++) {
                Veiculo veiculo = listaVeiculo.get(i - 1);
                if (veiculo instanceof Carro) {
                    System.out.println(i + " - Carro: ");
                    System.out.println("    Tipo: " + veiculo.getTipo());
                    System.out.println("    Motor: " + veiculo.getMotor());
                    System.out.println("    Quilometragem: " + ((Carro) veiculo).getQuilometragem());
                    System.out.println("    Emissão de CO2: " + ((Carro) veiculo).calculaEmissao() + "\n");
                } else if (veiculo instanceof Barco) {
                    System.out.println(i + " - Barco: ");
                    System.out.println("    Tipo: " + veiculo.getTipo());
                    System.out.println("    Motor: " + veiculo.getMotor());
                    System.out.println("    Quilometragem: " + ((Barco) veiculo).getQuilometragem());
                    System.out.println("    Emissão de CO2: " + ((Barco) veiculo).calculaEmissao() + "\n");
                } else {
                    System.out.println(i + " - Bicicleta: ");
                    System.out.println("    Tipo: " + veiculo.getTipo());
                    System.out.println("    Motor: " + veiculo.getMotor());
                    System.out.println("    Quilometragem: " + ((Bicicleta) veiculo).getQuilometragem());
                    System.out.println("    Emissão de CO2: " + ((Bicicleta) veiculo).calculaEmissao() + "\n");
                }
            }
        } else {
            System.out.println("    Nenhum registro encontrado");
        }

        System.out.println("\n--------------------------------------------\n");

        System.out.println("Obrigado!");
    }
}
