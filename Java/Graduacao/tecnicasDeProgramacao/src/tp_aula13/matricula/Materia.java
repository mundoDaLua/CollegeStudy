package tp_aula13.matricula;

public class Materia {

    private String nome;

    public Materia() {
        setNome(null);
    }

    public Materia(String nome) {
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
