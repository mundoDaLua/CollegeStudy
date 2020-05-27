package tp_avaliacao03.modelo;

public class Bicicleta extends Veiculo implements EmissaoCO2 {

    private double quilometragem;
    private double indice;

    public Bicicleta(String tipo, String motor, double quilometragem) {
        super(tipo, motor);
        this.quilometragem = quilometragem;
        this.indice = 0;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public double getIndice() {
        return indice;
    }

    @Override
    public double calculaEmissao() {
        return getQuilometragem() * getIndice();
    }

}