
class Funcionario {

    double salario = 0.0;

    double calcSalComDesconto(double bonus) {

        double totalComDesconto = salario - 20.00 + bonus;

        return totalComDesconto;
    }

}