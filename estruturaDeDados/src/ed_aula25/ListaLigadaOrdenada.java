package ed_aula25;

public class ListaLigadaOrdenada {

    private Node fruta;
    private int tamanho;

    public ListaLigadaOrdenada() {
        this.fruta = null;
        this.tamanho = 0;
    }

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

        Node frutaAtual;
        for (frutaAtual = this.fruta;
             frutaAtual != null && !frutaAtual.getAtual().getNome().equals(fruta.getNome());
             frutaAtual = frutaAtual.getProximo());

        if (frutaAtual == null) {
            return null;
        }
        return frutaAtual.getAtual();
    }

    /*
     * Método de ordenação da ListaLigadaOrdenada
     * compereTo() é responsavel por comparar o conteudo das String, ordenando com base no UNICODE de cada caracter
     * sendo assim, acaba por ordenar alfabeticamente as Fruta
     */
    private void sort(Node node) {
        Node nodeAtual;
        Node nodeAnterior;
        for (nodeAtual = this.fruta, nodeAnterior = this.fruta;
             nodeAtual != null && nodeAtual.getAtual().getNome().compareTo(node.getAtual().getNome()) < 0;
             nodeAnterior = nodeAtual, nodeAtual = nodeAtual.getProximo());

        if (nodeAtual == nodeAnterior) {
            node.setProximo(fruta);
            fruta = node;
        } else {
            nodeAnterior.setProximo(node);
            node.setProximo(nodeAtual);
        }
    }

    /*
     * Procura se a Fruta jaTinha na ListaLigadaOrdenada
     *
     * Se encontrar, retorna um Erro
     * Caso contrario, constroi um Node novo da novaFruta
     *
     * Se a ListaLigadaOrdenada estiver vazia, atribui o Node novo ao inicio
     * Caso contrario, de forma ordenada, Atribui o Node novo ao Node proximo do novo, para ele sempre referenciar o
     * Node que vinha antes
     *
     * Atribui o Node novo ao fruta da ListaLigadaOrdenada
     * Aumenta em uma unidade o tamanho
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
            sort(novo);
        }
        tamanho++;
    }

    /*
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
    public String delete(Fruta fruta) {
        if (isEmpity()) {
            return null;
        }

        Node frutaAtual;
        Node frutaAnterior;
        Fruta frutaDeletada;

        for (frutaAtual = this.fruta, frutaAnterior = this.fruta;
             frutaAtual != null && !frutaAtual.getAtual().getNome().equals(fruta.getNome());
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
        return frutaDeletada.getNome();
    }

    // Informa todas as Frutas presentes na ListaLigadaOrdenada
    public String print() {
        if (isEmpity()) {
            return "Lista Vazia";
        }

        String listaFruta = "\n    [\n";
        Node i;
        int j;
        for (i = fruta, j = 1; i != null; i = i.getProximo(), j++) {
            if (j == 1) {
                listaFruta += "      Fruta " + j + ": " + i.getAtual().getNome() + ";\n";
            } else {
                listaFruta += "      Fruta " + j + ": " + i.getAtual().getNome() + ";\n";
            }
        }

        return listaFruta + "    ]";
    }

}
