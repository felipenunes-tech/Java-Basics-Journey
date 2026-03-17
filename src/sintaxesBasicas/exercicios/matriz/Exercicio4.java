package sintaxesBasicas.exercicios.matriz;

import java.util.Scanner;

/**
 * Crie uma matriz 4x3 (4 linhas e 3 colunas) com valores da sua escolha.
 *
 * O que fazer: Calcule e imprima a soma dos elementos de cada linha separadamente.
 * Por exemplo: "Soma da linha 0: 45", "Soma da linha 1: 32", etc
 *
 */

public class Exercicio4 {
    public static void main(String[] args) {
        double[][] matriz = new double[4][3];
        double[] mSoma = new double[4];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i< matriz.length;i++){
            double temp = 0;
            for (int j = 0; j<matriz[j].length;j++){
                System.out.print(("Digite o valor da posição ("+ (i+1) + ", "+ (j+1) +"): "));
                matriz[i][j] = sc.nextDouble();
                temp+=matriz[i][j];
            }
            mSoma[i] = temp;
        }
        for(int i = 0; i< matriz.length;i++){
            System.out.println();
            for (int j = 0; j<matriz[j].length;j++){
                System.out.print(("|"+ matriz[i][j]));
            }
            System.out.println("|");
        }

        for(int i = 0;i< mSoma.length;i++){
            System.out.println("A soma da linha " +(i+1) +" = "+ mSoma[i]);
        }

    }
}
