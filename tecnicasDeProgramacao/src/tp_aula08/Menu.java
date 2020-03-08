package tp_aula08;

import java.util.Scanner;

public class Menu {
    private static int opcao;
    private static String nome;
    private static String sexo;
    private static String dataNascimento;
    private static double altura;

    private static Scanner sc = new Scanner(System.in);

    private static void opcao1() {
        System.out.println("Criando uma nova pessoa...\n");

        Pessoa p = new Pessoa();

        System.out.println("Qual o nome da pessoa?");
        nome = sc.next();
        p.setNome(nome);
        System.out.println("Qual o sexo do(a) " + p.getNome());
        sexo = sc.next();
        p.setSexo(sexo);
        System.out.println("Qual a data de nascimento do(a) " + p.getNome());
        dataNascimento = sc.next();
        p.setDataNascimento(dataNascimento);
        System.out.println("Qual a altura do(a) " + p.getNome());
        altura = sc.nextDouble();
        p.setAltura(altura);

        System.out.println("Pessoa:\n" +p.getPessoa() + "\nCriado com sucesso!");
    }

    private static void opcao2() {
        // TODO alterar pessoa.nome por este metodo
        System.out.println("Alterando o nome da pessoa...\n");

//        System.out.println("Qual o nome da pessoa?");
//        nome = sc.next();
//        p.setNome(nome);

        System.out.println("Nome alterado com sucesso!");
    }

    private static void opcao3() {
        // TODO alterar pessoa.sexo por este metodo
        System.out.println("Alterando o sexo da pessoa...\n");

//        p.setSexo(sexo);
//        System.out.println("Qual a data de nascimento do(a) " + p.getNome());
//        dataNascimento = sc.next();

        System.out.println("Sexo alterado com sucesso!");
    }

    private static void opcao4() {
        // TODO alterar pessoa.dataNascimento por este metodo
        System.out.println("Alterando a data de nascimento da pessoa...\n");

//        System.out.println("Qual a data de nascimento do(a) " + p.getNome());
//        dataNascimento = sc.next();
//        p.setDataNascimento(dataNascimento);

        System.out.println("Data de nascimento alterada com sucesso!");
    }

    private static void opcao5() {
        // TODO alterar pessoa.altura por este metodo
        System.out.println("Alterando a altura da pessoa...\n");

//        System.out.println("Qual a altura do(a) " + p.getNome());
//        altura = sc.nextDouble();
//        p.setAltura(altura);

        System.out.println("Altura alterada com sucesso!");
    }

    public static void menu() {
        System.out.println("\n#####################################################");
        System.out.println("# 1. Criar uma nova Pessoa                          #");
        System.out.println("# 2. Alterar o nome de uma Pessoa                   #");
        System.out.println("# 3. Alterar o sexo de uma Pessoa                   #");
        System.out.println("# 4. Alterar a data de nascimento de uma Pessoa     #");
        System.out.println("# 4. Alterar a altura de uma Pessoa                 #");
        System.out.println("# 0. SAIR                                           #");
        System.out.println("#####################################################");

        System.out.println("\nDigite o número de uma das opções acima:\n");
        escolha();
    }

    public static void escolha(){

        opcao = sc.nextInt();

        switch (opcao) {
            case 0:
                System.out.println("Obrigado!");
                sc.close();
                break;
            case 1:
                opcao1();
                break;
            case 2:
                opcao2();
                break;
            case 3:
                opcao3();
                break;
            case 4:
                opcao4();
                break;
            case 5:
                opcao5();
                break;
            default:
                System.out.println("Opção inválida. Selecione novamente:\n");
                escolha();
        }

        if (opcao != 0) {
            menu();
        }
    }
}