package sintaxesBasicas.poo.relacionamento;

public class TesteContato {
    public static void main(String[] args) {
        Contato contato = new Contato();
        contato.setNome("Brum");

        //Telefone
        Telefone telefone = new Telefone();
        telefone.setDdd("021");
        telefone.setTipo("Celular");
        telefone.setNumero("40028922");

        Telefone telefone2 = new Telefone();
        telefone2.setDdd("031");
        telefone2.setTipo("Celular");
        telefone2 .setNumero("22982004");

        Telefone[] telefones = new Telefone[2];
        telefones[0] = telefone;
        telefones[1] = telefone2;

        contato.setTelefones(telefones);

        //Endereço
        Endereco end = new Endereco();
        end.setNomeRua("Rua abebe bikila");
        end.setNumero("n/a");
        end.setComplemento("Castelos e ruinas");
        end.setCidade("Rio de janeiro");
        end.setCep("021");

        contato.setEndeco(end);

        //Outputs
        System.out.println(contato.getNome());

        if(contato !=null &&contato.getEndeco()!=null){
            System.out.println(contato.getEndeco().getNomeRua());
        }

        if(contato !=null && contato.getTelefones() !=null ){
            for(Telefone t :contato.getTelefones()){
                System.out.println(t.getDdd()+ " " + t.getNumero());
            }
        }

    }

}
