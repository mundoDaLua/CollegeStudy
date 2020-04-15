package tp_avaliacao01.Modelo;

import java.util.ArrayList;

public class Dvd extends Midia {

    private int duracao;
    private ArrayList<Box> box;

    public Dvd(int duracao, String artista, String nome, double preco, String status, ArrayList<Box> box) {
        super(artista, nome, preco, status);
        this.duracao = duracao;
    }

    public void getDvd() {
        System.out.print(" [ Nome: " + super.getNome() + ", Artista: " + super.getArtista() + ", Duração: " + duracao +
                ", Preço: " + super.getPreco() + ", Status: " + super.getStatus() + " ]");
    }
}
