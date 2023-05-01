public class OperAritRelacLogicos {

    public static void main(String[] args) {

    //  +  ,  -  ,  /  ,  *  ,  %

    int num = 10 + 5;
    num -= 3;

    num %= 2;   // usado, por exemplo: cor: Não , cor: sim

    num = 1 + 2 * 2;

    int n1 = 10;
    int n2 = 30;
    int numero = n1 + n2;


    System.out.println("Resultado: "  + num);
    System.out.println("Resultado: "  + numero);

    //-----------------------------------------------------

    //    > , < , >= , <= , == ,  !=

    boolean retorno = 1 == 1;
        System.out.println(retorno);

        int idadex = 15;
        retorno = idadex >17;
        System.out.println(retorno);

        double compras = 100.00;
        byte idade = 65;

    //  && (And)   || ( Or)  ! (Not)

        if ((compras >= 300) || (idade >= 50)) {
            System.out.println("Recebe desconto de 30%");
        } else {
            System.out.println("Sem desconto.");
        }











    }
}
