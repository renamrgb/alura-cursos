package br.com.rgb;

import java.util.*;

public class Curso  {

    private String nome;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<>();
    private Set<Aluno> alunos = new HashSet<>();
    private Map<Integer, Aluno> matriculaParaAluno = new LinkedHashMap<>();


    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public void adiciona(Aula aula){
        this.aulas.add(aula);
    }
    public int getTempoTotal(){
        return this.aulas.stream()
                .mapToInt(Aula::getTempo)
                .sum();
    }

    @Override
    public String toString() {
        return "[" + this.nome + ", tempo total: " + this.getTempoTotal() + "]";
    }

    public void matricular(Aluno aluno) {
        this.alunos.add(aluno);
        this.matriculaParaAluno.put(aluno.getnumeroMatricula(), aluno);
    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    public boolean estaMatriculado(Aluno aluno) {
        return this.alunos.contains(aluno);
    }


    public Aluno buscaMatriculado(int numero) {
        return matriculaParaAluno.get(numero);
    }
}
