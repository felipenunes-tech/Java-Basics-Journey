package sintaxesBasicas.exercicios.loops;

import javax.xml.transform.Source;
import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        boolean validar = false;
        do{
            System.out.print("Digite seu noem: ");
            nome = sc.nextLine();
            if (nome.length()>=3){
                validar = true;
                System.out.println("Nome válido");
            }
            else{
                System.out.println("O nome deve conter ao minimo 3 caracteres");
            }
        }while(!validar);
        validar = false;

        int idade;
        do{
            System.out.print("Digite sua idade: ");
            idade = sc.nextInt();
            if (idade > 0 && idade < 150){
                validar = true;
                System.out.println("idade válida");
            }
            else{
                System.out.println("Idade inválida");
            }
        }while(!validar);

        validar = false;
        double salario;
        do{
            System.out.print("Digite seu salario: ");
            salario = sc.nextDouble();
            if (salario >0){
                validar = true;
                System.out.println("Salario válido");
            }
            else{
                System.out.println("O salário tem que ser maior que 0");
            }
        }while(!validar);

        sc.nextLine();

        String sexo;
        validar = false;
        do{
            System.out.print("Digite seu sexo (m/f): ");
            sexo = sc.nextLine();
            if (sexo.trim().equalsIgnoreCase("f") || sexo.trim().equalsIgnoreCase("m") ){
                validar = true;
                System.out.println("Sexo válido");
            }
            else{
                System.out.println("Sexo invalido ");
            }
        }while(!validar);

        String estadoCivil;
        validar = false;
        do{
            System.out.print("Digite seu esta civil (m/c/v/d): ");
            estadoCivil = sc.nextLine();
            if (estadoCivil.trim().equalsIgnoreCase("s") || estadoCivil.trim().equalsIgnoreCase("c") || estadoCivil.trim().equalsIgnoreCase("v" ) || estadoCivil.trim().equalsIgnoreCase("D")){
                validar = true;
                System.out.println("Estado civil válido");
            }
            else{
                System.out.println("Estado civil invalido ");
            }
        }while(!validar);

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario );
        System.out.println("Estado civil: " + estadoCivil.toUpperCase());

        sc.close();

    }

}
