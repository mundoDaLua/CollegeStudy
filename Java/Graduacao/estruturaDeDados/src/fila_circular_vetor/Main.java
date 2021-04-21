package fila_circular_vetor;

public class Main {

    public static void main(String[] args) {

        Menu menu = new Menu();

        do {
            menu.menu();
            menu.escolha();
        } while (!menu.getOpcao().equals("0"));

    }
}
