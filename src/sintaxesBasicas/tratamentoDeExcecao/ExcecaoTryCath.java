package sintaxesBasicas.tratamentoDeExcecao;

public class ExcecaoTryCath {
    public static void main(String[] args ) {
        int[] vetor = new int[4];

        try{
            System.out.println("Antes da exception");
            vetor[3] = 1;
            System.out.println("Deu bom");

        }catch(ArrayIndexOutOfBoundsException exception){
            System.out.println("Depois da exception");
        }



    }
}
