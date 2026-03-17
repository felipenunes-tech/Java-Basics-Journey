package sintaxesBasicas.exercicios.matriz;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Crie uma matriz quadrada de 4x4 e preencha-a com números inteiros
 * O que fazer: A "diagonal principal" de uma matriz é formada pelos elementos onde o índice da linha
 * é exatamente igual ao índice da coluna (ex: matriz[0][0], matriz[1][1], etc.).
 * Escreva um código que percorra a matriz e imprima apenas os números que estão nessa diagonal
 */

public class Exercicio2 {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        Scanner sc = new Scanner(System.in);

        for (int i =0; i < matriz.length; i++){
            for(int j= 0; j< matriz.length; j++){
                System.out.print("Insira o valor da posição (" + (i+1) + ", "+ (j+1) +"): ");
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matriz diagonal");
        for (int i =0; i < matriz.length; i++){
            for(int j= 0; j< matriz.length; j++){
                if(i==j){
                    System.out.print( "| "+ matriz[i][j]+ " ");
                }
            }


        }


    }
}
