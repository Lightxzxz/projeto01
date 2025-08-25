package exercicio04;

public class Exercicio04 {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(10.00f, 3.00f);

        System.out.println("O calculo da area do Retângulo é de " + retangulo.calcularArea());

        System.out.println("O calculo do Perimetro do Retângulo é de " + retangulo.calcularPerimetro());
    }
}
