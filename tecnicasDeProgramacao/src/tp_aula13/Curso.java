package tp_aula13;

public class Curso {

    private String nome;
    private int cargaHoraria;
    private Instrutor instrutor;
    private Aluno[] alunos = new Aluno[4];
    private int alunosMatriculados;

    public Curso(String nome, int cargaHoraria) {
        setNome(nome);
        setCargaHoraria(cargaHoraria);
        setInstrutor(null);
        setAlunos(null);
        alunosMatriculados = -1;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getInstrutor() {
        if (instrutor == null) {
            return "null";
        } else {
            return instrutor.getNome();
        }
    }
    public void setInstrutor(Instrutor instrutor) {
        this.instrutor = instrutor;
    }

    public String getAlunosCurso() {
        String listaAlunos = "[";
        if (alunosMatriculados >= 0) {
            for (int i = 0; i <= getAlunosMatriculados(); i++) {
                if (i < (getAlunosMatriculados())) {
                    listaAlunos += " [ Nome: " + alunos[i].getNome() + ", Matrícula: " + alunos[i].getMatricula() + " ],";
                } else {
                    listaAlunos += " [ Nome: " + alunos[i].getNome() + ", Matrícula: " + alunos[i].getMatricula() + " ]";
                }
            }
        }
        return listaAlunos + " ]";
    }
    public void setAlunos(Aluno aluno) {
        if (alunosMatriculados < 4) {
            alunosMatriculados++;
            this.alunos[alunosMatriculados] = aluno;
        } else {
            System.out.println("Erro: Turma cheia!");
        }
    }

    public String searchAluno(int i) {
        return alunos[i].getNome();
    }
    public boolean searchAluno(String nome) {
        int i;
        for (i = 0; i > getAlunosMatriculados() || alunos[i].getNome() == nome; i++) {
        }
        if (i < 4) {
            return true;
        } else {
            return false;
        }
    }


    public int getAlunosMatriculados() {
        return alunosMatriculados;
    }
}
