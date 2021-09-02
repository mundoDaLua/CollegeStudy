package modelo;

public abstract class Veiculo implements EmissaoCO2 {

    private String tipo;
    private String modelo;
    private String motor;

    protected Veiculo(String tipo, String modelo, String motor) {
        this.tipo = tipo;
        this.modelo = modelo;
        this.motor = motor;
    }

    public String getTipo() {
        return tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMotor() {
        return motor;
    }

    public String print(Veiculo veiculo) {
        String retorno = "        Tipo: " + getTipo() +
                "\n        Modelo: " + getModelo() +
                "\n        Motor: " + getMotor() +
                "\n        Emissão de CO2: " + calculaEmissao(veiculo);

        return retorno;
    }

}
