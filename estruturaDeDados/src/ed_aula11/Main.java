package ed_aula11;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Criando uma lista de itens...");
        ListaDesordenadaVetor listaItem = new ListaDesordenadaVetor();
        System.out.println("Vazio? " + listaItem.isEmpty());
        System.out.println("Primeiro item: " + listaItem.print(0));
        System.out.println("Segundo item: " + listaItem.print(1));

        System.out.println("\nAdicionando o item Arroz 5kg na lista de itens...");
        Item arroz = new Item("Arroz 5kg", 1);
        listaItem.add(arroz);
        System.out.println("Vazio? " + listaItem.isEmpty());
        System.out.println("Primeiro item: " + listaItem.print(0));
        System.out.println("Segundo item: " + listaItem.print(1));
        System.out.println("Terceiro item: " + listaItem.print(2));

        System.out.println("\nRemovendo o Primeiro item...");
        listaItem.delete(0);
        System.out.println("Vazio? " + listaItem.isEmpty());
        System.out.println("Primeiro item: " + listaItem.print(0));
        System.out.println("Segundo item: " + listaItem.print(1));

        System.out.println("\nAdicionando o item Feijão 1kg na lista de itens...");
        Item feijao = new Item("Feijão 1kg", 3);
        listaItem.add(feijao);
        System.out.println("Adicionando o item Batata Inglesa na lista de itens...");
        Item batataInglesa = new Item("Batata Inglesa", 10);
        listaItem.add(batataInglesa);
        System.out.println("Adicionando o item Pizza de Calabresa na lista de itens...");
        Item pizzaCalabresa = new Item("Pizza de Calabresa", 4);
        listaItem.add(pizzaCalabresa);
        System.out.println("Adicionando o item Katchup na lista de itens...");
        Item katchup = new Item("Katchup", 2);
        listaItem.add(katchup);
        System.out.println("Vazio? " + listaItem.isEmpty());
        System.out.println("Primeiro item: " + listaItem.print(0));
        System.out.println("Segundo item: " + listaItem.print(1));
        System.out.println("Terceiro item: " + listaItem.print(2));
        System.out.println("Quarto item: " + listaItem.print(3));
        System.out.println("Quinto item: " + listaItem.print(4));
        System.out.println("Sexto item: " + listaItem.print(5));

        System.out.println("\nModificando o terceiro item...");
        listaItem.change(pizzaCalabresa, arroz);
        System.out.println("Modificando o quarto item...");
        Item oleoSoja = new Item("Oleo de Soja", 3);
        listaItem.change(katchup, oleoSoja);
        System.out.println("Vazio? " + listaItem.isEmpty());
        System.out.println("Primeiro item: " + listaItem.print(0));
        System.out.println("Segundo item: " + listaItem.print(1));
        System.out.println("Terceiro item: " + listaItem.print(2));
        System.out.println("Quarto item: " + listaItem.print(3));
        System.out.println("Quinto item: " + listaItem.print(4));
        System.out.println("Sexto item: " + listaItem.print(5));

        System.out.println("\nRemovendo o ultimo item adicionado na lista...");
        listaItem.delete(3);
        System.out.println("Vazio? " + listaItem.isEmpty());
        System.out.println("Primeiro item: " + listaItem.print(0));
        System.out.println("Segundo item: " + listaItem.print(1));
        System.out.println("Terceiro item: " + listaItem.print(2));
        System.out.println("Quarto item: " + listaItem.print(3));
        System.out.println("Quinto item: " + listaItem.print(4));

        System.out.println("\nRemovendo o primeiro item da lista...");
        listaItem.delete(0);
        System.out.println("Vazio? " + listaItem.isEmpty());
        System.out.println("Primeiro item: " + listaItem.print(0));
        System.out.println("Segundo item: " + listaItem.print(1));
        System.out.println("Terceiro item: " + listaItem.print(2));
        System.out.println("Quarto item: " + listaItem.print(3));

        System.out.println("\nRemovendo todos os itens da lista...");
        listaItem.delete(1);
        listaItem.delete(0);
        System.out.println("Vazio? " + listaItem.isEmpty());
        System.out.println("Primeiro item: " + listaItem.print(0));
        System.out.println("Segundo item: " + listaItem.print(1));
    }
}
