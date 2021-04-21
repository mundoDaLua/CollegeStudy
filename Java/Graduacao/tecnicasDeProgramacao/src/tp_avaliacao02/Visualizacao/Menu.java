package tp_avaliacao02.Visualizacao;

import tp_avaliacao02.Modelo.Consulta;
import tp_avaliacao02.Modelo.Funcionario;
import tp_avaliacao02.Modelo.Medico;
import tp_avaliacao02.Modelo.Psicologo;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    private int opcao;

    private ArrayList<Consulta> agendaMedico = new ArrayList<Consulta>();
    private ArrayList<Consulta> agendaPsicologo = new ArrayList<Consulta>();
    private Funcionario medico = null;
    private Funcionario psicologo = null;
    private Scanner sc = new Scanner(System.in);

    public int getOpcao() {
        return opcao;
    }

    private void adicionarFuncionario() {
        System.out.println("\nAdicionando um novo Funcionário...");
        System.out.println("\n##################################");
        System.out.println("# 1. Adicionar Médico            #");
        System.out.println("# 2. Adicionar Psicólogo         #");
        System.out.println("# 0. VOLTAR                      #");
        System.out.println("##################################");
        System.out.println("\nDigite um dos numeros do Menu acima para selecionar uma opção: ");

        int opcao = sc.nextInt();

        if (opcao == 1) {
            adicionarMedico();
        } else if (opcao == 2) {
            adicionarPsicologo();
        } else if(opcao == 0) {
            menu();
            escolha();
        } else {
            System.out.println("Opção inválida, selecione novamente...");
            menu();
            escolha();
        }
    }

    private void adicionarMedico() {
        System.out.println("\nAdicionando um novo Médico...");
        System.out.println("Qual o nome do Médico?");
        String nome = sc.next();
        System.out.println("Qual o CRM do Médico " + nome + "?");
        int crm = sc.nextInt();
        System.out.println("Qual o código do Médico " + nome + "?");
        String codigo = sc.next();

        medico = new Medico(crm, nome, codigo);
        ((Medico) medico).setAgenda(agendaMedico);
    }

    private void adicionarPsicologo() {
        System.out.println("\nAdicionando um novo Psicólogo...");
        System.out.println("Qual o nome do Psicólogo?");
        String nome = sc.next();
        System.out.println("Qual o CRP do Psicólogo " + nome + "?");
        int crp = sc.nextInt();
        System.out.println("Qual o código do Psicólogo " + nome + "?");
        String codigo = sc.next();

        psicologo = new Psicologo(crp, nome, codigo);
        ((Psicologo) psicologo).setAgenda(agendaPsicologo);
    }

    private void cadastrarConsulta() {
        System.out.println("\nAgendando uma nova Consulta...");
        System.out.println("\n##################################");
        System.out.println("# 1. Consuta Médico              #");
        System.out.println("# 2. Consulta Psicólogo          #");
        System.out.println("# 0. VOLTAR                      #");
        System.out.println("##################################");
        System.out.println("\nDigite um dos numeros do Menu acima para selecionar uma opção: ");

        int opcao = sc.nextInt();

        if (opcao == 1) {
            consultaMedico();
        } else if (opcao == 2) {
            consultaPsicologo();
        } else if (opcao == 0){
            menu();
            escolha();
        } else {
            System.out.println("Opção inválida, selecione novamente...");
            menu();
            escolha();
        }
    }

    private void consultaMedico() {
        System.out.println("Cadastrando uma nova consulta ao Médico...");
        System.out.println("Qual o nome do Paciente que será consultado?");
        String nome = sc.next();
        System.out.println("Qual o horário da Consulta do paciente " + nome + "?");
        String hora = sc.next();

        Consulta consulta = new Consulta(nome, hora);
        agendaMedico.add(consulta);
    }

    private void consultaPsicologo() {
        System.out.println("Cadastrando uma nova consulta ao Psicólogo...");
        System.out.println("Qual o nome do Paciente que será consultado?");
        String nome = sc.next();
        System.out.println("Qual o horário da Consulta do paciente " + nome + "?");
        String hora = sc.next();

        Consulta consulta = new Consulta(nome, hora);
        agendaPsicologo.add(consulta);
    }

    private void consultarAgenda() {
        System.out.println("\nListando os Agendamentos...");
        System.out.println("\n##################################");
        System.out.println("# 1. Agenda Médico               #");
        System.out.println("# 2. Agenda Psicólogo            #");
        System.out.println("# 0. VOLTAR                      #");
        System.out.println("##################################");
        System.out.println("\nDigite um dos numeros do Menu acima para selecionar uma opção: ");

        int opcao = sc.nextInt();

        if (opcao == 1) {
            agendaMedico();
        } else if (opcao == 2) {
            agendaPsicologo();
        } else if (opcao == 0){
            menu();
            escolha();
        } else {
            System.out.println("Opção inválida, selecione novamente...");
            menu();
            escolha();
        }
    }

    private void agendaMedico() {
        if (medico instanceof Medico) {
            if (((Medico) medico).getAgenda().size() == 0) {
                System.out.println("O Médico não tem consultas agendadas...");
            } else {
                System.out.println("A agenda do Médico é:");
                for (int i = 0; i < ((Medico) medico).getAgenda().size(); i++) {
                    System.out.println("Nome: " + ((Medico) medico).getAgenda().get(i).getPacienteNome() +
                            ", Hora da consulta: " + ((Medico) medico).getAgenda().get(i).getHora());
                }
            }
        } else {
            System.out.println("Não consta Médico válido...");
        }
    }

    private void agendaPsicologo() {
        if (psicologo instanceof Psicologo) {

            System.out.println(((Psicologo) psicologo).getAgenda().size());

            if (((Psicologo) psicologo).getAgenda().size() == 0) {
                System.out.println("O Psicólogo não tem consultas agendadas...");
            } else {
                System.out.println("A agenda do Psicologo é:");
                for (int i = 0; i < ((Psicologo) psicologo).getAgenda().size(); i++) {
                    System.out.println("Nome: " + ((Psicologo) psicologo).getAgenda().get(i).getPacienteNome() +
                            ", Hora da consulta: " + ((Psicologo) psicologo).getAgenda().get(i).getHora());
                }
            }
        } else {
            System.out.println("Não consta Psicólogo válido...");
        }
    }

    public void menu() {
        System.out.println("\n##################################");
        System.out.println("# 1. Cadastrar Funcionário       #");
        System.out.println("# 2. Cadastrar Consulta          #");
        System.out.println("# 3. Listar Agendamentos         #");
        System.out.println("# 0. SAIR                        #");
        System.out.println("##################################");
        System.out.println("\nDigite um dos numeros do Menu acima para selecionar uma opção: ");
    }

    public void escolha() {

        opcao = sc.nextInt();

        switch (opcao) {
            case 0:
                System.out.println("\nObrigado!");
                break;
            case 1:
                adicionarFuncionario();
                break;
            case 2:
                cadastrarConsulta();
                break;
            case 3:
                consultarAgenda();
                break;
            default:
                System.out.println("Opção invalida, digite novemente...\n");
        }
    }
}