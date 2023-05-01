public class Arrays {
    public static void main(String[] args) {

        String nome = "Maggie";

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
        for (i =0; i <= 3; i++) {
            System.out.println("Nome " + i + " " + nomes[i]);
        };

        //String[] joao = {"João","25"};

        String[][] conversas = {
                {"João","Olá , tudo bem ?"},
                {"Maria","Tudo certo"},
                {"Pedro","Não vi"}
        };

        System.out.println("Texto: " + conversas[1][1]);





    }
}
