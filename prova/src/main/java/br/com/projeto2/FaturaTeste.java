package br.com.projeto2;

public class FaturaTeste {

    public static void main(String[] args) {
        Fatura fatura1 = new Fatura();
        fatura1.setNumero("1");
        fatura1.setDescricao("Fatura 1");
        fatura1.setQuantidadeCompradaItem(3);
        fatura1.setPrecoPorItem(12.25d);

        Fatura fatura2 = new Fatura();
        fatura2.setNumero("2");
        fatura2.setDescricao("Fatura 2");
        fatura2.setQuantidadeCompradaItem(3);
        fatura2.setPrecoPorItem(-12.25d);

        Fatura fatura3 = new Fatura();
        fatura3.setNumero("3");
        fatura3.setDescricao("Fatura 3");
        fatura3.setQuantidadeCompradaItem(8);
        fatura3.setPrecoPorItem(0.87d);

        System.out.println("Total da fatura " + fatura1.getNumero() + " R$ : " + fatura1.getTotalFatura());
        System.out.println("Total da fatura " + fatura2.getNumero() + " R$ : " + fatura2.getTotalFatura());
        System.out.println("Total da fatura " + fatura3.getNumero() + " R$ : " + fatura3.getTotalFatura());

    }

}
