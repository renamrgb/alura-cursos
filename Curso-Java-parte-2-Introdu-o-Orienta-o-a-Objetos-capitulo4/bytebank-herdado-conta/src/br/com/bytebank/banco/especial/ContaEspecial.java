package br.com.bytebank.banco.especial;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;
import br.com.bytebank.banco.modelo.Tributavel;

public class ContaEspecial extends Conta  {

    public ContaEspecial(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }
}
