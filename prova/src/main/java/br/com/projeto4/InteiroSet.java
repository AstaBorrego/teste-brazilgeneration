package br.com.projeto4;

public class InteiroSet {

    private boolean[] valores;

    public InteiroSet() {
        this.valores = new boolean[101];
    }

    public void union(InteiroSet v1, InteiroSet v2) {
        for (int i = 0 ; i < valores.length; i++) {
            valores[i] = v1.valores[i] || v2.valores[i];
        }
    }

    public void interseccao(InteiroSet v1, InteiroSet v2) {
        for (int i = 0 ; i < valores.length; i++) {
            valores[i] = v1.valores[i] && v2.valores[i];
        }
    }

    public void insereElemento(int valor) {
        if (valor > valores.length - 1) {
            System.out.println("Valor informado maior que o tamanho do array. Nenhum valor alterado");
        }
        else if (valor < 0) {
            System.out.println("Valor informado invalido. Nenhum valor alterado");
        }
        else {
            valores[valor] = true;
            System.out.println("Valor " + valor + " inserido com sucesso");
        }
    }

    public void deleteElemento(int valor) {
        if (valor > valores.length - 1) {
            System.out.println("Valor informado maior que o tamanho do array. Nenhum valor alterado");
        }
        else if (valor < 0) {
            System.out.println("Valor informado invalido. Nenhum valor alterado");
        }
        else {
            valores[valor] = false;
            System.out.println("Valor " + valor + " deletado com sucesso");
        }
    }

    public String toSetString() {
        StringBuilder values = new StringBuilder("");

        for (int i = 0 ; i < valores.length; i++) {
            if (valores[i]) {
                values.append(i).append(" ");
            }
        }

        String result = values.toString();

        return result.isEmpty() ? "-" : result;
    }

    public boolean ehIgualTo(InteiroSet compare) {
        for (int i = 0 ; i < valores.length; i++) {
            if (valores[i] != compare.valores[i]) {
                return false;
            }
        }

        return true;
    }
}
