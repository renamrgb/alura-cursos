public class TesteConexao {
    public static void main(String[] args) {


        try (Conexao conexao = new Conexao()) {
                conexao.leDados();
        } catch (IllegalStateException e){
            System.out.println("Deu erro na conexao");
        }


        //-------------------------------------------


//        Conexao con = new Conexao();
//        try {
//            con.leDados();
//        } catch (Exception e) {
//            System.out.println("Erro na conexao");
//        } finally {
//            System.out.println("Finaly");
//            con.fecha();
//        }

    }
}
