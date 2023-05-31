
public class RunJogador {

    public static void main(String[] args) {

        Jogador homer = new Jogador();
        homer.kart = "normal";
        homer.pneu = "cross";
        homer.planador = "paraquedas";

        Jogador computador = new Jogador();
        computador.pneu = "Avançado";

        homer.acelerar();
        computador.acelerar();

    }
}
