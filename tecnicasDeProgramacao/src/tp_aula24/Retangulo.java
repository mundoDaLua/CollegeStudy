package tp_aula24;

public class Retangulo extends Quadrilatero{

    private double area;

    public Retangulo(double base, double altura) {
        super(base, base, altura, altura);
        calculaPerimetro();
        calculaArea();
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public double calculaArea() {
        area = getLado1() * getLado3();
        return area;
    }
}
