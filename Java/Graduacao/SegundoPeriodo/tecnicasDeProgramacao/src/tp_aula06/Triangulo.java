package tp_aula06;

public class Triangulo {

    private double base;
    private double altura;
    private double hipotenusa;
    private double area;

    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getHipotenusa() {
        return hipotenusa;
    }
    public void setHipotenusa() {
        this.hipotenusa = Math.sqrt(Math.pow(this.base, 2) + Math.pow(this.altura, 2));
    }

    public double getArea() {
        return area;
    }
    public void setArea() {
        this.area = (this.base * this.altura) / 2;
    }



}
