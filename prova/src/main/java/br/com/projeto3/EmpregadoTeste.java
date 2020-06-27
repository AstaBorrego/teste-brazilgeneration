package br.com.projeto3;

public class EmpregadoTeste {

    public static void main(String[] args) {
        Empregado empregado1 = new Empregado("Juca", "Bala", 1000d);
        Empregado empregado2 = new Empregado("Joao", "Teste", 2000d);

        System.out.println(empregado1);
        System.out.println(empregado2);

        // aplicar aumento de 10%
        aplicarAumento(empregado1, 10);
        aplicarAumento(empregado2, 10);

        // exibir novo salario
        System.out.println(empregado1);
        System.out.println(empregado2);
    }

    public static void aplicarAumento(Empregado empregado, double percentual) {
        double valorReajuste = empregado.getSalarioMensal() * (percentual / 100);
        double novoSalario = empregado.getSalarioMensal() + valorReajuste;
        empregado.setSalarioMensal(novoSalario);
    }
}
