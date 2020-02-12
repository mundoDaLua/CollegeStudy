package aula03;

import java.util.Scanner;

public class ReservaMesa {

    public static void main(String[] args) {

        int mesaEscolhida;
        int[] mesaReserva = new int[101];
        int mesasTotais = 0;
        int cadeirasEscolhidas;
        int cadeirasTotais = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a mesa que deseja reservar (de 1 a 100) ou ZERO para finalizar");
        mesaEscolhida = sc.nextInt();

        if (mesaEscolhida < 0) {
            System.out.println("Número de mesa inválido");
        } else {
            while (mesaEscolhida > 0 && cadeirasTotais < 600) {
                System.out.println("Informe a quantidade de cadeiras que serão reservadas na mesa " + mesaEscolhida + ":");
                cadeirasEscolhidas = sc.nextInt();
                if (cadeirasEscolhidas <= 0) {
                    System.out.println("Número de cadeiras inválido!");
                } else {
                    if (mesaReserva[mesaEscolhida] + cadeirasEscolhidas > 6) {
                        System.out.println("Número de cadeiras na mesa " + mesaEscolhida + " excede o limite de 6" +
                                " cadeiras por mesa");
                    } else if (mesaReserva[mesaEscolhida] == 0){
                        mesaReserva[mesaEscolhida] += cadeirasEscolhidas;
                        cadeirasTotais += cadeirasEscolhidas;
                        mesasTotais++;
                        System.out.println("Reserva realizada com sucesso!");
                    } else {
                        mesaReserva[mesaEscolhida] += cadeirasEscolhidas;
                        cadeirasTotais += cadeirasEscolhidas;
                        System.out.println("Reserva realizada com sucesso!");
                    }
                }

                System.out.println("\nInforme a mesa que deseja reservar (de 1 a 100) ou ZERO para finalizar");
                mesaEscolhida = sc.nextInt();
            }

            System.out.println("\n-----------------------------------------------------");
            System.out.println("         Sistema fechado para novas reservas         ");
            System.out.println("-----------------------------------------------------\n");

            System.out.println("=====================================================");
            System.out.println("            Relatório de mesas reservadas            ");
            System.out.println("=====================================================\n");

            for (int i = 1; i <= 100; i++) {
                System.out.println("Mesa " + i + ": " + mesaReserva[i] + " Cadeiras;");
            }

            System.out.println("_____________________________________________________");
            System.out.println("Total de mesas utilizadas: " + mesasTotais);
            System.out.println("Total de cadeiras utilizadas: " + cadeirasTotais);

            System.out.println("\n#####################################################");
            System.out.println("##                                                 ##");
            System.out.println("##  Desenvolvido por: luanbarcelos.tech@gmail.com  ##");
            System.out.println("##                                                 ##");
            System.out.println("#####################################################");
        }
    }
}