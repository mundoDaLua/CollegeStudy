package tp_avaliacao02.Modelo;

public class Consulta {

    private String pacienteNome;
    private String hora;

    public Consulta(String pacienteNome, String hora) {
        this.pacienteNome = pacienteNome;
        this.hora = hora;
    }

    // Por conta do modelo MVC tive que deixar todos os metodos publicos, até tem como acessar protected de
    // outros pacotes, mas nao tive tempo de estudar como...
    public String getPacienteNome() {
        return pacienteNome;
    }

    public String getHora() {
        return hora;
    }
}
