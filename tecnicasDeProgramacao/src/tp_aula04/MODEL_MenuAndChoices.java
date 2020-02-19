package tp_aula04;

import java.util.Scanner;

public class MODEL_MenuAndChoices {

    static int option;

    public static void optionA() {
        System.out.println("Option A selected!\n");
    }

    public static void optionB() {
        System.out.println("Option B selected!\n");
    }

    public static void optionC() {
        System.out.println("Option C selected!\n");
    }

    public static void optionD() {
        System.out.println("Option D selected!\n");
    }

    public static void menu() {
        System.out.println("#####################################################");
        System.out.println("# 1. Option A                                       #");
        System.out.println("# 2. Option B                                       #");
        System.out.println("# 3. Option C                                       #");
        System.out.println("# 4. Option D                                       #");
        System.out.println("# 0. EXIT                                           #");
        System.out.println("#####################################################");
        System.out.println("\nType one of the numbers above to select an option: ");
    }

    public static void choice(){

        Scanner sc = new Scanner(System.in);

        option = sc.nextInt();

//        while (option != 0) {
        switch (option) {
            case 0:
                System.out.println("Obrigado!");
                break;
            case 1:
                optionA();
                break;
            case 2:
                optionB();
                break;
            case 3:
                optionC();
                break;
            case 4:
                optionD();
                break;
            default:
                System.out.println("Invalid option, select another!\n");
        }

    }

    public static void main(String[] args) {

        do {
            menu();
            choice();
        } while (option != 0);

    }

}
