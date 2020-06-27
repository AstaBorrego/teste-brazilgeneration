package br.com.projeto2;

public class Fatura {

    private String numero;
    private String descricao;
    private int quantidadeCompradaItem;
    private double precoPorItem;

    public Fatura() {
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidadeCompradaItem() {
        return quantidadeCompradaItem;
    }

    public void setQuantidadeCompradaItem(int quantidadeCompradaItem) {
        this.quantidadeCompradaItem = quantidadeCompradaItem;
    }

    public double getPrecoPorItem() {
        return precoPorItem;
    }

    public void setPrecoPorItem(double precoPorItem) {
        this.precoPorItem = precoPorItem;
    }

    public double getTotalFatura() {
        double result = quantidadeCompradaItem * precoPorItem;
        return result < 0.0d ? 0.0d : result;
    }
}
