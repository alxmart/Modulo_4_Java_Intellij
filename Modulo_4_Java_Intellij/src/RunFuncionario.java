
public class RunFuncionario {
    public static void main(String[] args) {

        Funcionario zeruela = new Funcionario();
        zeruela.salario = 1000.0;

        double salarioTotal = zeruela.calcSalComDesconto(80.0);

        System.out.println("Salário Total: " + salarioTotal);

    }
}
