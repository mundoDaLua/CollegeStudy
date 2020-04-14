package ed_aula25;

public class Node {

    private Fruta atual;
    private Node proximo;

    public Node(Fruta nova) {
        setAtual(nova);
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
