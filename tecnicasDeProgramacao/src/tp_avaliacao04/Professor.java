package tp_avaliacao04;

public class Professor extends Pessoa {

    private int codMateria;
    
    public Professor(String nome, int cpf, int codMateria) {
        super(nome, cpf);
        this.codMateria = codMateria;
    }
    
    public int getCodMateria() {
        return codMateria;
    }
    
    @Override
    public void listar() {
        System.out.println("    Professor {\n" +
                "        Nome: " + super.getNome() + ",\n" +
                "        CPF: " + super.getCpf() + ",\n" +
                "        Código da Matéria: " + codMateria + "\n    }");
    }
}
