package tp_avaliacao02.Modelo;

import java.util.ArrayList;

public class Psicologo extends Funcionario {

    private int crp;
    private ArrayList<Consulta> agenda;

    public Psicologo(int crp, String nome, String codigo) {
        super(nome, codigo);
        this.crp = crp;
    }

    // Por conta do modelo MVC tive que deixar todos os metodos publicos, até tem como acessar protected de
    // outros pacotes, mas nao tive tempo de estudar como...
    public int getCrp() {
        return crp;
    }

    public ArrayList<Consulta> getAgenda() {
        return agenda;
    }
    public void setAgenda(ArrayList<Consulta> agenda) {
        this.agenda = agenda;
    }
}
