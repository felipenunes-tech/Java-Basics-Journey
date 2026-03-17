package sintaxesBasicas.poo.relacionamento;

public class Contato {
    private String nome;
    private Endereco endeco;
    private Telefone[] telefones;

    public Telefone[] getTelefones() {
        return telefones;
    }

    public void setTelefones(Telefone[] telefones) {
        this.telefones = telefones;
    }

    public Endereco getEndeco() {
        return endeco;
    }

    public void setEndeco(Endereco endeco) {
        this.endeco = endeco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
