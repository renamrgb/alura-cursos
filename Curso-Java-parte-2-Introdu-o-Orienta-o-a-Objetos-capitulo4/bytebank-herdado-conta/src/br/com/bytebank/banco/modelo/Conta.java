package br.com.bytebank.banco.modelo;

public abstract class Conta {

    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;


    private static int total;


    public Conta(int agencia, int numero) {
        total++;
        this.agencia = agencia;
        this.numero = numero;
    }

    public abstract void deposita(double valor);

    public void saca(double valor) throws SaldoInsuficienteException {


        if (this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo: " + this.saldo + " Valor a sacar: " + valor);
        }
        this.saldo -= valor;
    }

    public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
        saca(valor);
        destino.deposita(valor);
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setAgencia(int agencia) {
        if (agencia <= 0) {
            System.out.println("Não pode atribuir valor menor que zero para agencia");
            return;
        }
        this.agencia = agencia;
    }

    public void setNumero(int numero) {
        if (numero <= 0) {
            System.out.println("Não pode atribuir valor menor que zero para numero");
            return;
        }
        this.numero = numero;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return total;
    }
}