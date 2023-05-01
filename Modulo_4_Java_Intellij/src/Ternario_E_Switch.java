public class Ternario_E_Switch {

    public static void main(String[] args) {

        // TERNÁRIO
        int idade = 12;
        String texto = (idade >= 18) ? "Maior" : "MENOR";
        System.out.println(texto);

        //SWITCH

        int opcao = 18;
        switch (opcao) {
            case 1:
                System.out.println("Saldo atual.");
                break;
            case 2:
                System.out.println("Extrato conta.");
                break;
            case 3:
                System.out.println("Extrato cartão");
                break;
            default:
                System.out.println("Nenhuma opção selecionada.");
                break;
        }


    }
}
