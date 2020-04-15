package tp_avaliacao01.Visualizacao;

import tp_avaliacao01.Modelo.Box;
import tp_avaliacao01.Modelo.Cd;
import tp_avaliacao01.Modelo.Dvd;
import tp_avaliacao01.Modelo.Livro;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    private int opcao;

    private ArrayList<Livro> listaLivro = new ArrayList<Livro>();
    private ArrayList<Cd> listaCd = new ArrayList<Cd>();
    private ArrayList<Dvd> listaDvd = new ArrayList<Dvd>();
    private Scanner sc = new Scanner(System.in);

    public int getOpcao() {
        return opcao;
    }

    private void adicionarLivro() {
        System.out.println("\nAdicionando um nova Livro na Lista...");
        System.out.println("Qual o nome do Livro?");
        String nome = sc.next();
        System.out.println("Qual o autor do Livro?");
        String autor = sc.next();
        System.out.println("Qual o numero de páginas do Livro?");
        int paginas = sc.nextInt();
        System.out.println("Qual o preço do Livro?");
        double preco = sc.nextDouble();
        System.out.println("Qual o status do Livro?");
        String status = sc.next();
        
        listaLivro.add(new Livro(autor, paginas, nome, preco, status));
    }

    private void adicionarCd() {
        System.out.println("\nAdicionando um novo CD na Lista...");
        System.out.println("Qual o nome do CD?");
        String nome = sc.next();
        System.out.println("Qual o Artista do CD?");
        String artista = sc.next();
        System.out.println("Qual o numero de faixas do CD?");
        int faixas = sc.nextInt();
        System.out.println("Qual o preço do CD?");
        double preco = sc.nextDouble();
        System.out.println("Qual o status do CD?");
        String status = sc.next();

        listaCd.add(new Cd(faixas, artista, nome, preco, status));
    }

    private void adicionarDvd() {
        System.out.println("\nAdicionando um novo DVD na Lista...");
        System.out.println("Qual o nome do DVD?");
        String nome = sc.next();
        System.out.println("O DVD está contido em quantos BOX?");
        int qtdBox = sc.nextInt();
        ArrayList<Box> listaBox = new ArrayList<Box>();
        for (int i = 1; i <= qtdBox; i++) {
            System.out.println("Qual o titulo do BOX de numero " + i + "?");
            String titulo = sc.next();
            Box box = new Box();
            box.setTitulo(titulo);
            listaBox.add(box);
        }
        System.out.println("Qual o Artista do DVD?");
        String artista = sc.next();
        System.out.println("Qual a duração do DVD?");
        int duracao = sc.nextInt();
        System.out.println("Qual o preço do DVD?");
        double preco = sc.nextDouble();
        System.out.println("Qual o status do DVD?");
        String status = sc.next();

        listaDvd.add(new Dvd(duracao, artista, nome, preco, status, listaBox));
    }

    private void listarProdutos() {
        System.out.println("\nMostrando todos os Produtos da Lista...\n");

        if (!listaLivro.isEmpty()) {
            System.out.println("Os Livros são: ");
            for (int i = 0; i < listaLivro.size(); i++) {
                listaLivro.get(i).getLivro();
            }
        } else {
            System.out.println("Não há Livros Cadastrados...");
        }

        if (!listaCd.isEmpty()) {
            System.out.println("\nOs CDs são: ");
            for (int i = 0; i < listaCd.size(); i++) {
                listaCd.get(i).getCd();
            }
        } else {
            System.out.println("\nNão há CDs Cadastrados...");
        }

        if (!listaDvd.isEmpty()) {
            System.out.println("\nOs DVDs são: ");
            for (int i = 0; i < listaDvd.size(); i++) {
                listaDvd.get(i).getDvd();
            }
        } else {
            System.out.println("\nNão há DVDs Cadastrados...");
        }
    }

    public void menu() {
        System.out.println("\n##################################");
        System.out.println("# 1. Adicionar Livro             #");
        System.out.println("# 2. Adicionar CD                #");
        System.out.println("# 3. Adicionar DVD               #");
        System.out.println("# 4. Listar todos os Produtos    #");
        System.out.println("# 0. SAIR                        #");
        System.out.println("##################################");
        System.out.println("\nDigite um dos numeros do Menu acima para selecionar uma opção: ");
    }

    public void escolha() {

        opcao = sc.nextInt();

        switch (opcao) {
            case 0:
                System.out.println("\nObrigado!");
                break;
            case 1:
                adicionarLivro();
                break;
            case 2:
                adicionarCd();
                break;
            case 3:
                adicionarDvd();
                break;
            case 4:
                listarProdutos();
                break;
            default:
                System.out.println("Opção invalida, digite novemente...\n");
        }
    }
}
