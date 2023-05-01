public class Loops_While_Do_While_For {

    public static void main(String[] args) {

        int num = 10;
        num += 1;
        System.out.println("Numero: " + num);

        num = 0;
        while (num < 10) {
            System.out.println("Numero: " + num);
            num++;
        }

//----------------------------------------------------------

        String[] postagens = {
                "Fui a praia...",
                "Fazendo trilha",
                "Viagem para Nordeste",
                "Estudando Java e Kotlin"
        };

        //----------------------------------------------------

        System.out.println("\nUsando o For");
        int i;
        for (i = 0; i <= 3; i++) {
            System.out.println("Postagem: " + (i + 1) + " " + postagens[i]);
        };
//        Postagem: 1 Fui a praia...
//        Postagem: 2 Fazendo trilha
//        Postagem: 3 Viagem para Nordeste
//        Postagem: 4 Estudando Java e Kotlin

        //-------------------------------------------------------------

        System.out.println("\nUsando While" );
        int numero = 0;
        while (numero <= 3) {
            System.out.println("Postagem: " + (numero + 1)
                    + " " + postagens[numero]);
            numero++;
        };

        //----------------------------------------------------

        System.out.println("\nUsando Do While" );
        int numerox = 0;
        do {
            System.out.println("Postagem: " + (numerox + 1)
                    + " " + postagens[numerox]);
            numerox++;
        } while (numerox <= 3);


    }
}
