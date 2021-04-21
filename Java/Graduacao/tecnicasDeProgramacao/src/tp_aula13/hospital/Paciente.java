package tp_aula13.hospital;

public class Paciente {

    private String nome;
    private String mae;
    private String nascimento;
    private String internacao;
    private String doenca;

    public Paciente(String nome, String doenca) {
        setNome(nome);
        setMae(null);
        setNascimento(null);
        setInternacao(null);
        setDoenca(doenca);
    }

    public Paciente(String nome, String mae, String nascimento, String internacao, String doenca) {
        setNome(nome);
        setMae(mae);
        setNascimento(nascimento);
        setInternacao(internacao);
        setDoenca(doenca);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMae() {
        return mae;
    }
    public void setMae(String mae) {
        this.mae = mae;
    }

    public String getNascimento() {
        return nascimento;
    }
    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getInternacao() {
        return internacao;
    }
    public void setInternacao(String internacao) {
        this.internacao = internacao;
    }

    public String getDoenca() {
        return doenca;
    }
    public void setDoenca(String doenca) {
        this.doenca = doenca;
    }

}
