package ed_aula11;

public class Item {

    private String descricao;
    private int quantidade;
    private int prioridade;

    public Item() {
    }

    public Item(String descricao) {
        this.descricao = descricao;
    }

    public Item(String descricao, int quantidade) {
        this.descricao = descricao;
        this.quantidade = quantidade;
    }

    public Item(String descricao, int quantidade, int prioridade) {
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.prioridade = prioridade;
    }


    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getPrioridade() {
        return prioridade;
    }
    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public String getItem() {
        return "Descricao: '" + descricao + '\'' +
                ", Quantidade: " + quantidade +
                ", Prioridade: " + prioridade;
    }

}
