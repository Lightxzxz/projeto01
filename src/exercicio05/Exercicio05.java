package exercicio05;

public class Exercicio05 {
    public static void main(String[] args) {
        Paralelepipedo paralelepipedo = new Paralelepipedo(2.00f, 3.00f, 5.00f);

        System.out.println("O volume do paralelepípedo é de " + paralelepipedo.calcularVolume());

        System.out.println("A área do paralelepípedo é de " + paralelepipedo.calcularArea());

    }
}
