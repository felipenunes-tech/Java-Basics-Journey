package sintaxesBasicas.exercicios.arrays;

import java.util.Scanner;
/**
 * Crie um array A e faça com que o arraay B[i] = A[i]
 */
public class Exercicio2 {
    public static void main(String[] args) {
        int[] A = new int[8];
        int[] B = new int[A.length];

        Scanner sc = new Scanner(System.in);

        for(int i = 0;i< A.length; i++){
            System.out.print("Digite o valor da posicção " + (i+1) + ": ");
            A[i] = sc.nextInt();
            B[i] = A[i] * 2;
        }
        sc.close();

        System.out.print("Valores de A: ");
        for (int temp : A){
            System.out.print(temp + " ");
        }

        System.out.println();
        System.out.print("Valores em B: ");
        for (int temp : B){
            System.out.print(temp + " ");
        }
    }
}
