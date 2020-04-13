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

    // Busca uma fruta na ListaLigadaDesordenada
    public Fruta search(Fruta fruta) {
        if (isEmpity()) {
            return null;
        }

        Node i;
        for (i = this.fruta; i != null && !fruta.getNome().equals(i.getAtual().getNome());i = i.getProximo());
        if (i == null) {
            return null;
        }
        return i.getAtual();
    }

    /*
     * Procura se a Fruta jaTinha na ListaLigadaDesordenada
     * Se encontrar, retorna um Erro
     * Caso contrario, constroi um Node novo da novaFruta
     * Se a ListaLigadaDesordenada estiver vazia, atribui o Node novo ao inicio
     * Caso contrario, Atribui o Node novo ao Node proximo do novo, para ele sempre referenciar o Node que vinha antes
     * Atribui o Node novo ao fruta da ListaLigadaDesordenada
     * Aumenta em uma unidade o tamanho
     */
    public void add(Fruta novaFruta) {
        Fruta jaTinha = search(novaFruta);
        if (jaTinha != null) {
            System.out.println("    Erro: Fruta não adicionada, pois ja constava na Lista!");
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

    /*
     *
     * IMPLEMENTAÇÃO AINDA NAO FUNCIONANDO!!!
     *
     * Verifica se a ListaLigadaDesordenada está vazia
     * Se estiver, retorna um erro
     * Caso contrario, cria Nodes auxiliares (i == frutaAtual, j == frutaAnterior) e Fruta auxiliar (frutaDeletada) para encontrar a Fruta fruta
     * Se a busca nao encontrar (i == null) retorna null
     * Se a busca encontrar (fruta.nome == i.atual.nome) a frutaDeletada recebe i.atual
     *
     * Na terceira parte do metodo delete, faz o tratamento para que a ListaLigadaDesordenada nao tenha "buracos"
     * pois caso tenham espaços vazios, as Frutas deixam de estar ligadas, parando de funcionar a classe
     * Se os Node auxiliares forem iguais, a this.fruta vai passar a referenciar a this.fruta.proximo
     * Caso contrario, a Fruta anterior passa a apontar para a frutaAtual
     * Reduz o tamanho da ListaLigadaDesordenada em uma unidade
     * Retorna a frutaDeletada
     */
    public Fruta delete(Fruta fruta) {
        if (isEmpity()) {
            return null;
        }

        Node i;
        Node j;
        Fruta frutaDeletada;
        for (i = this.fruta, j = this.fruta; i != null && !fruta.getNome().equals(i.getAtual().getNome());
             j = i, i = i.getProximo());
        if (i == null) {
            return null;
        }
        frutaDeletada = i.getAtual();

        if (i == j) {
            this.fruta = this.fruta.getProximo();
        } else {
            j.setProximo(i.getProximo());
        }
        tamanho--;
        return frutaDeletada;
    }

    // Informa todas as Frutas presentes na ListaLigadaDesordenada
    public String print() {
        if (isEmpity()) {
            return "Lista Vazia";
        }

        String listaFruta = "[";
        Node i;
        int j;
        for (i = fruta,j = 1; i != null; i = i.getProximo(), j++) {
            listaFruta += " Fruta " + j + ": " + i.getAtual().getNome() + ";";
        }

        return listaFruta + " ]";
    }

}
