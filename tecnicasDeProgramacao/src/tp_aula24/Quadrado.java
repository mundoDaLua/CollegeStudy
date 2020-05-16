package tp_aula24;

public class Quadrado extends Quadrilatero {

    private double area;

    public Quadrado (double lado) {
        super(lado, lado, lado, lado);
        calculaPerimetro();
        calculaArea();
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public double calculaArea() {
        area = Math.pow(getLado1(), 2);
        return area;
    }
}
