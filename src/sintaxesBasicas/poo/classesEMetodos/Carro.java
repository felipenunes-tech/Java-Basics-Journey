package sintaxesBasicas.poo.classesEMetodos;

public class Carro {
    String marca;
    String modelo;
    int passageiros;
    double capacidadeCombstivel;
    double consumoCombustivel;

    Carro(){
        System.out.println("Carro foi instanciado");
    }
    Carro (String marca_,String modelo_, int passageiros_, double capacidadeCombstivel_, double consumoCombustivel_){
        marca = marca_;
        passageiros = passageiros_;
        capacidadeCombstivel = capacidadeCombstivel_;
        consumoCombustivel = consumoCombustivel_;
    }

    void exibirAutonomia(){
        System.out.println("Autonomia é: "+ (capacidadeCombstivel * consumoCombustivel) + "/km");
    }

    double obterAutonomia(){
        System.out.println("Método obterAutonomia foi chamado");
        return capacidadeCombstivel*consumoCombustivel;
    }

    double calculaCombustivel(double km){
        double qntCombustivel = km/consumoCombustivel;
        return qntCombustivel;
    }

}
