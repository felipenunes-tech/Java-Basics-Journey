package sintaxesBasicas.poo.interfaces;

public class Cachorro extends Mamifero implements AnimalEstimacao{
    private int tamanho;
    private String raca;

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public void amamentar() {
        System.out.println("Amamentando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Au");

    }

    @Override
    public void brincar() {
        System.out.println("Brincando");
    }

    @Override
    public void passear() {
        System.out.println("Passeando");
    }
}
