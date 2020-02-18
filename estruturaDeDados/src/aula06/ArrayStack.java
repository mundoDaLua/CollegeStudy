package aula06;

import aula05.Livro;

public class ArrayStack {

    Livro top;
    int size;

    public ArrayStack(int size) {
        this.size = size;
    }

    public void setSize(int size) {
        System.out.println("Please, inform the size of the stack: ");
        this.size = size;
    }

    Livro bookStack[] = new Livro[size];



    public void push(Livro newBook) {
        bookStack[size] = newBook;
        size++;
        System.out.println("The book " + newBook.getTitulo() + " is on the stack");
    }

    public Livro pop(Livro lastBook) {
        System.out.println("The book " + lastBook + " was on the stack, not anymore.");
        return lastBook;
    }

//    public boolean isEmpity() {
//
//    }

}
