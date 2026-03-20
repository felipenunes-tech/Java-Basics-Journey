package sintaxesBasicas.tratamentoDeExcecao;

public class DivisaoNaoExata extends Exception {
    private int num;
    private int den;

    public DivisaoNaoExata(int num, int den){
        super();
        this.num = num;
        this.den = den;
    }

    public String toString(){
        return "Resultado de " + num + "/" + den + " não é um inteiro ";
    }
}

