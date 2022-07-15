import javax.swing.*;

public class TestaGetESet {
    public static void main(String[] args) {
        Conta conta = new Conta(100,100);
        conta.setNumero(1337);
        System.out.println(conta.getNumero());

        Cliente cliente = new Cliente();
        cliente.setNome("Renam G Bulhões");
        conta.setTitular(cliente);

        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("Programador");



    }
}
