package tp_aula13.hospital;

public class Medico {

    private String nome;
    private String especialidade;

    public Medico() {
        setNome(null);
        setEspecialidade(null);
    }

    public Medico(String nome, String especialidade) {
        setNome(nome);
        setEspecialidade(especialidade);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

}
