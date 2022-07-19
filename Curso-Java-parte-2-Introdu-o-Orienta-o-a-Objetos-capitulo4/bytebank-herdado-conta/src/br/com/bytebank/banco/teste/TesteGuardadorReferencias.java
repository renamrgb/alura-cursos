package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.GuardadorDeReferencias;

public class TesteGuardadorReferencias {
    public static void main(String[] args) {
       GuardadorDeReferencias guadador = new GuardadorDeReferencias();

       Conta cc = new ContaCorrente(222,333);
       guadador.adiciona(cc);

        Conta cc2 = new ContaCorrente(222,333);
        guadador.adiciona(cc2);

        int tamanho = guadador.getQuantidadeElementos();

        System.out.println(tamanho);

        Conta ref = (Conta) guadador.getReferencia(1);

        System.out.println(ref.getNumero());
    }
}
