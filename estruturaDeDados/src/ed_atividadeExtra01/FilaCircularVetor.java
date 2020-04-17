package ed_atividadeExtra01;

import ed_aula10.Pessoa;

public class FilaCircularVetor {

    private Objeto filaObjeto[];
    private int tamanhoFila;
    private int inicoFila;
    private int finalFila;

    // Por padrão a FilaCircularVetor vai caber 100 Pessoa, caso nao seja informado o tamanhoFila
    public FilaCircularVetor() {
        this.tamanhoFila = 100;
        filaObjeto = new Objeto[getTamanhoFila()];
        finalFila = 0;
        inicoFila = 0;
    }

    /*
     * Construtor de uma FilaCircularVetor de tamanho variável
     * Inicializa com posição nula
     * Cria uma fila de Objeto
     */
    public FilaCircularVetor(int tamanhoFila) {
        this.tamanhoFila = tamanhoFila;
        filaObjeto = new Objeto[getTamanhoFila()];
        finalFila = 0;
        inicoFila = 0;
    }

    public int getTamanhoFila() {
        return tamanhoFila;
    }

    // Verifica se a filaObjeto está vazia
    public boolean isEmpty() {
        return finalFila == inicoFila;
    }

    // Verifica se a filaObjeto está cheia
    public boolean isFull() {
        return (finalFila + 1) == inicoFila;
    }

    // Adiciona um novo Objeto ao finalFila somente se não estiver cheia
    public void add(Objeto objeto) {
        if (!isFull()) {
            filaObjeto[finalFila] = objeto;
            finalFila++;
        } else {
            System.out.println("Objeto " + objeto.getNome() + " não adicionado, pois a fila está cheia!");
        }
    }

    // Remove o primeir Objeto adicionada na filaObjeto desde que ela não esteja vazia
    public Objeto remove() throws Exception {
        if (!isEmpty()) {
            Objeto objeto = filaObjeto[inicoFila];
            for (int i = (inicoFila + 1); i < finalFila; i++) {
                filaObjeto[i - 1] = filaObjeto[i];
                filaObjeto[i] = null;
            }
            finalFila--;
            return objeto;
        } else {
            throw new Exception("Erro: A fila está vazia.");
        }
    }

    // Imprime toda a listaObjeto
    public String print() {
        if (!isEmpty()) {
            String fila = "[ ";
            for (int i = inicoFila; i < finalFila; i++) {
                if (i < (finalFila - 1)) {
                    fila += filaObjeto[i].getNome() + ", ";
                } else {
                    fila += filaObjeto[i].getNome();
                }
            }
            fila += " ]";
            return fila;
        } else {
            return "A fila está vazia...";
        }
    }
}
