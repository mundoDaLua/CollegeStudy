package modelo;

public class Bicicleta extends Veiculo implements EmissaoCO2 {

    private double indiceEmissao;

    public Bicicleta(String modelo) {
        super("Bicicleta", modelo,"Sem Motor");

        this.indiceEmissao = 0;
    }

    public double getIndiceEmissao() {
        return indiceEmissao;
    }

    @Override
    public double calculaEmissao(Veiculo veiculo) {
        return this.indiceEmissao;
    }

}