package tp_aula11;

public class Main {

    public static void main(String[] args) {

        Empresa pizzaHut = new Empresa("Piza Hut", "Rua das ruas, Nº 42", "74.000-000", "(62) 3222-2222");
        Empresa pitdogDaEsquina = new Empresa();
        System.out.println(pizzaHut.getEmpresa());
        System.out.println("\n" + pitdogDaEsquina.getEmpresa());

        pizzaHut.setEmpresa("Pizza Hut", "Avenida das avenidas, Nº 333", "74.000-333", "(62) 9 9999-9999");
        pitdogDaEsquina.setEmpresa("Piti Dogui", "Rua da esquina, SN", "74.333.333", "(62) 3333-3333");
        System.out.println("\n" + pizzaHut.getEmpresa() + "\n\n" + pitdogDaEsquina.getEmpresa());

    }
}
