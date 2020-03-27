package ed_aula19;

import ed_aula11.Item;

public class Node {

    // Item atual do Nó
    Item atual;
    // Item anterior ao Nó
    Node anterior;

    // Construtor de um Node que recebe um Item novo e atribui ele ao atual e nulo ao anteior
    public Node (Item novo) {
        this.atual = novo;
        this.anterior = null;
    }

}
