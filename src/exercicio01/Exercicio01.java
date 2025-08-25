package exercicio01;

public class Exercicio01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Pedro", 80.00f, 1.79f, "Masculino");

        System.out.println(" O IMC de "+ pessoa.nome +" é "+ pessoa.calcularImc());
    }
}
