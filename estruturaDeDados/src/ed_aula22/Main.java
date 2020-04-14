package ed_aula22;

public class Main {

    public static void main(String[] args) {

        ListaLigadaOrdenada listaFruta = new ListaLigadaOrdenada();

        System.out.println("Vazio? " + listaFruta.isEmpity());
        System.out.println("Tamanho da Lista: " + listaFruta.getTamanho());

        System.out.println("\nCriando a maçã...");
        Fruta maca = new Fruta("Maçã");
        System.out.println("Criando a banana...");
        Fruta banana = new Fruta("Banana");
        System.out.println("Adicionando a maçã na lista...");
        listaFruta.add(maca);
        System.out.println("Adicionando a banana na lista...");
        listaFruta.add(banana);

        System.out.println("\nVazio? " + listaFruta.isEmpity());
        System.out.println("Tamanho da Lista: " + listaFruta.getTamanho());

        System.out.println("\nRemovendo a maçã da lista...");
        System.out.println("Removido da Lista: " + listaFruta.delete(maca));
        System.out.println("Vazio? " + listaFruta.isEmpity());
        System.out.println("Tamanho da Lista: " + listaFruta.getTamanho());

        System.out.println("\nRemovendo a banana da lista...");
        System.out.println("Removido da Lista: " + listaFruta.delete(banana));
        System.out.println("Vazio? " + listaFruta.isEmpity());
        System.out.println("Tamanho da Lista: " + listaFruta.getTamanho());

    }

}
