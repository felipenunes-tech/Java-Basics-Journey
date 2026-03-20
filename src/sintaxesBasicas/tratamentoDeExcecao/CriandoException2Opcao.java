package sintaxesBasicas.tratamentoDeExcecao;

public class CriandoException2Opcao {
    public static void main(String[] args) {
        try {
            teste();
        } catch (DivisaoNaoExata e) {
            throw new RuntimeException(e);
        }
    }


    public static void teste() throws DivisaoNaoExata{
        int[] numeradores = {10,822,4,9,6,1};
        int[] denominadores = {2,0,8,0,6,12};

        for(int i=0;i< numeradores.length; i++){
            try{
                if (numeradores[i] %2 !=0){
                    throw new DivisaoNaoExata(numeradores[i], denominadores[i]);
                }
                System.out.println(numeradores[i] + "/" + denominadores[i] +" = " + (numeradores[i]/denominadores[i]));
            }catch(ArithmeticException  | ArrayIndexOutOfBoundsException e){
                System.out.println("Erro em algo");
                e.printStackTrace();
            }
        }
    }
}
