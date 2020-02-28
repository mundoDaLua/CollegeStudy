package tp_aula03;

import java.util.Random;
import java.util.Scanner;

public class RandomGame {

    public static void plays(int r) {
        Random random = new Random();

        for (int i = 0; i <= r; i++) {
            // random.nextInt(6)-> random sort of numbers between 0 and 5 included (6 occurrences)
            System.out.println("Generated number is " + (random.nextInt(6) + 1));
        }
    }

    public static void main(String[] args) {

        int rounds;

        Scanner sc = new Scanner(System.in);

        System.out.println("How many rounds do you want? ");
        rounds = sc.nextInt();
        plays(rounds);
    }

}
