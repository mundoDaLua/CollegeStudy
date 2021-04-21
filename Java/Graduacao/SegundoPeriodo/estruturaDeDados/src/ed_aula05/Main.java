package ed_aula05;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Livro livro = new Livro();

        System.out.println("Informe o titulo do livro: ");
        livro.setTitulo(sc.nextLine());
        System.out.println("Informe o autor do livro " + livro.getTitulo());
        livro.setAutor(sc.nextLine());
        System.out.println("Informe a editora do livro " + livro.getTitulo());
        livro.setEditora(sc.nextLine());

        System.out.println("Livro " + livro.getTitulo() + " do autor " + livro.getAutor() +
                " da editora " + livro.getEditora() + " adicionado com sucesso!");

    }

}
