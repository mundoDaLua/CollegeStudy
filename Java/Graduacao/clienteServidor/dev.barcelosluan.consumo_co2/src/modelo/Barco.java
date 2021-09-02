package modelo;

public class Barco extends Veiculo implements EmissaoCO2 {

    private double quilometragem;
    private double indiceEmissao;

    public Barco(String modelo, String motor, double quilometragem) {
        super("Barco", modelo, motor);
        this.quilometragem = quilometragem;
        this.indiceEmissao = 0.23;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public double getIndiceEmissao() {
        return indiceEmissao;
    }

    @Override
    public double calculaEmissao(Veiculo veiculo) {
        return this.getQuilometragem() * this.indiceEmissao;
    }

}
