package fila_vetor;

public class FilaVetor {

    private Pessoa filaPessoa[];
    private int tamanhoFila;
    private int finalFila;

    // Por padrão a FilaVetor vai caber 100 Pessoa, caso nao seja informado o tamanhoFila
    public FilaVetor() {
        finalFila = -1;
        tamanhoFila = 100;
        filaPessoa = new Pessoa[tamanhoFila];
    }

    /*
     * Construtor de uma FilaVetor de tamanho variável
     * inicializa com posição nula
     * cria uma fila de Pessoa
     */
    public FilaVetor(int tamanhoFila) {
        finalFila = -1;
        filaPessoa = new Pessoa[tamanhoFila];
    }

    // Verifica se a filaPessoa está vazia
    public boolean isEmpty() {
        if (finalFila == -1) {
            return true;
        }
        return false;
    }

    // Verifica se a filaPessoa está cheia
    public boolean isFull() {
        if (finalFila == tamanhoFila) {
            return true;
        }
        return false;
    }

    // Adiciona uma nova Pessoa ao final da filaPessoa somente se não estiver cheia
    public void add(Pessoa pessoa) {
        if (!isFull()) {
            finalFila++;
            filaPessoa[finalFila] = pessoa;
        }
    }

//    /* Remove a primeira Pessoa adicionada na filaPessoa e re-ordena a fila de modo que a segunda passe
//     * a ser a primeira e por ai vai... desde que ela não esteja vazia
//     */
//    public Pessoa remove() {
//        if (!isEmpty()) {
//            Pessoa pessoa = filaPessoa[0];
//            for (int i = 1; i < tamanhoFila; i++) {
//                filaPessoa[i - 1] = filaPessoa[i];
//                filaPessoa[i] = null;
//            }
//            finalFila--;
//            return pessoa;
//        } else {
//            return "A fila estava vazia...";
//        }
//    }

//    // Verifica qual a primeira Pessoa da filaPessoa sem remove-la desde que não esteja vazia
//    public Pessoa peeek() {
//        if (!isEmpty()) {
//            Pessoa pessoa = filaPessoa[0];
//            return pessoa;
//        } else {
//            return "A fila estava vazia...";
//        }
//    }

    public String remove() {
        if (!isEmpty()) {
            Pessoa pessoa = filaPessoa[0];
            for (int i = 1; i < finalFila; i++) {
                filaPessoa[i - 1] = filaPessoa[i];
                filaPessoa[i] = null;
            }
            finalFila--;
            return pessoa.getNome();
        } else {
            return "A fila estava vazia...";
        }
    }

    // Verifica qual a primeira Pessoa da filaPessoa sem remove-la desde que não esteja vazia
    public String peek() {
        if (!isEmpty()) {
            Pessoa pessoa = filaPessoa[0];
            return pessoa.getNome();
        } else {
            return "A fila estava vazia...";
        }
    }

//    // TODO Retornar uma String contendo todos as Pessoa na filaPessoa
//    public String getFilaPessoa() {
//    }

}
