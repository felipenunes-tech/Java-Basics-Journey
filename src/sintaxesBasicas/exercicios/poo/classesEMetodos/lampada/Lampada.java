package sintaxesBasicas.exercicios.poo.classesEMetodos.lampada;

public class Lampada {
    String tipo;
    String cor;
    double wattts;
    String marca;
    boolean acesa;

    void ligar(){
        if (acesa){
            System.out.println("a lampada já está ligada");
        }
        else{
            System.out.println("Ligando a lampada");
            acesa = true;
        }
    }

    void desligar(){
        if (!acesa){
            System.out.println("a lampada já está desligada");
        }
        else{
            System.out.println("Desligando a lampada");
            acesa = false;
        }
    }


}
