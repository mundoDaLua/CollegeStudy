package aula06;

import aula05.Livro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please inform the size of the stack: ");
        ArrayStack stack = new ArrayStack(sc.nextInt());
        System.out.println("Please inform the title, autor and the publisher of the book (each in a line)");
        Livro livro = new Livro(sc.nextLine(), sc.nextLine(), sc.nextLine());

        stack.push(livro);
        stack.pop(livro);

    }

}
