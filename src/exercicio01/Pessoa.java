package exercicio01;

public class Pessoa {

    String nome, sexo;
    float peso, altura;

    public Pessoa (String nome, float peso, float altura, String sexo){
        this.altura = altura;
        this.nome = nome;
        this.peso = peso;
        this.sexo = sexo;
    }

    public float calcularImc(){
        float calcularImc;
        return calcularImc = peso / (altura*altura);
    }

}
