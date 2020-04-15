package tp_avaliacao01.Modelo;

import java.util.ArrayList;

public class Dvd extends Midia {

    private int duracao;
    private ArrayList<Box> box;

    public Dvd(int duracao, String artista, String nome, double preco, String status, ArrayList<Box> box) {
        super(artista, nome, preco, status);
        this.duracao = duracao;
        this.box = box;
    }

    public void getDvd() {
        String box = "[ ";
        for (int i = 0; i < this.box.size(); i++) {
            if (i < this.box.size() - 1) {
                box += this.box.get(i).getTitulo() + ", ";
            } else {
                box += this.box.get(i).getTitulo() + " ]";
            }

        }
        System.out.println("TAMANHO DO BOX: " + this.box.size());
        System.out.print(" [ Nome: " + super.getNome() + ", Distribuidos no(s) Box(s): " + box + ", Artista: " +
                super.getArtista() + ", Duração: " + duracao + ", Preço: " + super.getPreco() + ", Status: " +
                super.getStatus() + " ]");
    }
}
