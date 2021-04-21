package tp_avaliacao02.Modelo;

public class Funcionario {

    private String nome;
    private String codigo;

    public Funcionario(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    // Por conta do modelo MVC tive que deixar todos os metodos publicos, até tem como acessar protected de
    // outros pacotes, mas nao tive tempo de estudar como...
    protected String getNome() {
        return nome;
    }
    protected String getCodigo() {
        return codigo;
    }
}
