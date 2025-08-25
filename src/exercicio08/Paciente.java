package exercicio08;

public class Paciente {
    String nome;
    float altura, peso;

    public Paciente(String nome, float altura, float peso){
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
    }

    public float calcularIMC(){
        return peso / (altura * altura);
    }

    public String calcularFaixaPeso(){
        float imc = calcularIMC();

        if (imc < 20){
            return "Abaixo do peso ideal";
        }else if (imc >= 20 && imc <= 25){
            return "Peso normal";
        } else if (imc > 25 && imc <= 30) {
            return "Excesso de peso";
        } else if (imc > 30 && imc <= 35) {
            return "Obesidade";
        } else {
            return "Obesidade mórbida";
        }

    }

}
