package ed_aula22;

public class Node {

    private Fruta atual;
    private Node proximo;

    public Node(Fruta fruta) {
        setAtual(fruta);
        setProximo(null);
    }

    public Fruta getAtual() {
        return atual;
    }
    public void setAtual(Fruta atual) {
        this.atual = atual;
    }

    public Node getProximo() {
        return proximo;
    }
    public void setProximo(Node proximo) {
        this.proximo = proximo;
    }
}
