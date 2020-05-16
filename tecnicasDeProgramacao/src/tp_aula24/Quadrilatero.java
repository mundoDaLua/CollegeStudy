package tp_aula24;

import java.text.DecimalFormat;

public abstract class Quadrilatero implements FormaGeometrica {

    private double lado1;
    private double lado2;
    private double lado3;
    private double lado4;
    private double perimetro;

    DecimalFormat decimal = new DecimalFormat("0.00");

    public Quadrilatero (double lado1, double lado2, double lado3, double lado4) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.lado4 = lado4;
        calculaPerimetro();
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public double getLado4() {
        return lado4;
    }

    public double getPerimetro() {
        return perimetro;
    }

    @Override
    public double calculaPerimetro() {
        perimetro = getLado1() + getLado2() +getLado3() + getLado4();
        return perimetro;
    }

    public abstract double getArea();

    @Override
    public String getFormaGeometrica() {
        return "{\n        Perimetro: " + decimal.format(getPerimetro()) +
                ",\n        Area: " + decimal.format(getArea()) + "\n    }";
    }
}
