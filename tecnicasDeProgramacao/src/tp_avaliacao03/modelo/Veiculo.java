package tp_avaliacao03.modelo;

public abstract class Veiculo {

    private String tipo;
    private String motor;

    protected Veiculo(String tipo, String motor) {
        this.tipo = tipo;
        this.motor = motor;
    }

    public String getTipo() {
        return tipo;
    }

    public String getMotor() {
        return motor;
    }

}
