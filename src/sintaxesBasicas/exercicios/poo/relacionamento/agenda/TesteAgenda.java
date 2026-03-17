package sintaxesBasicas.exercicios.poo.relacionamento.agenda;

import java.util.Scanner;

public class TesteAgenda {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Contato[] contatos = new Contato[3];
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o nome da agenda: ");
        agenda.setNome(sc.nextLine());


        for(int i=0;i< contatos.length; i++){
            Contato temp = new Contato();
            System.out.print("Entre com o nome do " + (i+1) + "° contato: ");
            temp.setNome(sc.nextLine());
            System.out.print("Número: ");
            temp.setTelefone(sc.nextLine());
            System.out.print("Email: ");
            temp.setEmail(sc.nextLine());
            contatos[i] = temp;
        }

        agenda.setContatos(contatos);


        System.out.println(agenda.getNome());
        if(agenda !=null && agenda.getContatos() != null){
            for(Contato c : agenda.getContatos()){
                System.out.println(c.getNome() + " " + c.getTelefone() + " " + c.getEmail());
            }
        }



    }
}
