package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class Teste {
    public static void main(String[] args) {


        int idade = 29;

        Integer idadeRef = Integer.valueOf(29);

        int valor = idadeRef.intValue();

        String s = "12";


        System.out.println(idadeRef.doubleValue());

        System.out.println(Integer.MIN_VALUE);
//        System.out.println(Integer.valueOf(s));

        System.out.println(Integer.parseInt(s));
        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(idadeRef);

    }
}
