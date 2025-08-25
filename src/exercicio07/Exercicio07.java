package exercicio07;

public class Exercicio07 {
    public static void main(String[] args) {
        Cone cone = new Cone(4.00f, 3.00f);

        System.out.println("Cálculo da geratriz: " + cone.calculoGeratriz());

        System.out.println("Cálculo da área lateral: " + cone.calculoAreaLateral());

        System.out.println("Cálculo da área total: " + cone.calculoAreaTotal());

        System.out.println("Cálculo do volume: " + cone.calculoVolume());
    }
}
