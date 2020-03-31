package tp_aula13.matricula;

import java.util.ArrayList;

public class Aluno {

    private String nome;
    private int materiasCadastradas;
    private ArrayList<Materia> materias;

    public Aluno() {
        setNome(null);
        materiasCadastradas = 0;
        materias = new ArrayList<>(3);
    }

    public Aluno(String nome) {
        setNome(nome);
        materiasCadastradas = 0;
        materias = new ArrayList<>(3);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMateriasCadastradas() {
        return materiasCadastradas;
    }

    public String  getMaterias() {
        String cursando = "[";
        if (getMateriasCadastradas() > 0) {
            for (int i = 0; i < getMateriasCadastradas(); i++) {
                if (i < (getMateriasCadastradas() - 1)) {
                    cursando += " [ Matéria: " + materias.get(i).getNome() + " ], ";
                } else {
                    cursando += " [ Matéria: " + materias.get(i).getNome() + " ]";
                }
            }
        }
        return cursando + " ]";
    }

    public void addMaterias(Materia materia) {
        this.materiasCadastradas++;
        this.materias.add(materia);
    }
}
