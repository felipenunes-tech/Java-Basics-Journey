package sintaxesBasicas.aulas;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tetra campeão da libertadores é o... ");
        String time1 = sc.nextLine();
        System.out.println("E no rio não tem outro igual, só o " + time1 + " é campeão mundial..." );

        System.out.print("Nome de uma seleção?");
        String time2 = sc.next();

        System.out.println("Você pensa que o " + time2 +" é time, o " + time2 + " não é time não,time é o" +
                "Vasco da Gama, o " + time2 + "é seleção");
    }


}
