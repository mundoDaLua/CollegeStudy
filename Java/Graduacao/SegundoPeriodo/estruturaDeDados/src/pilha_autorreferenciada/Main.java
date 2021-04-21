package pilha_autorreferenciada;

public class Main {

    public static void main(String[] args) {

        Menu menu = new Menu();

        do {
            menu.menu();
            menu.escolha();
        } while (menu.getOpcao() != 0);

    }
}
