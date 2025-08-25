package exercicio02;

public class Piramide {

    float base, altura;

    public Piramide(float base, float altura){
        this.base = base;
        this.altura = altura;
    }

    public float calcularVolume(){
        return (base * altura) / 3;
    }
}
