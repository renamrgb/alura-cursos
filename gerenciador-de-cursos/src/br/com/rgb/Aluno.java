package br.com.rgb;

public class Aluno {
    private String nome;
    private int numeroMatricula;

    public Aluno(String nome, int numeroMatricula) {
        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
    }

    public String nome() {
        return nome;
    }

    public int numeroMatricula() {
        return numeroMatricula;
    }

    @Override
    public String toString() {
        return "[" +  this.nome + ", matricular: " + this.numeroMatricula + "]";
    }
}
