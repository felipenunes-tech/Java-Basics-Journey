package sintaxesBasicas.tratamentoDeExcecao;

public class ExceptionGenerico {
    public static void main(String[] args) {
        int[] numeradores = {9,8,7,9,6};
        int[] denominadores = {5,0,3,0};

        for(int i=0;i< numeradores.length; i++){
            try{
                System.out.println(numeradores[i] + "/" + denominadores[i] +" = " + (numeradores[i]/denominadores[i]));
            }catch(Exception e){
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
            finally {
                System.out.println();
            }
        }
    }
}
