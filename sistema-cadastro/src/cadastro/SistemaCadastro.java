package cadastro;

public class SistemaCadastro {

    public static void main(String[] args) {
        Pessoa marcos = new Pessoa("23453422211", "Marcos");

        marcos.setEndereco("RUA DAS MARIAS");

        System.out.println(marcos.getNome() + '-' + marcos.getCpf());
    }

}
