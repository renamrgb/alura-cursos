package br.com.bytebank.banco.modelo;

public class GuardadorDeReferencias {

    private Conta[] referencias;
    private int posicaoLivre;
    public GuardadorDeReferencias(){
        this.referencias = new Conta[10];
    }

    public void adiciona(Conta ref){
        this.referencias[this.posicaoLivre] = ref;
        this.posicaoLivre ++;
    }

    public int getQuantidadeElementos() {
        return this.posicaoLivre;
    }

    public Conta getReferencia(int pos) {
        return this.referencias[pos];
    }
}
