package sintaxesBasicas.exercicios.loops;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String user;
        String senha;

        do {
            System.out.print("Digite seu usuário: ");
            user = sc.nextLine();
            System.out.print("Digite sua senha: ");
            senha = sc.nextLine();
            if(user.equalsIgnoreCase(senha)){
                System.out.println("o usuário e a senha não podem ser correspondentes, digite novamente");
            }

        }while(user.equalsIgnoreCase(senha));



    }
}
