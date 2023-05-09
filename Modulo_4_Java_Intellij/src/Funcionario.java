class Funcionario {

    // Atributo
    double salario = 0.0;

    // Método
    double calcularSalarioComDesconto(double desc) {

        double totalComDesconto = salario - desc;

        return totalComDesconto;
    }

}