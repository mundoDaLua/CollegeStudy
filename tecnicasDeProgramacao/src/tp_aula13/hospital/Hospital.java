package tp_aula13.hospital;

import java.util.ArrayList;

public class Hospital {

    private String nome;
    private int capacidade;
    private int pacientesInternados;
    private ArrayList<Paciente> ala; // ArrayList tem tamanho variado, podendo delimitar apenas a capacidadeInicial
    private Medico medico;

    public Hospital() {
        setNome(null);
        setAla(5);
        this.pacientesInternados = -1;
        setMedico(null);
    }

    public Hospital(String nome, int capacidade) {
        setNome(nome);
        setAla(capacidade);
        this.pacientesInternados = -1;
        setMedico(null);
    }

    public Hospital(String nome, int capacidade, Medico medico) {
        setNome(nome);
        setAla(capacidade);
        this.pacientesInternados = -1;
        setMedico(medico);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public int getPacientesInternados() {
        return pacientesInternados;
    }

    public String getAla() {
        String listaPaciente = "[";
        if (pacientesInternados >= 0) {
            for (int i = 0; i <= getPacientesInternados(); i++) {
                if (i < (getPacientesInternados())) {
                    listaPaciente += " [ Nome Paciente: " + ala.get(i).getNome() +
                            //", Nome Mãe: " + ala.get(i).getMae() +
                            //", Data Nascimento: " + ala.get(i).getNascimento() +
                            //", Data Internacao: " + ala.get(i).getInternacao() +
                            ", Doenca: " + ala.get(i).getDoenca() + " ], ";
                } else {
                    listaPaciente += " [ Nome Paciente: " + ala.get(i).getNome() +
                            //", Nome Mãe: " + ala.get(i).getMae() +
                            //", Data Nascimento: " + ala.get(i).getNascimento() +
                            //", Data Internacao: " + ala.get(i).getInternacao() +
                            ", Doenca: " + ala.get(i).getDoenca() + " ]";
                }
            }
        }
        return listaPaciente + " ]";
    }
    public void setAla(int capacidadeMinima) {
        this.capacidade = capacidadeMinima;
        this.ala = new ArrayList<>(capacidadeMinima);
    }

    public Medico getMedico() {
        return medico;
    }
    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public void setPaciente(Paciente paciente) {
        ala.add(paciente);
        this.pacientesInternados++;
    }
}
