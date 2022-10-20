public class Main{
    public static void main(String[] args){
        ClientePessoaFisica cli = new
                ClientePessoaFisica("fulano","Rua tal","123");
       Main.imprime(cli);

    }
     public static void imprime(ClientePessoaFisica c){
        System.out.println("nome"+ c.getNome());
        System.out.println("endereco"+c.getEndereco());
        System.out.println("cpf"+c.getCpf());
    }
}