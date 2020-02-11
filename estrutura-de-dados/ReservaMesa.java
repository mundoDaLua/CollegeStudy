import java.util.Scanner;

public class ReservaMesa {

    public static void main(String[] args) {

        int mesaEscolhida;
        int [] mesaReserva = new int[101];
        int cadeiras;
        int cadeirasTotais = 0;

        Scanner sc = new Scanner(System.in);

        mesaReserva[0] = 0;
        System.out.println("Informe o numero da mesa (de 1 a 100)");
        mesaEscolhida = sc.nextInt();

        if (mesaEscolhida >= 0 || mesaEscolhida < 100) {
            while (mesaEscolhida != 0 || cadeirasTotais > 600) {

                System.out.println("Informe a quantidade de cadeiras a que irá utilizar (de 1 a 6)");
                cadeiras = sc.nextInt();
                if (cadeiras == 0) {
                    mesaReserva[mesaEscolhida] = cadeiras;
                    cadeirasTotais += cadeiras;
                    System.out.println("Reserva realizada com sucesso!");
                } else if (cadeiras <= 6) {
                    mesaReserva[mesaEscolhida] += cadeiras;
                    System.out.println("Reserva realizada com sucesso!");
                    cadeirasTotais += cadeiras;
                } else {
                    System.out.println("Não há lugares suficientes nesta mesa");
                }

                System.out.println("Informe o numero de outra mesa (de 1 a 100)");
                mesaEscolhida = sc.nextInt();

            }
        } else {
            System.out.println("Mesa inválida!");
        }

        System.out.println("Obrigado!");

    }

}