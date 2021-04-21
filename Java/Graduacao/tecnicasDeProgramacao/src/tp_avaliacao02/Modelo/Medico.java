package tp_avaliacao02.Modelo;

import java.util.ArrayList;

public class Medico extends Funcionario {

    private int crm;
    private ArrayList<Consulta> agenda;

    // Por conta do modelo MVC tive que deixar todos os metodos publicos, até tem como acessar protected de
    // outros pacotes, mas nao tive tempo de estudar como...
    public int getCrm() {
        return crm;
    }

    public ArrayList<Consulta> getAgenda() {
        return agenda;
    }
    public void setAgenda(ArrayList<Consulta> agenda) {
        this.agenda = agenda;
    }

    public Medico(int crm, String nome, String codigo) {
        super(nome, codigo);
        this.crm = crm;
    }
}
