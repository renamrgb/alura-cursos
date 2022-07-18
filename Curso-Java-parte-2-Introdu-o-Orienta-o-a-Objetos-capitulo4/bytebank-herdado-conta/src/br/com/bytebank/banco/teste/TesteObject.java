package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteObject {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(111,1111);


        System.out.println(cc);
    }
}
