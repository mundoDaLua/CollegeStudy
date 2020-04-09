package ed_aula22;

public class ListaLigadaDesordenada {

    private Node fruta;
    private int tamanho;

    // Retorna o tamanho da ListaLigadaDesordenada
    public int getTamanho() {
        return tamanho;
    }

    // Verifica se a ListaLigadaDesordenada está vazia
    public boolean isEmpity() {
        return fruta == null;
    }

    /*
     * Procura se a Fruta jaTinha na ListaLigadaDesordenada
     * Se encontrar, retorna um Erro
     * Caso contrario, constroi um Node novo da novaFruta
     * Se a ListaLigadaDesordenada estiver vazia, atribui o Node novo ao inicio
     * Caso contrario, Atribui o Node novo ao Node proximo do finalFila, para ele sempre referenciar o Node que
     * está atraz dele
     * Atribui o Node adicionado ao finalFila
     * Aumenta em uma unidade o tamanhoFila
     */
    public void add(Fruta novaFruta) throws Exception {
        Fruta jaTinha = search(novaFruta);
        if (jaTinha != null) {
            throw new Exception("    Erro: Fruta não adicionada, pois ja constava na Lista!");
        }

        Node novo = new Node(novaFruta);
        if (isEmpity()) {
            fruta = novo;
        } else {
            novo.setProximo(novo);
            fruta = novo;
        }
        tamanho++;
    }



}
