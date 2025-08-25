package exercicio06;

public class Exercicio06 {
    public static void main(String[] args) {
        Cilindro cilindro = new Cilindro(3.00f, 8.00f);

        System.out.println("A área lateral do cilindro vale: " + cilindro.calcularAreaLateral());

        System.out.println("A área total do cilindro vale: " + cilindro.calcularAreaTotal());

        System.out.println("O volume do cilindro vale: " + cilindro.calcularVolume());
    }
}
