package br.com.rgb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {
    public static void main(String[] args) {
        Curso curso = new Curso("Dominando as coloções", "paulo");
        //curso.getAulas().add(new Aula("Trabalhando com arraylist", 21));
        curso.adiciona(new Aula("Trabalhando com arraylist", 21));
        curso.adiciona(new Aula("Criando uma aula", 20));
        curso.adiciona(new Aula("Modelando com coleções", 22));


        List<Aula> aulasimutavies = curso.getAulas();

        List<Aula> aulas = new ArrayList<>(aulasimutavies);

        Collections.sort(aulas);
        System.out.println(aulas);

        System.out.println(curso.getTempoTotal());

        System.out.println(curso);

    }
}
