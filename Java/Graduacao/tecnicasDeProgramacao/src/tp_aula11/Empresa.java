package tp_aula11;

public class Empresa {

    private String nome;
    private String endereco;
    private String cep;
    private String telefone;

    public Empresa() {
    }

    public Empresa(String nome, String endereco, String cep, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.cep = cep;
        this.telefone = telefone;
    }

    private String getNome() {
        return nome;
    }
    private void setNome(String nome) {
        this.nome = nome;
    }

    private String getEndereco() {
        return endereco;
    }
    private void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    private String getCep() {
        return cep;
    }
    private void setCep(String cep) {
        this.cep = cep;
    }

    private String getTelefone() {
        return telefone;
    }
    private void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmpresa() {
        return "Nome: " + getNome() +
                "\nEndereço: " + getEndereco() +
                "\nCEP: " + getCep() +
                "\nTelefone: " + getTelefone();
    }
    public void setEmpresa(String nome, String endereco, String cep, String telefone) {
        setNome(nome);
        setEndereco(endereco);
        setCep(cep);
        setTelefone(telefone);
    }
}
