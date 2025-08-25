package exercicio10;

public class Exercicio10 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Pedro", 2, 2300.00f);

        System.out.println("INSS: " + funcionario.calcularInss());

        funcionario.calcularAumentoSalarial(10);

        System.out.println("Salário após aumento: " + funcionario.salario);

        System.out.println("Imposto de renda: " + funcionario.calcularImpostoRenda());

        System.out.println("Valor mensal do IRPF: " + funcionario.calcularIRPF());
    }
}
