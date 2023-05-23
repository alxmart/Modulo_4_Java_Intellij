
class Usuario {
   // Atributos
    String email;
    String senha;

    // Construtor
    Usuario() {

        System.out.println("Construtor chamado");

    }


    //Metodo
    void verificarUsuarioLogado() {
        System.out.println("Verificando Usuário logado");
    }


    public static void main(String[] args) {

        Usuario usuario = new Usuario();
        usuario.email = "homer@springfield.com";
        usuario.senha = "bart123";
        usuario.verificarUsuarioLogado();
    }

}


