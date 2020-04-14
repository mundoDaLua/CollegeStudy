package ed_aula22;

public class ListaLigadaOrdenada {

    private Node fruta;
    private int tamanho;

    // Retorna o tamanho da ListaLigadaOrdenada
    public int getTamanho() {
        return tamanho;
    }

    // Verifica se a ListaLigadaOrdenada está vazia
    public boolean isEmpity() {
        return fruta == null;
    }

    // Busca uma fruta na ListaLigadaOrdenada
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
     * Procura se a Fruta jaTinha na ListaLigadaOrdenada
     * Se encontrar, retorna um Erro
     * Caso contrario, constroi um Node novo da novaFruta
     * Se a ListaLigadaOrdenada estiver vazia, atribui o Node novo ao inicio
     * Caso contrario, Atribui o Node novo ao Node proximo do novo, para ele sempre referenciar o Node que vinha antes
     * Atribui o Node novo ao fruta da ListaLigadaOrdenada
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
     * Verifica se a ListaLigadaOrdenada está vazia
     * Se estiver, retorna um erro
     * Caso contrario, cria Nodes auxiliares (frutaAtual e frutaAnterior) e Fruta auxiliar (frutaDeletada) para
     * encontrar a Fruta fruta
     * Se a busca nao encontrar (frutaAtual == null) retorna null
     * Se a busca encontrar (fruta.nome == frutaAtual.atual.nome) a frutaDeletada recebe frutaAtual.atual
     *
     * Na terceira parte do metodo delete, faz o tratamento para que a ListaLigadaOrdenada nao tenha "buracos"
     * pois caso tenham espaços vazios, as Frutas deixam de estar ligadas, parando de funcionar a classe
     * Se os Node auxiliares forem iguais, a this.fruta vai passar a referenciar a this.fruta.proximo
     * Caso contrario, a Fruta anterior passa a apontar para a frutaAtual
     * Reduz o tamanho da ListaLigadaOrdenada em uma unidade
     * Retorna a frutaDeletada
     */
    private Fruta deleteFruta(Fruta fruta) {
        if (isEmpity()) {
            return null;
        }

        Node frutaAtual;
        Node frutaAnterior;
        Fruta frutaDeletada;

        for (frutaAtual = this.fruta, frutaAnterior = this.fruta;
             frutaAtual == null && frutaAtual.getAtual().getNome().equals(fruta.getNome());
             frutaAnterior = frutaAtual, frutaAtual = frutaAtual.getProximo());

        if (frutaAtual == null) {
            return null;
        }
        frutaDeletada = frutaAtual.getAtual();

        if (frutaAtual == frutaAnterior) {
            this.fruta = this.fruta.getProximo();
        } else {
            frutaAnterior.setProximo(frutaAtual.getProximo());
        }

        tamanho--;
        return frutaDeletada;
    }

    // Retorna o nome da fruta deletada
    public String delete(Fruta fruta) {
        return deleteFruta(fruta).getNome();
    }

    // Informa todas as Frutas presentes na ListaLigadaOrdenada
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
