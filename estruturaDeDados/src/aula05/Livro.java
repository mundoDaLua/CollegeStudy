package aula05;

public class Livro {

    private String titulo;
    private String autor;
    private String editora;

    public Livro() {

    }

//    public Livro(String autor, String editora) {
//        this.autor = autor;
//        this.editora = editora;
//        this.titulo = titulo;
//    }

    public Livro(String titulo, String autor, String editora) {
        this.autor = autor;
        this.editora = editora;
        this.titulo = titulo;
    }

    public String getTitulo() {
        System.out.println();
        return titulo;
    }
    public void setTitulo(String titulo) {
        System.out.println();
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }
    public void setEditora(String editora) {
        this.editora = editora;
    }
}
