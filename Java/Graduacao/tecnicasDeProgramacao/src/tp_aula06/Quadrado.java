package tp_aula06;

public class Quadrado {

    private double lado;
    private double area;
    private double perimetro;

    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getArea() {
        return area;
    }
    public void setArea() {
        this.area = Math.pow(this.lado, 2);
    }

    public double getPerimetro() {
        return perimetro;
    }
    public void setPerimetro() {
        this.perimetro = 4 * this.lado;
    }
}
