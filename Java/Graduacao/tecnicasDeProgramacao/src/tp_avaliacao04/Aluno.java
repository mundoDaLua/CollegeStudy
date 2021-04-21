package tp_avaliacao04;

public class Aluno extends Pessoa {
    
    private int matricula;
    
    public Aluno(String nome, int cpf, int matricula) {
        super(nome, cpf);
        this.matricula = matricula;
    }
    
    public int getMatricula() {
        return matricula;
    }
    
    @Override
    public void listar() {
        System.out.println("    Aluno {\n" +
                "        Nome: " + super.getNome() + ",\n" +
                "        CPF: " + super.getCpf() + ",\n" +
                "        Código da Matrícula: " + matricula + "\n    }");
    }
}
