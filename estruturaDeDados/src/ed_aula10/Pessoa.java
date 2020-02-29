package ed_aula10;

public class Pessoa {

    private String nome;
    private String matricula;
    private String telefone;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getPessoa() {
        String pessoa = "Nome: " + this.getNome() + "\n" + "Matricula: " + this.getMatricula() +
                "\n" + "Telefone: " + this.getTelefone();
        return pessoa;
    }

}
