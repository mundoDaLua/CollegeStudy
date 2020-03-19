package ed_aula11;

public class ListaDesordenadaVetor {

    Item listaItem[];
    int tamanhoLista;
    int finalLista = -1;

    // Por padrão a ListaDesordenadaVetor vai caber 100 Item, caso nao seja informado o tamanhoLista
    public ListaDesordenadaVetor() {
        tamanhoLista = 100;
        finalLista = -1;
        listaItem = new Item[tamanhoLista];
    }

    /*
     * Construtor de uma ListaDesordanadaVetor de tamanho variável
     * inicializa com posição nula
     * cria uma lista desordenada de Item
     */
    public ListaDesordenadaVetor(int tamanhoLista) {
        this.tamanhoLista = tamanhoLista;
        finalLista = -1;
        listaItem = new Item[tamanhoLista];
    }

    // Verifica se a listaItem está vazia
    public boolean isEmpty() {
        return finalLista == -1;
    }

    // Verifica se a listaItem está cheia
    public boolean isFull() {
        return (finalLista + 1) == tamanhoLista;
    }

    // Realiza uma busca linear sequencial até o final da listaItem ou até encontrar o Item desejado
    private int search(Item item) {
        int i;
        for (i = 0; i <= finalLista && (!listaItem[i].getItem().equals(item.getItem())); i++) ;
        return i;
    }

    /*
     * Realiza o deslocamento de um Item, quando usado para quando o mesmo for removido, para não haver
     * espaços vazios na listaItem
     */
    private void move(int i) {
        Item item = listaItem[i];
        for (int k = i; k <= finalLista; k++) {
            listaItem[k] = listaItem[k+1];
            listaItem[k+1] = null;
        }
        finalLista--;
    }

    // Adiciona um novo Item ao final da listaItem
    public void add(Item item) {
        if (isFull()) {
            System.out.println("Operação não realizada. A lista está cheia.");
        } else {
            finalLista++;
            listaItem[finalLista] = item;
        }
    }

    // Busca e retorna qual Item na listaItem está em uma determinada posicao, sem remove-lo
    public Item get(int posicao) {
        if (isEmpty()) {
            System.out.println("Operação não realizada. A lista está vazia.");
            return null;
        } else
            return listaItem[posicao];
    }

    // Busca e retorna um Item específico na listaItem, caso exista, sem remove-lo
    public Item get(Item item) {
        if (isEmpty()) {
            System.out.println("Operação não realizada. A lista está vazia.");
            return null;
        } else {
            int i = search(item);
            if (i > finalLista) {
                System.out.println("O item não foi encontrado.");
                return null;
            } else
                return listaItem[i];
        }
    }

    // Busca, retorna e remove um Item na listaItem que está em uma determinada posicao
    public Item delete(int posicao) {
        if (isEmpty()) {
            System.out.println("Operação não realizada. A lista está vazia.");
            return null;
        } else {
            Item item = listaItem[posicao];
            listaItem[posicao] = null;
            move(posicao);
            return item;
        }
    }

    // Busca, retorna e remove um Item específico na listaItem, caso exista
    public Item delete(Item item) {
        if (isEmpty()) {
            System.out.println("Operação não realizada. A lista está vazia.");
            return null;
        } else {
            int i = search(item);
            if (i > finalLista) {
                System.out.println("O item não foi encontrado.");
                return null;
            } else {
                Item items = listaItem[i];
                listaItem[i] = null;
                move(i);
                return items;
            }
        }
    }

    // Retorna qual Item está em uma determinada posicao na listaItem, sem remove-lo
    public String print(int posicao) {
        if (isEmpty() || posicao > finalLista) {
            return null;
        } else {
            return listaItem[posicao].getItem();
        }
    }

    // Realiza uma modificação direta em um Item na listaItem (substitui os atributos do antigo pelos do novo)
    public Item change(Item antigo,Item novo) {
        if (isEmpty()) {
            System.out.println("Operação não realizada. A lista está vazia.");
            return null;
        } else {
            int i = search(antigo);
            listaItem[i].setDescricao(novo.getDescricao());
            listaItem[i].setQuantidade(novo.getQuantidade());
            listaItem[i].setPrioridade(novo.getPrioridade());
            return listaItem[i];
        }
    }
}
