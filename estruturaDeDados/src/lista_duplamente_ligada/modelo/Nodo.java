package lista_duplamente_ligada.modelo;

public class Nodo {

    private Item atual;
    private Nodo proximo;
    private Nodo anterior;

    public Nodo(Item atual) {
        this.anterior = null;
        this.atual = atual;
        this.proximo = null;
    }

    public Item getAtual() {
        return atual;
    }

    public Nodo getProximo() {
        return proximo;
    }
    public void setProximo(Nodo proximo) {
        this.proximo = proximo;
    }

    public Nodo getAnterior() {
        return anterior;
    }
    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }
}
