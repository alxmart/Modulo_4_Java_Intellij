public class RunJogador {

    public static void main(String[] args) {

        Jogador homer = new Jogador();

        homer.kart = "Normal";
        homer.pneu = "Cross";
        homer.planador = "Paraquedas";

        Jogador computer = new Jogador();

        computer.pneu = "Avançado";

        homer.acelerar();

        computer.acelerar();

    }
}
