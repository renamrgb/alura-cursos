public class TesteTributaveis {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(222,2222);
        contaCorrente.deposita(100);

        SeguroDeVida seguroDeVida = new SeguroDeVida();

        CalculadorDeImposto calculadorDeImposto = new CalculadorDeImposto();

        calculadorDeImposto.registra(seguroDeVida);
        calculadorDeImposto.registra(contaCorrente);

        System.out.println(calculadorDeImposto.getTotalImposto());
    }
}
