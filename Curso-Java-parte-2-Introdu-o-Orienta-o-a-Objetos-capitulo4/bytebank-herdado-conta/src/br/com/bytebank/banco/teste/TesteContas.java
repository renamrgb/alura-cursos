package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteContas {
    public static void main(String[] args) throws SaldoInsuficienteException {

        ContaCorrente cc = new ContaCorrente(111, 1111);
        cc.deposita(100);

        ContaPoupanca cp = new ContaPoupanca(222, 2222);
        cp.deposita(200);

        cc.transfere(10, cp);

        System.out.println("modelo.Conta corrente: " + cc.getSaldo());
        System.out.println("modelo.Conta Poupanca: " + cp.getSaldo());

    }
}
