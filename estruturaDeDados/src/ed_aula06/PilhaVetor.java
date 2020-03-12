package ed_aula06;

import ed_aula05.Livro;

public class PilhaVetor {

    private Livro[] pilhaLivro;
    private int tamanhoPilha;
    private int posicaoPilha;

    // Por padrão a PilhaVetor vai caber 100 Livro, caso nao seja informado o tamanhoPilha
    public PilhaVetor() {
        posicaoPilha = -1;
        pilhaLivro = new Livro[100];
    }

    /*
     * Construtor de uma PilhaVetor de tamanho variável
     * inicializa com posição nula
     * cria uma pilha de Livro
     */
    public PilhaVetor(int tamanhoPilha) {
        posicaoPilha = -1;
        pilhaLivro = new Livro[tamanhoPilha];
    }

    // Verifica se a pilhaLivro está vazia
    public boolean isEmpty() {
        if (posicaoPilha == -1) {
            return true;
        }
        return false;
    }

    /*
     * Adiciona um novo Livro ao topo da pilhaLivro somente o tamanhoPilha for maior que a
     * posicaoPilha (Lembrando que array começa do ZERO)
     */
    public void push(Livro livro) {
        if (posicaoPilha < pilhaLivro.length - 1) {
            posicaoPilha++;
            pilhaLivro[posicaoPilha] = livro;
        }
    }

//    // Verifica qual Livro está no topo da pilhaLivro (o ultimo adicionado) e remove-o
//    public Livro pop() {
//        if (isEmpty()) {
//            return null;
//        }
//        int ultimoLivro = posicaoPilha;
//        posicaoPilha--;
//        return pilhaLivro[ultimoLivro];
//    }

//    // Verifica qual Livro está no topo da pilhaLivro (o ultimo adicionado), sem remove-lo
//    public Livro top() {
//        if (isEmpty()) {
//            return null;
//        }
//        return pilhaLivro[posicaoPilha];
//    }

    // Retorna a quantidade de Livro na pilhaLivro
    public int getPosicaoPilha() {
        if (isEmpty()) {
            return 0;
        }
        return posicaoPilha + 1;
    }

    // Verifica qual Livro está no topo da pilhaLivro (o ultimo adicionado) e remove-o
    public String pop() {
        if (isEmpty()) {
            return null;
        }
        int ultimoLivro = posicaoPilha;
        posicaoPilha--;
        return pilhaLivro[ultimoLivro].getTitulo();
    }

    // Verifica qual Livro está no topo da pilhaLivro (o ultimo adicionado), sem remove-lo
    public String top() {
        if (isEmpty()) {
            return null;
        }
        return pilhaLivro[posicaoPilha].getTitulo();
    }


//    // TODO Retornar uma String contendo todos os Livro na pilhaLivro
//    public String getPilhaLivro() {
//        String colecao = "[ ";
//        if (!isEmpty()) {
//            int tamanho = posicaoPilha;
//            for (int i = 0; i <= tamanho; i++) {
//                colecao += top() + ", ";
//                posicaoPilha--;
//            }
//
//            colecao.substring(0, colecao.length() - 2);
//        }
//        return colecao + "]";
//    }

}
