package tp_avaliacao01.Modelo;

public class Produto {

    private String nome;
    private double preco;
    private String status;

    public Produto() {
    }

    public Produto(String nome, double preco, String status) {
        this.nome = nome;
        this.preco = preco;
        this.status = status;
    }
    protected String getNome() {
        return this.nome;
    }

    protected double getPreco() {
        return this.preco;
    }

    protected String getStatus() {
        return this.status;
    }
}
