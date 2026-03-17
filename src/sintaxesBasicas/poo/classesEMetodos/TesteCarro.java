package sintaxesBasicas.poo.classesEMetodos;

public class TesteCarro {
    public static void main(String[] args) {
        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.passageiros = 10;
        van.capacidadeCombstivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.println(van.marca);
        System.out.println(van.modelo);
        van.exibirAutonomia();

        double autonomia = van.obterAutonomia();

        System.out.println("A autonomia do carro é:" + autonomia);

        double qtdCombustivel = van.calculaCombustivel(10);
        System.out.println("Quantidade = "+ qtdCombustivel);

        Carro van2 = new Carro("Fiat","Ducato",10,100,0.2);
        System.out.println(van2.marca);

    }
}
