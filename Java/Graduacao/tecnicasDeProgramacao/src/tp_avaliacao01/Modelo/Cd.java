package tp_avaliacao01.Modelo;

public class Cd extends Midia {

    private int faixas;

    public Cd(int faixas, String artista, String nome, double preco, String status) {
        super(artista, nome, preco, status);
        this.faixas = faixas;
    }

    public void getCd() {
        System.out.print(" [ Nome: " + super.getNome() + ", Artista: " + super.getArtista() + ", Faixas: " + faixas +
                ", Preço: " + super.getPreco() + ", Status: " + super.getStatus() + " ]");
    }
}
