package sintaxesBasicas.poo.polimorfismo;

public class Aluno extends Pessoa {

    private String curso;
    private double[] notas;

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }


    public double calculaMedia(){
        return 0;
    }
    public boolean verificarAprovado(){
        return true;
    }

    public String obterEtiquetaEndereco(){
        String s = "Endereço do aluno\n";
        s+= super.getEndereco();
        return s;
    }
}
