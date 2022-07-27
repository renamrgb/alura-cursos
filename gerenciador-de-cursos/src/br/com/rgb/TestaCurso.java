package br.com.rgb;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.List;

public class TestaCurso {
    public static void main(String[] args) {
        Curso curso = new Curso("Dominando as coloções", "paulo");
        //curso.getAulas().add(new Aula("Trabalhando com arraylist", 21));
        curso.adiciona(new Aula("Trabalhando com arraylist", 21));
        curso.adiciona(new Aula("Criando uma aula", 20));
        curso.adiciona(new Aula("Modelando com coleções", 22));

        System.out.println(curso.getAulas());


    }
}
