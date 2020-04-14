package ed_aula22;

public class Main {

    public static void main(String[] args) {

        ListaLigadaDesordenada listaFruta = new ListaLigadaDesordenada();

        System.out.println("Vazio? " + listaFruta.isEmpity());
        System.out.println("Tamanho da Lista: " + listaFruta.getTamanho());
        System.out.println("Mostrando a Lista: " + listaFruta.print());

        System.out.println("\nCriando a maçã...");
        Fruta maca = new Fruta("Maçã");
        System.out.println("Adicionando a maçã na lista...");
        try {
            listaFruta.add(maca);
        } catch (Exception e) {
            System.out.println("    Erro: Fruta não adicionada, pois ja constava na Lista!");
        }

        System.out.println("\nCriando a banana...");
        Fruta banana = new Fruta("Banana");
        System.out.println("Adicionando a banana na lista...");
        try {
            listaFruta.add(banana);
        } catch (Exception e) {
            System.out.println("    Erro: Fruta não adicionada, pois ja constava na Lista!");
        }
        System.out.println("Tentando Adicionar a banana na lista denovo...");
        try {
            listaFruta.add(banana);
        } catch (Exception e) {
            System.out.println("    Erro: Fruta não adicionada, pois ja constava na Lista!");
        }

        System.out.println("\nVazio? " + listaFruta.isEmpity());
        System.out.println("Tamanho da Lista: " + listaFruta.getTamanho());
        System.out.println("Mostrando a Lista: " + listaFruta.print());

        System.out.println("\nRemovendo a maçã da lista...");
        System.out.println("Removido da Lista: " + listaFruta.delete(maca));
        System.out.println("Vazio? " + listaFruta.isEmpity());
        System.out.println("Tamanho da Lista: " + listaFruta.getTamanho());
        System.out.println("Mostrando a Lista: " + listaFruta.print());

        System.out.println("\nRemovendo a banana da lista...");
        System.out.println("Removido da Lista: " + listaFruta.delete(banana));
        System.out.println("Vazio? " + listaFruta.isEmpity());
        System.out.println("Tamanho da Lista: " + listaFruta.getTamanho());
        System.out.println("Mostrando a Lista: " + listaFruta.print());

    }

}
