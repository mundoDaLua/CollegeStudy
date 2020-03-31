package tp_aula13.matricula;

public class Main {

    public static void main(String[] args) {

        Materia tp1 = new Materia("Técnicas de Programação I");
        Materia ed1 = new Materia("Estrutura de Dados I");
        Materia engReq = new Materia("Engenharia de Requisitos");
        Materia projBD = new Materia("Projeto de Banco de Dados");

        Aluno luan = new Aluno("Luan F Barcelos");
        Aluno fernando = new Aluno("Fernando");
        Aluno ninguem = new Aluno("Ninguem da Silva Sauro");

        luan.addMaterias(tp1);
        luan.addMaterias(ed1);
        luan.addMaterias(projBD);
        luan.addMaterias(engReq);

        fernando.addMaterias(tp1);
        fernando.addMaterias(ed1);
        fernando.addMaterias(projBD);

        System.out.println(luan.getNome() + ": " + luan.getMaterias());
        System.out.println("\n" + fernando.getNome() + ": " + fernando.getMaterias());
        System.out.println("\n" + ninguem.getNome() + ": " + ninguem.getMaterias());

    }
}
