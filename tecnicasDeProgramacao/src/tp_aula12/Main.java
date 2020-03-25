package tp_aula12;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Sorteio sorteio = new Sorteio();

        System.out.println("Lançando o dado de 6 lados...");
        sorteio.setSorteio();
        Thread.sleep(2000); // Pausa a execussão do programa por 2000ms
        System.out.println("O dado caiu no valor: " + sorteio.getSorteio());
        System.out.println("Lançando o dado de 6 lados...");
        sorteio.setSorteio();
        Thread.sleep(2000);
        System.out.println("O dado caiu no valor: " + sorteio.getSorteio());
        System.out.println("Lançando o dado de 6 lados...");
        sorteio.setSorteio();
        Thread.sleep(2000);
        System.out.println("O dado caiu no valor: " + sorteio.getSorteio());
        System.out.println("Lançando o dado de 6 lados...");
        sorteio.setSorteio();
        System.out.println("O dado caiu no valor: " + sorteio.getSorteio());

    }
}
