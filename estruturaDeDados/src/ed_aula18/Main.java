package ed_aula18;

import ed_aula19.Menu;

public class Main {

    public static void main(String[] args) {

        Menu menu = new Menu();

        do {
            menu.menu();
            menu.escolha();
        } while (menu.getOpcao() != 0);

    }
}
