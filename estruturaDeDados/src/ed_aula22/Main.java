package ed_aula22;

public class Main {

    public static void main(String[] args) {

        ListaLigadaDesordenada listaFruta = new ListaLigadaDesordenada();

        System.out.println("Vazio? " + listaFruta.isEmpity());
        System.out.println("Tamanho da Lista: " + listaFruta.getTamanho());

        Fruta maca = new Fruta("Maçã");
        Fruta banana = new Fruta("Banana");
        listaFruta.add(maca);
        listaFruta.add(banana);
        System.out.println("Vazio? " + listaFruta.isEmpity());
        System.out.println("Tamanho da Lista: " + listaFruta.getTamanho());
        System.out.println("Removido da Lista: " + listaFruta.delete(maca));
        System.out.println("Vazio? " + listaFruta.isEmpity());
        System.out.println("Tamanho da Lista: " + listaFruta.getTamanho());
        System.out.println("Removido da Lista: " + listaFruta.delete(banana));
        System.out.println("Vazio? " + listaFruta.isEmpity());
        System.out.println("Tamanho da Lista: " + listaFruta.getTamanho());

    }

}
