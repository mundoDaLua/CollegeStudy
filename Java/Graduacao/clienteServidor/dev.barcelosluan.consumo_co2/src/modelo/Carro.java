package modelo;

public class Carro extends Veiculo implements EmissaoCO2 {

    private double quilometragem;
    private double indiceEmissao = 1.24;

    public Carro(String modelo, String motor, double quilometragem) {
        super("Carro", modelo, motor);

        this.quilometragem = quilometragem;
        this.indiceEmissao = 1.24;
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
