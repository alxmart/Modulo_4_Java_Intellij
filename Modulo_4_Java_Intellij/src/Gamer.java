
public class Gamer {

    public static void main(String[] args) {

        Jogador alex = new Jogador();

        alex.kart = "normal";
        alex.pneu = "cross";
        alex.planador = "paraquedas";

        alex.acelerar();

//---------------------------------------------------

        Jogador computador = new Jogador();

        computador.pneu = "avançado";

        computador.acelerar();

    }
}
