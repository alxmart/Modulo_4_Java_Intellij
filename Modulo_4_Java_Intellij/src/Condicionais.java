public class Condicionais {

    public static void main(String[] args) {

        byte idade = 15;

        if (idade >= 18) {
            System.out.println("Pode acessar o App");
        } else {
            System.out.println("Não pode entrar no App");
        }

//---------------------------------------------------------------

        double compras = 300.0;

        if ((compras >= 300) && (idade >= 50)) {
            System.out.println("Recebe desconto de 30%");
        } else {
            System.out.println("Sem desconto.");
        }

//-----------------------------------------------------

       int num1 = 20;
       int num2 = 20;

       if (num1 > num2 ) {
           System.out.println("Num 1 é maior");
       } else if (num2 > num1) {
           System.out.println("num 2 é maior");
       } else {
           System.out.println("São iguais");
       }


    }
}
