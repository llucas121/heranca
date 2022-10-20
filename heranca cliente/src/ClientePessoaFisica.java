public class ClientePessoaFisica  extends Cliente{
    String cpf;

    ClientePessoaFisica(String nome, String endereco, String cpf){
       super(nome,endereco);
       this.cpf = cpf;

    }


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
