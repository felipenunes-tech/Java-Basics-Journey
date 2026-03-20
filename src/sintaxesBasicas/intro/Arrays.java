package sintaxesBasicas.aulas;

public class Arrays {
    public static void main(String[] args) {
        double[] temperatura = new double[365];
        temperatura[0] = 31.2;
        temperatura[1] = 30;
        temperatura[2] = 23.1;
        temperatura[3] = 15.9;

        System.out.println("Temperatura do dia 1: " + temperatura[0]);

        System.out.println("Tamanho do array: " + temperatura.length);

        //padrão
        for(int i = 0; i<temperatura.length; i++){
            System.out.println("Temperatura do dia " + (i+1) + " é " + temperatura[i]);
        }

        for(double temp: temperatura){
            System.out.println(temp);
        }



    }
}
