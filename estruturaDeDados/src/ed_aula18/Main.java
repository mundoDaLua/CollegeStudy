package ed_aula18;

import ed_aula11.Item;

public class Main {

    public static void main(String[] args) {

        PilhaAutorreferenciada pilhaAutorreferenciada = new PilhaAutorreferenciada();

        System.out.println("\nVazio? " + pilhaAutorreferenciada.isEmpty());
        System.out.println("Tamanho da Pilha: " + pilhaAutorreferenciada.getTamanhoPilha());
        System.out.println("Pop: \n" + pilhaAutorreferenciada.pop());
        System.out.println("Tamanho da Pilha: " + pilhaAutorreferenciada.getTamanhoPilha());

        Item caxa1 = new Item("Caixa da Sala");
        pilhaAutorreferenciada.push(caxa1);
        System.out.println("\nVazio? " + pilhaAutorreferenciada.isEmpty());
        System.out.println("Tamanho da Pilha: " + pilhaAutorreferenciada.getTamanhoPilha());
        System.out.println("Pop: \n" + pilhaAutorreferenciada.pop());
        System.out.println("Vazio? " + pilhaAutorreferenciada.isEmpty());
        System.out.println("Tamanho da Pilha: " + pilhaAutorreferenciada.getTamanhoPilha());

        pilhaAutorreferenciada.push(new Item("Caixa do Quarto"));
        pilhaAutorreferenciada.push(new Item("Caixa da Cozinha"));
        System.out.println("\nVazio? " + pilhaAutorreferenciada.isEmpty());
        System.out.println("Tamanho da Pilha: " + pilhaAutorreferenciada.getTamanhoPilha());
        System.out.println("Pop: \n" + pilhaAutorreferenciada.pop());
        System.out.println("Pop: \n" + pilhaAutorreferenciada.pop());
        System.out.println("Vazio? " + pilhaAutorreferenciada.isEmpty());
        System.out.println("Tamanho da Pilha: " + pilhaAutorreferenciada.getTamanhoPilha());

        pilhaAutorreferenciada.push(new Item("Caixa do Banheiro"));
        pilhaAutorreferenciada.push(new Item("Caixa da Área de Serviços"));
        pilhaAutorreferenciada.push(new Item("Caixa da Garagem"));
        pilhaAutorreferenciada.push(new Item("Caixa do Porão"));
        System.out.println("\nVazio? " + pilhaAutorreferenciada.isEmpty());
        System.out.println("Tamanho da Pilha: " + pilhaAutorreferenciada.getTamanhoPilha());
        System.out.println("Pop: \n" + pilhaAutorreferenciada.pop());
        System.out.println("Pop: \n" + pilhaAutorreferenciada.pop());
        System.out.println("Vazio? " + pilhaAutorreferenciada.isEmpty());
        System.out.println("Tamanho da Pilha: " + pilhaAutorreferenciada.getTamanhoPilha());
    }

}
