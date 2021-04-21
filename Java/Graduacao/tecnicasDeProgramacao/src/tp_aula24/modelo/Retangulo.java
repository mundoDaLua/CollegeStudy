package tp_aula24.modelo;

public class Retangulo extends Quadrilatero{

    private double area;

    public Retangulo(double base, double altura) {
        super(base, base, altura, altura);
        calculaPerimetro();
        calculaArea();
    }

    @Override
    public double calculaArea() {
        area = getLado1() * getLado3();
        return area;
    }

    @Override
    public String getFormaGeometrica() {
        return "{\n        Perimetro Retângulo: " + decimal.format(getPerimetro()) +
                "\n        Area Retângulo: " + decimal.format(area) + "\n    }";
    }
}
