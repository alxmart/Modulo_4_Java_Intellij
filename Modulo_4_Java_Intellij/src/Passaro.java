// Classe filha ou subclasse

public class Passaro extends Animal {

    //Construtor
    public Passaro() {
    }

    public Passaro(String cor,int tamanho, int qtdPatas, double peso){
        //Fazer alguma validação
        super(cor, tamanho, qtdPatas, peso);
        //Fazer mais alguma coisa
    }

    void voar() {
        System.out.println("Voar");
    }

    // Sobrescrita de método => Sobreposição
    @Override
    void correr() {
        super.correr();//Implementação padrão
        System.out.println("pássaro com patas: " + this.quantidadePatas);
    }

}
