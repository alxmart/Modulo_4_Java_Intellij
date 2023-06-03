
public class Usuario {

    //Atributos:
    String email;
    String senha;

    // Construtor

    Usuario() {

    }

    // Assinatura de Método ou Construtor: Nome + (Parâmetro e Tipo)

    Usuario(String email, String senha) {
        System.out.println("Autenticação por email e senha.");
//        this.email = email;
//        this.senha = senha;
    }

    // Sobrecarga de construtor
    Usuario(String telefone) {
        System.out.println("Autenticação por telefone.");
    }

    //Metodo:

    void logar(String email, String senha) {
        System.out.println("Autenticacao por email e senha");
    }

    void logar(String telefone) {
        System.out.println("Autenticacao por telefone");
    }

    void logar(String email, int token) {
        System.out.println("Autenticacao por Token");
    }

    void verificarUsuarioLogado() {
    }

    void calcularIMC() {
    }

    void pretoEBranco(String imagem) {
        System.out.println("Filtro preto e branco padrão");
    }

    void pretoEBranco(String imagem, int nivel) {
        System.out.println("Filtro preto e branco com nível");
    }

    void pretoEBranco(String imagem, double opacidade) {
        System.out.println("Filtro preto e branco com opacidade");
    }














}
