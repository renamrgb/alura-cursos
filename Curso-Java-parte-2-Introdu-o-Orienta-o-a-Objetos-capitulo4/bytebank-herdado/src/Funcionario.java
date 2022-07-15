public abstract class Funcionario {
    private final double BONIFICACAO = 0.05;

    private String nome;
    private String cpf;
    private double salario;


    public abstract double getBonificacao();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    @Override
    public String toString() {
        return "Nome : " + this.nome
                + " Salario: " + this.salario
                + " cpf: " + this.cpf
                + " Bonificação: " + getBonificacao();
    }
}
