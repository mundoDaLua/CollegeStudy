package ed_aula06;

import ed_aula05.Livro;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        System.out.println("Qual o tamanho da pilha de livros?");
//
//        PilhaVetor pilhaLivro = new PilhaVetor(sc.nextInt());

        PilhaVetor pilhaLivro = new PilhaVetor();

        System.out.println("Vazio? " + pilhaLivro.isEmpty());
        System.out.println("Pop: " + pilhaLivro.pop());
        System.out.println("Top: " + pilhaLivro.top());

        Livro hp = new Livro("Harry Potter");
        pilhaLivro.push(hp);
        System.out.println("\nVazio? " + pilhaLivro.isEmpty());
        System.out.println("Top: " + pilhaLivro.top());
        System.out.println("Pop: " + pilhaLivro.pop());
        System.out.println("Vazio? " + pilhaLivro.isEmpty());
        System.out.println("Top: " + pilhaLivro.top());

        pilhaLivro.push(new Livro("O Hobbit"));
        pilhaLivro.push(new Livro("A Sociedade do Anel"));
        pilhaLivro.push(new Livro("As Duas Torres"));
        pilhaLivro.push(new Livro("O Retorno do Rei"));
        System.out.println("\nVazio? " + pilhaLivro.isEmpty());
        System.out.println("Top: " + pilhaLivro.top());
        System.out.println("Pop: " + pilhaLivro.pop());
        System.out.println("Top: " + pilhaLivro.top());
    }

}
