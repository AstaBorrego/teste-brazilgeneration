package br.com.projeto4;

public class InteiroSetTeste {

    public static void main(String[] args) {
        InteiroSet inteiroSet1 = new InteiroSet();
        inteiroSet1.insereElemento(101);
        inteiroSet1.insereElemento(-1);
        inteiroSet1.insereElemento(5);
        inteiroSet1.insereElemento(30);
        inteiroSet1.insereElemento(45);
        System.out.println("Valores inteiroSet1 " + inteiroSet1.toSetString());

        InteiroSet inteiroSet2 = new InteiroSet();
        inteiroSet2.insereElemento(5);
        inteiroSet2.insereElemento(21);
        inteiroSet2.insereElemento(60);
        inteiroSet2.insereElemento(80);
        inteiroSet2.insereElemento(81);
        System.out.println("Valores inteiroSet2 " + inteiroSet2.toSetString());

        InteiroSet inteiroSetUnion1 = new InteiroSet();
        inteiroSetUnion1.union(inteiroSet1, inteiroSet2);
        System.out.println("Valores inteiroSetUnion1 " + inteiroSetUnion1.toSetString());

        InteiroSet inteiroSetUnion2 = new InteiroSet();
        inteiroSetUnion2.union(inteiroSet1, inteiroSet2);
        System.out.println("Valores inteiroSetUnion2 " + inteiroSetUnion2.toSetString());
        System.out.println("inteiroSetUnion2 não é igual a inteiroSetUnion1 ? " + inteiroSetUnion2.ehIgualTo(inteiroSetUnion1));

        inteiroSetUnion2.deleteElemento(81);
        System.out.println("Valores inteiroSetUnion2 " + inteiroSetUnion2.toSetString());

        InteiroSet inteiroSetIntersecao = new InteiroSet();
        inteiroSetIntersecao.interseccao(inteiroSet2, inteiroSetUnion2);
        System.out.println("Valores inteiroSetIntersecao " + inteiroSetIntersecao.toSetString());

    }

}
