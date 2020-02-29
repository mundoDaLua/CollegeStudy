package tp_aula06;

import java.util.Scanner;

public class FigurasGeometricas {
    public static void resultadosQuadrado(Quadrado q) {
        System.out.println("O perimetro do quadrado é: " + q.getPerimetro());
        System.out.println("A area do quadrado é: " + q.getArea());
    }

    public static void resultadosTriangulo(Triangulo t) {
        System.out.println("A hipotenusa do triangulo é: " + t.getHipotenusa());
        System.out.println("A area do triangulo é: " + t.getArea());
    }

    public static void main(String[] args) {
        Quadrado q1 = new Quadrado();
        Quadrado q2 = new Quadrado();

        Triangulo t1 = new Triangulo();
        Triangulo t2 = new Triangulo();

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o lado do primeiro quadrado: ");
        q1.setLado(sc.nextDouble());
        System.out.println("Informe o lado do segundo quadrado: ");
        q2.setLado(sc.nextDouble());

        System.out.println("Informe a base do primeiro triangulo: ");
        t1.setBase(sc.nextDouble());
        System.out.println("Informe a altura do primeiro triangulo: ");
        t1.setAltura(sc.nextDouble());
        System.out.println("Informe a base do segundo triangulo: ");
        t2.setBase(sc.nextDouble());
        System.out.println("Informe a altura do segundo triangulo: ");
        t2.setAltura(sc.nextDouble());

        System.out.println("Quadrado 1: ");
        resultadosQuadrado(q1);
        System.out.println();
        System.out.println("Quadrado 2: ");
        resultadosQuadrado(q2);
        System.out.println("\n\n");
        System.out.println("Triangulo 1: ");
        resultadosTriangulo(t1);
        System.out.println("Triangulo 2: ");
        resultadosTriangulo(t2);

    }
}
