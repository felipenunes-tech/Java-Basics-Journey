package sintaxesBasicas.aulas;

import java.util.Random;

public class ForEach {
    public static void main(String[] args) {
        double[] nota= new double[10];
        Random random = new Random();

        for(int i=0;i< nota.length;i++){
            nota[i] = random.nextDouble(10.0);
        }
        for (double temp: nota){
            System.out.println(temp);
        }

        double[][] notasAlunos = new double[10][4];

        for (int i =0; i < notasAlunos.length; i++){
            for(int j= 0; j< notasAlunos[j].length; j++){
                notasAlunos[i][j] = random.nextDouble(10);
            }
        }

        for(double[] notasAluno : notasAlunos){
            for(double noa : notasAluno){
                System.out.print("Nota: "+ noa);
            }
        }





    }
}
