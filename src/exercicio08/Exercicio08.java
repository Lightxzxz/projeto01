package exercicio08;

public class Exercicio08 {
    public static void main(String[] args) {
        Paciente paciente = new Paciente("Pedro", 1.80f, 81.12f);

        System.out.println("IMC: " + paciente.calcularIMC());

        System.out.println(paciente.calcularFaixaPeso());
    }
}
