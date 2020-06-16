package fila_encadeada;

import lista_vetor.Item;

public class FilaEncadeada {

    private Node primeiroFila;
    private Node finalFila;
    private int tamanhoFila;

    // Construtor padrão de uma FilaEncadeada, inicializada com tamanhoFila zero, primeiroFila vazio e finalFila vazio.
    public FilaEncadeada() {
        this.primeiroFila = null;
        this.finalFila = null;
        this.tamanhoFila = 0;
    }

    // Verifica se a FilaEncadeada está vazia
    public boolean isEmpty() {
        return this.primeiroFila == null;
    }

    // Retorna o tamanhoFila
    public int getTamanhoFila() {
        return this.tamanhoFila;
    }

    /*
     * Constroi um Node do Item novo
     * Se a FilaEncadeada estiver vazia, atribui o Node adicionado ao primeiroFila
     * Caso contrario, Atribui o Node adicionado ao Node anterior do finalFila, para ele sempre referenciar o Node que
     * está atraz dele
     * Atribui o Node adicionado ao finalFila
     * Aumenta em uma unidade o tamanhoFila
     */
    public void add(Item novo) {
        Node adicionado = new Node(novo);
        if (isEmpty()) {
            primeiroFila = adicionado;
            finalFila = adicionado;
        } else {
            finalFila.anterior = adicionado;
            finalFila = adicionado;
        }
        tamanhoFila++;
    }

    /*
     * Método auxiliar privado que é usado para remover um Item
     * Se a FilaEncadeada estiver vazia, devolve um erro
     * Atribui ao itemAntigo (Aquele que será desenfileirado) o Item atual que estava no primeiroItem
     * Atribui ao primeiroFila o Item anterior referenciado no Node primeiroItem (removendo o itemAntigo)
     * Reduz o tamanhoPuilha em uma unidade
     * Retorna o itemAntigo
     */
    private Item removeItem() throws Exception {
        if (isEmpty()) {
            throw new Exception("    Erro: A fila está vazia.");
        }
        Item itemAntigo = this.primeiroFila.atual;
        this.primeiroFila = this.primeiroFila.anterior;
        this.tamanhoFila--;
        return itemAntigo;
    }

    // Retorna uma String do conteúdo do itemAntigo removido
    public String remove() {
        try {
            Item itemAntigo = removeItem();
            return "    Nome: " + itemAntigo.getDescricao(); //+
                    //"\n    Quantidade: " + itemAntigo.getQuantidade() +
                    //"\n    Prioridade: " + itemAntigo.getPrioridade();
        } catch (Exception e) {
            return "    Erro: A fila está vazia.";
        }
    }

    // Verifica qual o Item atual da FilaEncadeada sem remove-lo desde que não esteja vazia
    public Item peekItem() throws Exception {
        if (isEmpty()) {
            throw new Exception("    Erro: A fila está vazia.");
        }
        return primeiroFila.atual;
    }

    // Retorna uma String do conteúdo do Item atual do primeiroFila
    public String peek() {
        try {
            Item itemAtual = peekItem();
            return "    Nome: " + itemAtual.getDescricao(); //+
                    //"\n    Quantidade: " + itemAtual.getQuantidade() +
                    //"\n    Prioridade: " + itemAtual.getPrioridade();
        } catch (Exception e) {
            return "    Erro: A fila está vazia.";
        }
    }

}
