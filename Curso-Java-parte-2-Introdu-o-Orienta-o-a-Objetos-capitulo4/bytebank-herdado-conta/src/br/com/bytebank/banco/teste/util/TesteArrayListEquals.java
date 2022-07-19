package br.com.bytebank.banco.teste.util;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.util.ArrayList;

public class TesteArrayListEquals {
    public static void main(String[] args) {

        ArrayList<Conta> lista = new ArrayList<>();

        Conta cc = new ContaCorrente(1111, 1111);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(2222, 2222);
        lista.add(cc2);

        boolean existe = lista.contains(cc2);

        System.out.println("Existe " + existe);
        for (Object o : lista) {
            System.out.println(o);
        }

    }
}
