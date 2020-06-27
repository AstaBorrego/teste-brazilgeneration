package br.com.projeto3;

public class Empregado {

    private String nome;
    private String sobreNome;
    private double salarioMensal;

    public Empregado() {
    }

    public Empregado(String nome, String sobreNome, double salarioMensal) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.salarioMensal = salarioMensal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    @Override
    public String toString() {
        return "Empregado {" +
                "nome='" + nome + '\'' +
                ", sobreNome='" + sobreNome + '\'' +
                ", salario Mensal=" + salarioMensal +
                ", salario Anual=" + (salarioMensal * 12) +
                '}';
    }
}
