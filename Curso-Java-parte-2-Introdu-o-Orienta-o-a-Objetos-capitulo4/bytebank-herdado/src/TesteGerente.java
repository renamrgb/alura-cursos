public class TesteGerente {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setNome("Renam");
        gerente.setCpf("43979966879");
        gerente.setSalario(6000);

        System.out.println(gerente.toString());

        gerente.setSenha(2222);
        boolean autentico = gerente.autentica(2222);
        System.out.println(autentico);

        System.out.println(gerente.getBonificacao());
    }
}
