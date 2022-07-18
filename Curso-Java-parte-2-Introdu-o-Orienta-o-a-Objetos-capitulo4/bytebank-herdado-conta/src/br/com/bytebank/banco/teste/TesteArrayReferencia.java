package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayReferencia {
    public static void main(String[] args) {
        ContaCorrente[] contas = new ContaCorrente[5];

        ContaCorrente cc1 = new ContaCorrente(111,1111);
        ContaCorrente cc2 = new ContaCorrente(222,2222);
        contas[0] = cc1;
        contas[1] = cc2;

        System.out.println(cc1.getAgencia());
        System.out.println(cc2.getAgencia());
    }
}