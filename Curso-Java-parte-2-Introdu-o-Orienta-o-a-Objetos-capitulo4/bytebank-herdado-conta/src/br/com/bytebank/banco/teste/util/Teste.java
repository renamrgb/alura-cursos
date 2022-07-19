package br.com.bytebank.banco.teste.util;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta cc = new ContaCorrente(111, 2222);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(222, 3333);
        lista.add(cc2);

        System.out.println(lista.size());

        System.out.println(lista.get(0));

        lista.remove(1);
        System.out.println(lista.size());

        Conta cc3 = new ContaCorrente(333, 333);
        lista.add(cc3);

        Conta cc4 = new ContaCorrente(444, 3334443);
        lista.add(cc4);

        for ( Object o : lista) {
            System.out.println(o);
        }

    }
}
