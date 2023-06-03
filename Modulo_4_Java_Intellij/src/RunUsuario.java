public class RunUsuario {

    public static void main(String[] args) {

        Usuario usuario = new Usuario();
        //usuario.logar("j@com","1111122");
        //usuario.logar("11-9-9999-0000");
        usuario.logar("j@com", 635);

        usuario.pretoEBranco("iamgem", 0.25);

        //Usuario usuario = new Usuario("jamilton@gmail.com", "123456");

        //Sobrecarga de construtor: (Caso 2 - por telefone)
        //Usuario usuario = new Usuario("11-9-9999-0000");
        //Usuario usuario = new Usuario();
        //usuario.calcularIMC();

        //System.out.println("Email: " + usuario.email + " Senha: " + usuario.senha);

        /*usuario.email = "jamilton@gmail.com";
        usuario.senha = "123456";
        usuario.verificarUsuarioLogado();*/

    }
}
