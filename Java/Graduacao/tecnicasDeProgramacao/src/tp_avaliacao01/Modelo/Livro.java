package tp_avaliacao01.Modelo;

public class Livro extends Produto{

    String autor;
    int paginas;

    public Livro(String autor, int paginas, String nome, double preco, String status) {
        super(nome, preco, status);
        this.autor = autor;
        this.paginas = paginas;
    }

    public void getLivro() {
        System.out.print(" [ Nome: " + super.getNome() + ", Autor: " + autor + ", Paginas: " + paginas + ", Preço: " +
                super.getPreco() + ", Status: " + super.getStatus() + " ]");
    }
}
