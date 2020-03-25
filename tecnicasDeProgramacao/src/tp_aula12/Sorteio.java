package tp_aula12;

import java.util.Random;

public class Sorteio {

    private Dado valor;

    public Sorteio() {
        valor = new Dado();
    }

    public int getSorteio() {
        return valor.getNumero();
    }
    public void setSorteio() {
        Random seed = new Random();
        /*
         * Atribui ao valor um inteiro entre 0, inclusivo, e 6, não inclusivo, adicionando 1 para
         * corrigir e ficar de 1 até 6
         */
        this.valor.setNumero(seed.nextInt(6) + 1);
    }

}
