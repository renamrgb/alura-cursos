package br.com.bytebank.banco.teste;

public class Teste {
    public static void main(String[] args) {
        int[] idade = new int[5];


        for (int i = 0; i < idade.length; i++) {
            idade[i] = i * i + 20 ;
        }

        for (int i = 0; i < idade.length; i++) {
            System.out.println(idade[i]);
        }
    }
}
