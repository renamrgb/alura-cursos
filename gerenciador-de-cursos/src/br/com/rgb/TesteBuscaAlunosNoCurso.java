package br.com.rgb;

public class TesteBuscaAlunosNoCurso {
    public static void main(String[] args) {
        Curso curso = new Curso("Dominando as coloções", "paulo");
        curso.adiciona(new Aula("Trabalhando com arraylist", 21));
        curso.adiciona(new Aula("Criando uma aula", 20));
        curso.adiciona(new Aula("Modelando com coleções", 22));

        Aluno a1 = new Aluno("Rodrigo turini", 34672);
        Aluno a2 = new Aluno("Guilherme silveira", 5167);
        Aluno a3 = new Aluno("Mauricio aniche", 17645);

        curso.matricular(a1);
        curso.matricular(a2);
        curso.matricular(a3);

        System.out.println("Quem é o aluno com matricula 5617");
        Aluno aluno = curso.buscaMatriculado(5168);
        System.out.println("Aluno: " + aluno);
    }
}
