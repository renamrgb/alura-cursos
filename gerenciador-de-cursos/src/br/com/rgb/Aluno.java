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

    public int getnumeroMatricula() {
        return numeroMatricula;
    }
    @Override
    public boolean equals(Object obj) {
        Aluno outro = (Aluno) obj;
        return this.nome.equals(outro.nome());
    }

    @Override
    public int hashCode() {
        return this.nome.hashCode();
    }
    @Override
    public String toString() {
        return "[" +  this.nome + ", matricular: " + this.numeroMatricula + "]";
    }
}
