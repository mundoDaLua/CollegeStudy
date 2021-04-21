package tp_avaliacao04;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    
    private int opcao;
    
    private ArrayList<Pessoa> listaPessoa = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    
    public int getOpcao() {
        return opcao;
    }
    
    public void adicionarAluno() {
        System.out.println("Adicionando um novo aluno...");
        System.out.println("Qual o nome do aluno?");
        var nome = sc.next();
        System.out.println("Qual o CPF do aluno " + nome + "?");
        var cpf = sc.nextInt();
        System.out.println("Qual a matrícula do aluno " + nome + "?");
        var matricula = sc.nextInt();
        
        Pessoa aluno = new Aluno(nome, cpf, matricula);
        listaPessoa.add(aluno);
    }
    
    public void adicionarProfessor() {
        System.out.println("Adicionando um novo professor...");
        System.out.println("Qual o nome do professor?");
        var nome = sc.next();
        System.out.println("Qual o CPF do professor " + nome + "?");
        var cpf = sc.nextInt();
        System.out.println("Qual o código da matricula ministrada pelo professor " + nome + "?");
        var codMatricula = sc.nextInt();
        
        Pessoa professor = new Professor(nome, cpf, codMatricula);
        listaPessoa.add(professor);
    }
    
    public void adicionarPessoa() {
        System.out.println("Adicionando uma nova pessoa...");
        System.out.println("    [1] Aluno");
        System.out.println("    [2] Professor");
        System.out.println("Digite o número correspondente a pessoa a ser adicionada:");
        int opcaoPessoa = sc.nextInt();
        if (opcaoPessoa == 1) {
            adicionarAluno();
        } else if (opcaoPessoa == 2) {
            adicionarProfessor();
        } else {
            System.out.println("Numero inválido, digite novamente...");
            adicionarPessoa();
        }
    }
    
    public void listar() {
        if (listaPessoa.size() == 0) {
            System.out.println("========================================");
            System.out.println("||    Não há registros cadastrados    ||");
            System.out.println("========================================");
        } else {
            System.out.println("[");
            for (int i = 0; i < listaPessoa.size(); i++) {
                listaPessoa.get(i).listar();
            }
            System.out.println("]");
        }
    }
    
    public void menu() {
        System.out.println("\n _ __ ___   ___ _ __  _   _ \n" +
                "| '_ ` _ \\ / _ \\ '_ \\| | | |\n" +
                "| | | | | |  __/ | | | |_| |\n" +
                "|_| |_| |_|\\___|_| |_|\\__,_|\n");
        System.out.println("\n##################################");
        System.out.println("# 1. Adicionar                   #");
        System.out.println("# 2. Listar                      #");
        System.out.println("# 0. Sair                        #");
        System.out.println("##################################");
        System.out.println("\nDigite um dos numeros do Menu acima para selecionar uma opção: ");
    }
    
    public void escolha() {
        opcao = sc.nextInt();
        
        switch (opcao) {
            case 1:
                adicionarPessoa();
                break;
            case 2:
                listar();
                break;
            case 0:
                System.out.println("Obrigado!");
                System.out.println("                    ____\n" +
                        "                 _.' :  `._\n" +
                        "             .-.'`.  ;   .'`.-.\n" +
                        "    __      / : ___\\ ;  /___ ; \\      __\n" +
                        "  ,'_ \"\"--.:__;\".-.\";: :\".-.\":__;.--\"\" _`,\n" +
                        "  :' `.t\"\"--.. '<@.`;_  ',@>` ..--\"\"j.' `;\n" +
                        "       `:-.._J '-.-'L__ `-- ' L_..-;'\n" +
                        "         \"-.__ ;  .-\"  \"-.  : __.-\"\n" +
                        "             L ' /.------.\\ ' J\n" +
                        "              \"-.   \"--\"   .-\"\n" +
                        "             __.l\"-:_JL_;-\";.__\n" +
                        "          .-j/'.;  ;\"\"\"\"  / .'\\\"-.\n" +
                        "        .' /:`. \"-.:     .-\" .';  `.\n" +
                        "     .-\"  / ;  \"-. \"-..-\" .-\"  :    \"-.\n" +
                        "  .+\"-.  : :      \"-.__.-\"      ;-._   \\\n" +
                        "  ; \\  `.; ;                    : : \"+. ;\n" +
                        "  :  ;   ; ;                    : ;  : \\:\n" +
                        " : `.\"-; ;  ;                  :  ;   ,/;\n" +
                        "  ;    -: ;  :                ;  : .-\"'  :\n" +
                        "  :\\     \\  : ;             : \\.-\"      :\n" +
                        "   ;`.    \\  ; :            ;.'_..--  / ;\n" +
                        "   :  \"-.  \"-:  ;          :/.\"      .'  :\n" +
                        "     \\       .-`.\\        /t-\"\"  \":-+.   :\n" +
                        "      `.  .-\"    `l    __/ /`. :  ; ; \\  ;\n" +
                        "        \\   .-\" .-\"-.-\"  .' .'j \\  /   ;/\n" +
                        "         \\ / .-\"   /.     .'.' ;_:'    ;\n" +
                        "          :-\"\"-.`./-.'     /    `.___.'\n" +
                        "                \\ `t  ._  /      :F_P:\n" +
                        "                 \"-.t-._:'");
                System.out.println("\n  __  __ _______ ______ ______          ____     __\n" +
                        " |  \\/  |__   __|  ____|  _ \\ \\        / /\\ \\   / /\n" +
                        " | \\  / |  | |  | |__  | |_) \\ \\  /\\  / /  \\ \\_/ / \n" +
                        " | |\\/| |  | |  |  __| |  _ < \\ \\/  \\/ /    \\   /  \n" +
                        " | |  | |  | |  | |    | |_) | \\  /\\  /      | |   \n" +
                        " |_|  |_|  |_|  |_|    |____/   \\/  \\/       |_|   \n" +
                        "                                                   ");
            default:
                System.out.println("Opção invalida, digite novemente...\n");
                menu();
                escolha();
                break;
        }
        
    }
    
}
