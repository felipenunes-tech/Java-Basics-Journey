package sintaxesBasicas.exercicios.arrays;

/**
 Dado um array de inteiros já inicializado com valores diversos (por exemplo:
 int[] numeros = {15, 8, 90, 75, 102, 6, 2};), escreva um código que encontre os extremos.
 O que fazer: Percorra o array e guarde em variáveis separadas qual é o maior e o menor
 número presente nele. Imprima os dois valores no console.
 */

public class Exercicio3 {
    public static void main(String[] args) {
        int[] numeros = {15, 8, 90, 75, 102, 6, 2};

        System.out.print("Array dada: ");
        for(int temp : numeros){
            System.out.print(temp + " ");
        }
        System.out.println();
        int maior = numeros[0];
        int menor = numeros[1];


        for(int i = 0; i< numeros.length; i++){

            for(int j = 1;j<i+1;j++){
                if (maior > numeros[j]){
                    menor = numeros[j];
                }
                else {
                    maior = numeros[j];
                }
            }
        }
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);

    }
}
