public class Variables {

    public static void main(String[] args) {

        // byte  -128  /  127
        // short -32.768 / 32.767
        // int  -2.147.483.648 / 2.147.483.647
        // long -9.223.372.036.854.775.808 / 9.223.372.036.854.775.807
        // float  até 7 casas decimais
        // double até 15 casas decimais
        // boolean   true / false
        // char  1 caracter

        String nome;
        nome = "Homer J Simpson";
                Integer idade = 48;
        System.out.println("Usuário: " + nome + "\nIdade: " + idade);

        final Double PI = 3.14;
        System.out.println("Valor de PI: " + PI);

        int num = 10;
        num++;
        System.out.println("Número: " + num);

        // Tipos PRIMITIVOS  (começam com letras minúsculas)
        // byte , int, float, double, boolean

        boolean ligado = true;
        System.out.println("A lâmpada está ligada ? " + ligado);

        byte idade2 = 52;
        System.out.println("Idade2: " + idade2);

        int numCasa = 1250;
        System.out.println("Casa: " + numCasa);

        float precoProduto = 34.99f;
        System.out.println("Preço: " + precoProduto);

        double total = 34.99f;
        System.out.println("Total: " + total);

        // Classes WRAPPER
        // Byte, Integer, Double, Float

        Byte idadeC = 52;
        Integer numeroCasaC = 1250;
        Double totalC = 456.98;
        String nomeC = "Bart";
        System.out.println("IdadeC: " + idadeC);




    }
}
