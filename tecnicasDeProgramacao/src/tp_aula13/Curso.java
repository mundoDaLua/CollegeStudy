package tp_aula13;

public class Curso {

    private String nome;
    private int cargaHoraria;
    private Instrutor instrutor;
    private Aluno[] alunos;
    private int alunosMatriculados;

    /*
     * Construtor padrão de um Curso, que nao tem alunos matriculados
     * O instrutor não é obrigatorio
     * O tamanhoTurma é, por padrão, 4
     */
    public Curso(String nome, int cargaHoraria) {
        setNome(nome);
        setCargaHoraria(cargaHoraria);
        setInstrutor(null);
        setTurma(4);
        alunosMatriculados = -1;
        setAlunos(null);
    }

    /*
     * Construtor de um Curso, sem alunos matriculados
     * Tem um instrutor definido na chamada
     * O tamanhoTurma é 4 por padrão
     */
    public Curso(String nome, int cargaHoraria, Instrutor instrutor) {
        setNome(nome);
        setCargaHoraria(cargaHoraria);
        setInstrutor(instrutor);
        setTurma(4);
        alunosMatriculados = -1;
        setAlunos(null);
    }

    /*
     * Construtor de um Curso com, sem alunos
     * Tem um instrutor definido na chamada
     * Tem o tamanhoTurma escolhido na chamada
     */
    public Curso(String nome, int cargaHoraria, Instrutor instrutor, int tamanhoTurma) {
        setNome(nome);
        setCargaHoraria(cargaHoraria);
        setInstrutor(instrutor);
        setTurma(tamanhoTurma);
        alunosMatriculados = -1;
        setAlunos(null);
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
                    listaAlunos += " [ Nome: " + alunos[i].getNome() +
                            ", Matrícula: " + alunos[i].getMatricula() + " ],";
                } else {
                    listaAlunos += " [ Nome: " + alunos[i].getNome() +
                            ", Matrícula: " + alunos[i].getMatricula() + " ]";
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

    public int getAlunosMatriculados() {
        return alunosMatriculados;
    }
    public void setAlunosMatriculados(int alunosMatriculados) {
        this.alunosMatriculados = alunosMatriculados;
    }

    public void setTurma(int tamanhoTurma) {
        alunos = new Aluno[tamanhoTurma];
    }

    public String searchAluno(int i) {
        return alunos[i].getNome();
    }
    public boolean searchAluno(String nome) {
        int i;
        for (i = 0; i > getAlunosMatriculados() || alunos[i].getNome().equals(nome); i++) {
        }
        if (i < 4) {
            return true;
        } else {
            return false;
        }
    }

    /*
     * Um selection sort que busca o nome dos Alunos em dois Cursos que se repetem (sejam matriculados em ambos
     * os Cursos), fazendo a busca até chgar no fim da quantidade de alunosMatriculados em ambos os cursos, ou até
     * achar um que seja igual (enquanto os nomes não forem iguais)
     *
     * Se terminar a busca e o auxiliar "j" for menor do que a quantidade de alunosMatriculados + 1 (visto que por
     * ser vetor, ele começa do zero!) significa que ele saiu da busca antes, ou seja, achou um que fosse igual
     */
    public static String compareCursos(Curso primeiro, Curso segundo) {
        String alunosSimultaneos = "";
        int i;
        int j;
        for (i = 0; i <= primeiro.getAlunosMatriculados(); i++) {
            for (j = 0; j <= primeiro.getAlunosMatriculados() && !primeiro.searchAluno(i).equals(
                    segundo.searchAluno(j)); j++);
            if (j < (segundo.getAlunosMatriculados() + 1)) {
                alunosSimultaneos += primeiro.searchAluno(i) + ", ";
            }
        }
        return alunosSimultaneos.substring(0, (alunosSimultaneos.length() - 2));
    }
}
