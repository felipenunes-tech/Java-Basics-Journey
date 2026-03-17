package sintaxesBasicas.exercicios.arrays;

import java.util.Scanner;

/**
 * Crie um array de 10 posições de números inteiros e preencha-o.
 *
 * O que fazer: Crie um loop que verifique cada posição do vetor.
 * O programa deve contar quantos números são pares e quantos são ímpares,
 * e exibir essas duas quantidades no final.
 */

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        int par = 0;
        int impar = 0;

        for (int i = 0; i< num.length;i++){
            System.out.print("Digite o valor da pisicão " + (i+1) + ": ");
            num[i] = sc.nextInt();
        }

        System.out.print("Valores da array: ");
        for(int temp : num){
            System.out.print(temp + " ");
            if (temp % 2 == 0){par++;}
            else{impar++;}
        }
        sc.close();
        System.out.println();
        System.out.println("Quantidade de par = "+par);
        System.out.println("Quantidade de impar = "+impar);



    }
}

