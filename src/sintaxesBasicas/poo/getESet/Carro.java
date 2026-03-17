package sintaxesBasicas.poo.getESet;

public class Carro {
    String marca;
    String modelo;
    int passageiros;
    double capacidadeCombstivel;
    double consumoCombustivel;

    public double getConsumoCombustivel() {
        return consumoCombustivel;
    }

    public void setConsumoCombustivel(double consumoCombustivel) {
        this.consumoCombustivel = consumoCombustivel;
    }

    public double getCapacidadeCombstivel() {
        return capacidadeCombstivel;
    }

    public void setCapacidadeCombstivel(double capacidadeCombstivel) {
        this.capacidadeCombstivel = capacidadeCombstivel;
    }

    public int getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(int passageiros) {
        this.passageiros = passageiros;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
