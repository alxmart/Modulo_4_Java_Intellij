public class Heranca {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro();
        cachorro.cor = "Marrom";
        cachorro.correr();
        cachorro.dormir();
        cachorro.latir();

        System.out.println("==================================");

        Passaro passaro = new Passaro();
        passaro.cor = "Azul";
        passaro.correr();
        passaro.dormir();
        passaro.voar();

    }

}
