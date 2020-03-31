package tp_aula13.hospital;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Hospital albertEinstein = new Hospital("Albert Einstein", 5);

        System.out.println("Informe o nome do paciente, em seguida o prognóstico dele");
        Paciente p1 = new Paciente(sc.next(), sc.next());
        albertEinstein.setPaciente(p1);
        System.out.println("Informe o nome do paciente, em seguida o prognóstico dele");
        Paciente p2 = new Paciente(sc.next(), sc.next());
        albertEinstein.setPaciente(p2);
        System.out.println("Informe o nome do paciente, em seguida o prognóstico dele");
        Paciente p3 = new Paciente(sc.next(), sc.next());
        albertEinstein.setPaciente(p3);
        System.out.println("Informe o nome do paciente, em seguida o prognóstico dele");
        Paciente p4 = new Paciente(sc.next(), sc.next());
        albertEinstein.setPaciente(p4);
        System.out.println("Informe o nome do paciente, em seguida o prognóstico dele");
        Paciente p5 = new Paciente(sc.next(), sc.next());
        albertEinstein.setPaciente(p5);

        System.out.println("\nHospital lotado!");
        System.out.println("\nA lista dos pacientes internados são:\n" + albertEinstein.getAla());
    }
}
