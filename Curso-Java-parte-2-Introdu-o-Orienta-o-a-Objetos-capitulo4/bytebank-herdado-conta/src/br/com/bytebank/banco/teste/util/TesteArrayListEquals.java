package br.com.bytebank.banco.teste.util;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.util.ArrayList;
import java.util.List;

public class TesteArrayListEquals {
    public static void main(String[] args) {

//        Conta cc = new ContaCorrente(1111, 1111);
//        Conta cc2 = new ContaCorrente(2222, 2222);
//
//        System.out.println("É igual? " + cc.isEquals(cc2));

        List<Conta> lista = new ArrayList<>();

        Conta cc = new ContaCorrente(1111, 1111);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(2222, 2222);
        lista.add(cc2);

        Conta cc3 = new ContaCorrente(2222, 2222);


        boolean existe = lista.contains(cc3);


        System.out.println("Existe ? " + existe);


        for (Conta conta : lista) {
            System.out.println(conta);
        }

    }
}
