package tp_aula06;

public class ContaBancaria {

    String titular;
    int numeroConta;
    int numeroAgencia;
    double saldo;

    public ContaBancaria(String titular, int numeroConta, int numeroAgencia, double saldo) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public double getSaldo() {
        return saldo;
    }
    public void deposita(double saldo) {
        this.saldo += saldo;
    }

    public boolean saca(double valor) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            System.out.println("Saldo insuficiente para ser sacado!");
            return false;
        }
    }

    public void transfere(double valor, ContaBancaria destino) {
        if(this.saca(valor)) {
            destino.deposita(valor);
        } else {
            System.out.println("Saldo insuficiente para ser sacado!");
        }
    }
}
