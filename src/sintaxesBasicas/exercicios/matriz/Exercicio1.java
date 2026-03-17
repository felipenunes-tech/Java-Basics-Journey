package sintaxesBasicas.exercicios.matriz;

import java.util.Scanner;

/**
 * Crie uma matriz de inteiros 3x3.
 *
 * O que fazer: Use o Scanner com dois laços for (um para a linha e outro para a coluna)
 * para pedir que o usuário digite 9 números. Depois, crie outro conjunto de laços para
 * imprimir esses números na tela exatamente no formato de uma tabela (3 linhas por 3 colunas).
 *
 */
public class Exercicio1 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i< matriz.length;i++){

            for (int j = 0;j< matriz.length;j++){
                System.out.print("Insira o valor da posição (" + (i+1) + ", "+ (j+1) +"): ");
                matriz[i][j] = sc.nextInt();
            }
        }
        sc.close();
        System.out.println("Matriz completa: 1");
        for (int i = 0; i< matriz.length;i++){
            System.out.println();
            for (int j = 0;j< matriz.length;j++){
                System.out.print( "| "+ matriz[i][j]+ " ");
            }
            System.out.print("|");
        }
    }

}
