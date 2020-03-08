package ed_aula10;

public class FilaVetor {

    private int tamanho;
    private Pessoa filaPessoa[] = new Pessoa[tamanho];
    private int finalFila;

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void push(Pessoa pessoa) {
        if (filaPessoa[finalFila] != null) {
            filaPessoa[finalFila] = pessoa;
            finalFila--;
        } else {
            System.out.println("Fila cheia!");
        }
    }

    public Pessoa pop() {
        Pessoa saiDaFila = filaPessoa[finalFila];
        filaPessoa[finalFila] = null;
        finalFila++;
        return saiDaFila;
    }

    public boolean isEmpity() {
        // TODO
    }

    public boolean isFull() {
        // TODO
    }
}
