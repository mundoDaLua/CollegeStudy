package dev.barcelosluan.n1;

public class Evento {

    private String nome;
    private String data;
    private int id;
    private String aux;

    public Evento() {
    }

    public Evento(String nome, String data, int id) {
        this.nome = nome;
        this.data = data;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
