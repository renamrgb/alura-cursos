package br.com.rgb;

import org.w3c.dom.ls.LSOutput;

public class TestaCursoComAluno {
    public static void main(String[] args) {
        Curso curso = new Curso("Dominando as coloções", "paulo");
        curso.adiciona(new Aula("Trabalhando com arraylist", 21));
        curso.adiciona(new Aula("Criando uma aula", 20));
        curso.adiciona(new Aula("Modelando com coleções", 22));

        Aluno a1 = new Aluno("Rodrigo turini", 34672);
        Aluno a2 = new Aluno("Guilherme silveira", 5617);
        Aluno a3 = new Aluno("Mauricio aniche", 17645);

        curso.matricular(a1);
        curso.matricular(a2);
        curso.matricular(a3);

        System.out.println("Todos alunos matriculados");

        curso.getAlunos().forEach(a -> {
            System.out.println(a);
        });

       // System.out.println("o aluno " + a1 + " está matriculado?");
       // System.out.println(curso.estaMatriculado(a1));


        Aluno turini =  new Aluno("Rodrigo turini",34672 );

        System.out.println(curso.estaMatriculado(turini));

        System.out.println(a1.equals(turini));




    }



}
