package tp_aula08;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Pessoa {

    private String nome;
    private String sexo;
    private String dataNascimento;
    private double altura;
    private int idade;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getPessoa() {
        getIdade();
        return "{" +
                "\n    Nome: " + nome + "," +
                "\n    Sexo: " + sexo + "," +
                "\n    Data Nascimento: " + dataNascimento + "," +
                "\n    Idade: " + idade + "," +
                "\n    Altura: " + altura +
                "\n}";
    }

    private int getIdade() {
        int dia = Integer.parseInt(dataNascimento.substring(0, 2));
        int mes = Integer.parseInt(dataNascimento.substring(3, 5));
        int ano = Integer.parseInt(dataNascimento.substring(6, 10));

        GregorianCalendar calendar = new GregorianCalendar();

        int diaHoje = calendar.get(Calendar.DATE);
        int mesHoje = calendar.get(Calendar.MONTH)+1;
        int anoHoje = calendar.get(Calendar.YEAR);

        idade = anoHoje - ano - 1;

        if (mesHoje > mes) {
            idade++;
        } else if (mesHoje == mes) {
            if (diaHoje >= dia) {
                idade++;
            }
        }

        return idade;
    }
}