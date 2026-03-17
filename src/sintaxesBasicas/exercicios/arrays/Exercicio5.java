package sintaxesBasicas.exercicios.arrays;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Crie um array de String contendo 5 nomes de linguagens de programação
 * (ou qualquer outro texto que preferir).
 *
 * O que fazer: Escreva um loop que percorra o array de trás para frente e imprima os
 * nomes na ordem inversa à que foram inseridos (do último elemento, índice 4, até o primeiro,
 * índice 0).
 */

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] ling = new String[5];

        System.out.println("Digite 5 linguagens de programação: ");
        for (int i= 0;i< ling.length;i++){
            System.out.print((i+1) + "°: ");
            ling[i] = sc.nextLine();
        }
        System.out.println("ordem normal: ");
        for(String temp : ling){
            System.out.print(temp + "| ");
        }
        System.out.println();
        System.out.println("Ordem inversa: ");
        for(int i = ling.length-1; i > -1; i--){
            System.out.print(ling[i] + "| ");
        }
        sc.close();

    }
}
