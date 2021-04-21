package tp_aula24.modelo;

public class Quadrado extends Quadrilatero {

    private double area;

    public Quadrado (double lado) {
        super(lado, lado, lado, lado);
        calculaPerimetro();
        calculaArea();
    }

    @Override
    public double calculaArea() {
        area = Math.pow(getLado1(), 2);
        return area;
    }

    @Override
    public String getFormaGeometrica() {
        return "{\n        Perimetro Quadrado: " + decimal.format(getPerimetro()) +
                "\n        Area Quadrado: " + decimal.format(area) + "\n    }";
    }
}
