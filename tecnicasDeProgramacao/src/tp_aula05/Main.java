package tp_aula05;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Exemplo da execução da classe Aluno:

        Aluno objAluno = new Aluno();

        objAluno.setNome("Vegita");
        objAluno.setMatricula(1337);
        objAluno.setNota(6.9);

        System.out.println(objAluno.getNome() + "\n" + objAluno.getMatricula() +
                "\n" + objAluno.getNota());
        objAluno.setNota(objAluno.getNota() + 0.6);
        System.out.println();
        System.out.println(objAluno.getNome() + "\n" + objAluno.getMatricula() +
                "\n" + objAluno.getNota());

        System.out.println("\n\n\n");

//      Exemplo da execução da ContaBancaria:

        double valor;
        String resposta;

        Scanner sc = new Scanner(System.in);
        ContaBancaria nuBank = new ContaBancaria("Luan", 8001, 42,
                100);
        ContaBancaria santander = new ContaBancaria("Renan", 18320, 69,
                100000);

        System.out.println(santander.getTitular() + " qual o valor que voce deseja depositar? ");
        valor = sc.nextDouble();
        santander.deposita(valor);
        System.out.println(santander.getTitular() + " seu novo saldo ficou: " + santander.getSaldo());
        System.out.println(santander.getTitular() + " deseja transferir algum valor para " +
                nuBank.getTitular() + " (S/N)?");
        resposta = sc.next().toLowerCase();
        if (resposta.equals("s")) {
            System.out.println("Qual valor?");
            valor = sc.nextDouble();
            santander.transfere(valor, nuBank);
            System.out.println("Transação efetuada com sucesso!");
            System.out.println(santander.getTitular() + " seu novo saldo é de: " +
                    santander.getSaldo());
            System.out.println(nuBank.getTitular() + " recebeu " + valor);
            System.out.println(nuBank.getTitular() + " tem um novo saldo de " +
                    nuBank.getSaldo());
        } else {
            System.out.println("Operação cancelada.");
        }

    }

}
