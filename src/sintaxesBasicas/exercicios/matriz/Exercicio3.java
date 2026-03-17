package sintaxesBasicas.exercicios.matriz;

import java.util.Scanner;

/**
 * Crie uma matriz 3x4 (3 linhas e 4 colunas) e preencha com números aleatórios variados.
 *
 * O que fazer: Percorra toda a matriz para descobrir qual é o maior número armazenado nela.
 * No final, imprima qual foi esse maior valor e também a sua "coordenada", ou seja, e
 * m qual linha e qual coluna ele foi encontrado.
 *
 */

public class Exercicio3 {
    public static void main(String[] args) {
        double[][] matriz = new double[3][4];
        Scanner sc = new Scanner(System.in);
        double maior = matriz[0][0];

        for (int i = 0; i< matriz.length; i++){
            for (int j = 0;j< matriz[i].length;j++){
                System.out.print("Digite o valor na posição ("+(i+1)+", "+ (j+1) + "): ");
                matriz[i][j] = sc.nextDouble();
                if (matriz[i][j] > maior){
                    maior = matriz[i][j];
                }
            }
        }
        sc.close();

        for (int i = 0; i< matriz.length; i++){
            System.out.println();
            for (int j = 0;j< matriz[i].length;j++){
                System.out.print("| "+ matriz[i][j]+ " ");
            }
            System.out.print("|");
        }
        System.out.println("\nMaior valor é: " + maior);

    }
}
