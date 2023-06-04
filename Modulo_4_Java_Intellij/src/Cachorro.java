// Classe filha ou subclasse

public class Cachorro extends Animal {

    // Atributos específicos para o cachorro

    //Construtor
    public Cachorro() {
    }

    public Cachorro(String cor,int tamanho, int qtdPatas, double peso){
        super(cor, tamanho, qtdPatas, peso);
    }

    void latir() {
        System.out.println("Latir");
    }

    void latir(String pessoa) {
        System.out.println("Latir para " + pessoa);
    }

    // Sobrescrita de método => Sobreposição
    @Override
    void correr() {
        super.correr(); //Implementação padrão
        System.out.println("cachorro com patas: " + this.quantidadePatas);
    }

}
