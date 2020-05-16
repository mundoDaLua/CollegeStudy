package tp_aula24.visualizacao;

import tp_aula24.modelo.Circulo;
import tp_aula24.modelo.FormaGeometrica;
import tp_aula24.modelo.Quadrado;
import tp_aula24.modelo.Retangulo;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    private int opcao;

    private ArrayList<FormaGeometrica> listaGeometrica = new ArrayList<FormaGeometrica>();
    private Scanner sc = new Scanner(System.in);

    public int getOpcao() {
        return opcao;
    }

    private void adicionarQuadrado() {
        System.out.println("Digite o tamanho do lado do quadrado");
        Quadrado quadrado = new Quadrado(sc.nextDouble());
        listaGeometrica.add(quadrado);
        System.out.println("Quadrado cadastrado com sucesso!");
    }

    private void adicionarRetangulo() {
        System.out.println("Digite o tamanho dos lados do retângulo separados por um espaço");
        Retangulo retangulo = new Retangulo(sc.nextDouble(), sc.nextDouble());
        listaGeometrica.add(retangulo);
        System.out.println("Retângulo cadastrado com sucesso!");
    }

    private void adicionarCirculo() {
        System.out.println("Digite o tamanho do raio do circulo");
        Circulo circulo = new Circulo(sc.nextDouble());
        listaGeometrica.add(circulo);
        System.out.println("Circulo cadastrado com sucesso!");
    }

    public String listar() {
        String lista = "[\n";
        for (int i = 0; i < listaGeometrica.size(); i++) {
            if (i < listaGeometrica.size() - 1) {
                lista += "    " + listaGeometrica.get(i).getFormaGeometrica() + ",\n";
            } else
                lista += "    " + listaGeometrica.get(i).getFormaGeometrica();
        }
        lista += "\n]";
        return lista;
    }

    public void menu() {
        System.out.println("\n##################################");
        System.out.println("# 1. Adicionar Quadrado          #");
        System.out.println("# 2. Adicionar Retângulo         #");
        System.out.println("# 3. Adicionar Circulo           #");
        System.out.println("##################################");
        System.out.println("\nDigite um dos numeros do Menu acima para selecionar uma opção: ");
    }

    public void escolha() {

        opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                adicionarQuadrado();
                break;
            case 2:
                adicionarRetangulo();
                break;
            case 3:
                adicionarCirculo();
                break;
            default:
                System.out.println("Opção invalida, digite novemente...\n");
                menu();
                escolha();
        }
    }
}
