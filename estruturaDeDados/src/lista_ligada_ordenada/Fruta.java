package lista_ligada_ordenada;

public class Fruta {

    private String nome;
    private int quantidade;

    public Fruta(String nome) {
        setNome(nome);
        setQuantidade(1);
    }

    public Fruta(String nome, int quantidade) {
        setNome(nome);
        setQuantidade(quantidade);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
