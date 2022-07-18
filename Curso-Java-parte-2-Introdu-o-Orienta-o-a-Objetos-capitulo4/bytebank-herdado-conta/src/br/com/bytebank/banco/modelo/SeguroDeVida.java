package br.com.bytebank.banco.modelo;

public class SeguroDeVida implements Tributavel{

    @Override
    public double getValoriImposto() {
        return 42;
    }
}
