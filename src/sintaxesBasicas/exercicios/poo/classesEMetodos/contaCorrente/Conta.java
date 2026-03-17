package sintaxesBasicas.exercicios.poo.classesEMetodos.contaCorrente;

public class Conta {
    int numero;
    double saldo;
    boolean especial= false;
    double limite;

    void sacar(double valor){
        if(valor<=saldo){saldo-=valor;}
        else{System.out.println("Falha ao sacar");}
    }

    void depositar(double valor){saldo+=valor;}

    void consultarSaldo(){
        System.out.println("Seu saldo é: "+saldo);
    }

}
