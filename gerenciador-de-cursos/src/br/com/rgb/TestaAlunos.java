package br.com.rgb;

import java.util.Collection;
import java.util.HashSet;

public class TestaAlunos {
    public static void main(String[] args) {
        Collection<String> alunos = new HashSet<>();

        alunos.add("Rodrigo turini");
        alunos.add("Alberto souza");
        alunos.add("Nico steppat");
        alunos.add("Sergio lopes");
        alunos.add("Renan saggio");
        alunos.add("Mauricio Aniche");

        boolean pauloEstaMatriculado = alunos.contains("Paulo silveira");
        alunos.remove("Sergio lopes");
        System.out.println(pauloEstaMatriculado);

        for (String aluno: alunos) {
            System.out.println(aluno);
        }


        System.out.println(alunos);
    }
}
