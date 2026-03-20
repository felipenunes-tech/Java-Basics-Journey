package sintaxesBasicas.tratamentoDeExcecao;

import java.util.Scanner;

public class UsandoThrows {
    public static void main(String[] args) {
        try {
            double n = lerNumero();
            System.out.println("Você digitou "+ n);
        } catch (Exception e) {
            System.out.println("Entrada invalida");
            throw new RuntimeException(e);
        }


    }
    public static double lerNumero() throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número");
        double n = sc.nextDouble();
        return n;
    }
}
