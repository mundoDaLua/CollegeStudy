package tp_aula24.modelo;

import java.text.DecimalFormat;

public class Circulo implements FormaGeometrica {

    private double raio;
    private double perimetro;
    private double area;

    DecimalFormat decimal = new DecimalFormat("0.00");

    public Circulo (double raio) {
        this.raio = raio;
        calculaPerimetro();
        calculaArea();
    }

    public double getRaio() {
        return raio;
    }

    @Override
    public double calculaPerimetro() {
        perimetro = 2 * Math.PI * getRaio();
        return perimetro;
    }

    @Override
    public double calculaArea() {
        area = Math.PI * Math.pow(getRaio(),2);
        return area;
    }

    @Override
    public String getFormaGeometrica() {
        return "{\n        Perimetro Circulo: " + decimal.format(perimetro) +
                "\n        Area Circulo: " + decimal.format(area) + "\n    }";
    }
}
