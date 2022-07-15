public class SistemaInterno {

    private final int SENHA  = 2222;

    public void autentica(Autenticavel autenticavel){
        if(autenticavel.autentica(this.SENHA)){
            System.out.println("Pode entrar no sistema");
            return;
        }
        System.out.println("Não pode entrar no sistem");


    }
}
