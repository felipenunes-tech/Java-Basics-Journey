package sintaxesBasicas.exercicios.loops;

import java.util.Scanner;

public class exercicio1 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        double nota;
        do {
            System.out.print("Diga uma nota de 0-10: ");
            nota = sc.nextDouble();
        }
        while(nota < 0 || nota>10);
        System.out.println("Você digitou: " + nota);

    }


}
