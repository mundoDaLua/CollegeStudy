package ed_aula22;

public class Main {

    public static void main(String[] args) {

        ListaLigadaDesordenada listaFruta = new ListaLigadaDesordenada();

        System.out.println("Vazio? " + listaFruta.isEmpity());
        System.out.println("Tamanho da Lista: " + listaFruta.getTamanho());
        System.out.println("Mostrando a Lista: " + listaFruta.print());

        System.out.println("\nCriando a maçã...");
        Fruta maca = new Fruta("Maçã");
        System.out.println("Adicionando a " + maca.getNome() + " na lista...");
        try {
            listaFruta.add(maca);
        } catch (Exception e) {
            System.out.println("    Erro: Fruta não adicionada, pois ja constava na Lista!");
        }

        System.out.println("\nCriando a banana...");
        Fruta banana = new Fruta("Banana");
        System.out.println("Adicionando a " + banana.getNome() + " na lista...");
        try {
            listaFruta.add(banana);
        } catch (Exception e) {
            System.out.println("    Erro: Fruta não adicionada, pois ja constava na Lista!");
        }
        System.out.println("Tentando Adicionar a " + banana.getNome() + " na lista denovo...");
        try {
            listaFruta.add(banana);
        } catch (Exception e) {
            System.out.println("    Erro: Fruta não adicionada, pois ja constava na Lista!");
        }

        System.out.println("\nCriando o abacaxi...");
        Fruta abacaxi = new Fruta("Abacaxi");
        System.out.println("Adicionando o " + abacaxi.getNome() + " na lista...");
        try {
            listaFruta.add(abacaxi);
        } catch (Exception e) {
            System.out.println("    Erro: Fruta não adicionada, pois ja constava na Lista!");
        }

        System.out.println("\nCriando o abacate...");
        Fruta abacate = new Fruta("Abacate");
        System.out.println("Adicionando o " + abacate.getNome() + " na lista...");
        try {
            listaFruta.add(abacate);
        } catch (Exception e) {
            System.out.println("    Erro: Fruta não adicionada, pois ja constava na Lista!");
        }

        System.out.println("\nCriando a Mexirica...");
        Fruta mexirica = new Fruta("Mexirica");
        System.out.println("Adicionando a " + mexirica.getNome() + " na lista...");
        try {
            listaFruta.add(mexirica);
        } catch (Exception e) {
            System.out.println("    Erro: Fruta não adicionada, pois ja constava na Lista!");
        }

        System.out.println("\nCriando a laranja...");
        Fruta laranja = new Fruta("Laranja");
        System.out.println("Adicionando a " + laranja.getNome() + " na lista...");
        try {
            listaFruta.add(laranja);
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
