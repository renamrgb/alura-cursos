package br.com.bytebank.banco.modelo;

/**
 * Clase representa a moldura de uma conta
 *
 *
 * @author Renam bulhoes
 *
 * @version 0.1
 */
public abstract class Conta {

    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;


    private static int total;


    /**
     * Construtor para inicializar um objeto apartir de agencia e numero
     * @param agencia
     * @param numero
     */
    public Conta(int agencia, int numero) {
        total++;
        this.agencia = agencia;
        this.numero = numero;
    }

    public abstract void deposita(double valor);

    /**
     * Valor que precisa ser maior que o saldo
     *
     * @param valor
     * @throws SaldoInsuficienteException
     */
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