public class Bucket {

    public static void main(String[] args) {

        System.out.println("---------------------------------");
        System.out.println("Hello world ! - Testing execution");

        String nome = "Zé Ruela";
        Integer numero;
        final Double PI = 3.14;
        Integer idade = 52;
        System.out.println("Usuário: " + nome + "\nIdade: " + idade);
        final Integer QTD_PESSOAS_COMPRA;
        QTD_PESSOAS_COMPRA = 2000;

        //-------------------------------------------------------
        // Tipos Primitivos
        //-------------------------------------------------------
        // byte, short, int, long, float,double, boolean, char
        byte idade2;
        idade2 = 52;
        int numeroCasa = 360;
        float preco2 = 9.99f;
        double total = 456.9867;
        boolean visivel = true;
        System.out.println("Idade: " + idade2);
        System.out.println("Casa: " + numeroCasa);

        //----------------------------------------------------
        // Classes Wrapper
        //----------------------------------------------------
        Byte idadeC = 52;
        Integer numeroCasaC = 360;
        Double totalC = 456.9867;
        String nome2 = "Homer";

        // Preferência: Tipos Primitivos

        // Aritmeticos:  +, -, /, * , %

        int num = 10 + 20;
        System.out.println(num);
        int num1 = 10;
        int num2 = 2;
        int numerox = num1 / num2;
        double resto = 10 % 2; // 0.0
        System.out.println(resto);

        //---------------------------------------------------------------

        boolean retorno = 2 == 2;
        System.out.println(retorno); // true

        short idade3 = 15;
        if (idade3 >= 18) {
            System.out.println("Maior. Acesso permitido.");
        } else {
            System.out.println("MENOR. Acesso NEGADO");
        }

        double vendas = 900.0;
        int idade4 = 66;
        if (vendas >= 300.0 && idade4 >= 50) {
            System.out.println("Ganhou desconto 30 %");
        } else {
            System.out.println("Sem desconto");
        }

        //--------------------------------------------------

        int num11 = 25;
        int num22 = 25;

        if (num11 > num22) {
            System.out.println("Num 1 é maior");
        } else if (num22 > num11) {
            System.out.println("num 2 é maior");
        } else {
            System.out.println("São iguais");
        }

        //----------------------------------------------


        // TERNÁRIO
        int idade5 = 12;
        String texto = (idade >= 18) ? "Maior" : "MENOR";
        System.out.println(texto);

        //SWITCH
        int opcao = 2;
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

        //--------------------------------------------------------------

        String[] nomes = {
                "Homer Simpson",
                "Moe Szislak",
                "Barney Gamble",
                "Bart Simpson"
        };

        System.out.println(nomes[0]);
        System.out.println(nomes[1]);
        System.out.println(nomes[2]);
        System.out.println(nomes[3]);

        int i;
        System.out.println("===========  Usando For: ==========");
        for (i = 0; i <= 3; i++) {
            System.out.println("Nome " + i + " " + nomes[i]);
        }
        ;

        //String[] joao = {"João","25"};

        String[][] conversas = {
                {"João", "Olá , tudo bem ?"},
                {"Maria", "Tudo certo"},
                {"Pedro", "Não vi"}
        };

        System.out.println("Texto: " + conversas[1][1]);

        //--------------------------------------------------

        int numb = 10;
        numb += 1;
        System.out.println("Numero: " + numb);

        numb = 0;
        while (numb < 10) {
            System.out.println("Numero: " + numb);
            numb++;
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
        int numerob = 0;
        while (numerob <= 3) {
            System.out.println("Postagem: " + (numerob + 1)
                    + " " + postagens[numerob]);

            numerob++;
        };

        //----------------------------------------------------

        System.out.println("\nUsando Do While" );
        int numeroy = 0;
        do {
            System.out.println("Postagem: " + (numerox + 1)
                    + " " + postagens[numeroy]);
            numeroy++;
        } while (numeroy <= 3);



    }
}
