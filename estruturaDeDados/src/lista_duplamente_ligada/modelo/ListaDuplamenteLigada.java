package lista_duplamente_ligada.modelo;

/**
 * Na Lista Duplamente Ligada, cada Nó (Node/Nodo) aponta tanto para o anterior, quanto para o posterior<br><br>
 * Permite o percurso em ambas as direções<br>
 * Permite a inserção no inicio e no fim<br>
 * Permite a remoção no inicio e no fim<br>
 *
 * @author barcelosluan
 * @version 0.1.0
 */
public class ListaDuplamenteLigada {

    private Nodo esquerda;
    //private Nodo direita;
    private int quantidade;

    public ListaDuplamenteLigada() {
        esquerda = null;
        //direita = null;
        quantidade = 0;
    }

    public boolean isEmpity() {
        return (esquerda == null /*&& direita == null*/);
    }

    /** Busca Linear da esquerda para a direita na ListaDuplamenteLigada */
    public Item search(Item item) /*throws Exception*/ {
        if (isEmpity()) {
            return null;
//            throw new Exception("    Erro ao Buscar: Lista vazia!");
        }

        Nodo itemAtual;
        for (itemAtual = esquerda;
             itemAtual != null && !itemAtual.getAtual().getNome().equals(item.getNome());
             itemAtual = itemAtual.getProximo());

        if (itemAtual == null) {
//            throw new Exception("    Erro ao Buscar: O item não consta na Lista!");
            return null;
        }
        return itemAtual.getAtual();
    }

    /**
     * Procura se o Item jaTinha na ListaDuplamenteLigada
     * Se encontrar
     *      retorna um Erro
     * Caso contrario
     *      constroi um Nodo novo do novoItem
     *
     * Se a ListaDuplamenteLigada estiver vazia
     *      Atribui o Nodo novo ao Nodo esquerda
     * Caso contrario
     *      Atribui o Nodo novo ao Nodo proximo do Nodo esquerda
     *      Atribui o Nodo esquerda ao Nodo anterior do Nodo novo
     *      Atribui o Nodo novo ao Nodo esquerda
     */
    public void addLeft(Item novoItem) throws Exception {
        Item jaTinha = search(novoItem);
        if (jaTinha != null) {
            throw new Exception("    Erro ao Addicionar: O item está na Lista!");
        }

        Nodo novo = new Nodo(novoItem);
        if (isEmpity()) {
            esquerda = novo;
            //direita = novo;
        } else {
            novo.setProximo(esquerda);
            esquerda.setAnterior(novo);
            esquerda = novo;
        }
        
        quantidade++;
    }
    
    /**
     * TODO Adicionar a Direita
     * Procura se o Item jaTinha na ListaDuplamenteLigada
     * Se encontrar
     *      retorna um Erro
     * Caso contrario
     *      constroi um Nodo novo do novoItem
     *
     * Se a ListaDuplamenteLigada estiver vazia
     *      Atribui o Nodo novo ao Nodo direita
     * Caso contrario
     *      Atribui o Nodo novo ao Nodo anterior do Nodo direita
     *      Atribui o Nodo direita ao Nodo proximo do Nodo novo
     *      Atribui o Nodo novo ao Nodo direita
     */
//    public void addRight(Item novoItem) throws Exception {
//        Item jaTinha = search(novoItem);
//        if (jaTinha != null) {
//            throw new Exception("    Erro ao Adicionar: O item já está na Lista!");
//        }
//
//        Nodo novo = new Nodo(novoItem);
//        if (isEmpity()) {
//            direita = novo;
//            esquerda = novo;
//        } else {
//            direita.setAnterior(novo);
//            novo.setProximo(direita);
//            direita = novo;
//        }
//
//        quantidade++;
//    }
    
    /**
     * Método de Remoção de um Item
     *
     * Se a ListaDuplamenteLigada está vazia
     *      retorna um erro
     * Caso contrario
     *      Cria Nodos auxiliares (itemAtual e itemProximo) e Item auxiliar (itemDeletado) para encontrar o Item
     *      Se a busca nao encontrar (itemAtual == null) retorna um erro
     *      Se a busca encontrar (item == itemAtual.atual) o itemDeletado recebe o itemAtual.atual
     *
     * Na terceira parte do metodo delete, faz o tratamento para que a ListaDuplamenteLigada nao tenha "buracos"
     * pois caso tenham espaços vazios, os Itens deixam de estar ligados, parando de funcionar a classe
     *
     * Se os Nodos auxiliares forem iguais
     *      o Nodo esquerda vai passar a referenciar o Nodo esquerda.proximo
     *      o Nodo esquerda.anterior vai passar a apontar para ninguem, visto que ele foi removido
     * Caso contrario
     *      o itemAnterior passa a apontar para o itemAtual
     *      o itemAnterior.anterior passa a aponar para ninguem, visto que ele foi removido
     *
     * Retorna o itemDeletado
     */
    public String delete(Item item) throws Exception {
        if (isEmpity()) {
            throw new Exception("    Erro ao Deletar: Lista vazia!");
        }
        
        Nodo itemAtual;
        Nodo itemAnterior;
        Item itemDeletado;
        
        for (itemAtual = esquerda, itemAnterior = esquerda;
             itemAtual != null && !itemAtual.getAtual().getNome().equals(item.getNome());
             itemAnterior = itemAtual, itemAtual = itemAtual.getProximo());
        
        if (itemAtual == null) {
            throw new Exception("    Erro ao Deletar: O item não consta na Lista!");
        }
        itemDeletado = itemAtual.getAtual();
        
        if (itemAtual == itemAnterior) {
            esquerda = esquerda.getProximo();
            esquerda.setAnterior(null);
        } else {
            itemAnterior.setProximo(itemAtual.getProximo());
            itemAnterior.setAnterior(null);
        }
        
        quantidade--;
        return itemDeletado.getNome();
    }
    
    /** Informa todas os Itens presentes na ListaDuplamenteLigada */
    public String print() {
        if (isEmpity()) {
            return "Lista Vazia";
        }
        
        String listaItem = "\n    {\n";
        Nodo i;
        int j;
        for (i = esquerda, j = quantidade; i != null; i = i.getProximo(), j--) {
            if (j > 1) {
                listaItem += "      Item " + j + ": {\n" +
                        "          Nome: " + i.getAtual().getNome() + ",\n" +
                        "          Quantidade: " + i.getAtual().getQuantidade() + "\n" +
                        "      },\n";
            } else {
                listaItem += "      Item " + j + ": {\n" +
                        "          Nome: " + i.getAtual().getNome() + ",\n" +
                        "          Quantidade: " + i.getAtual().getQuantidade() + "\n" +
                        "      }\n";
            }
        }
        
        return listaItem + "    }";
    }
}
