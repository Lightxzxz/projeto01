package exercicio06;

public class Cilindro {
    float raio, altura;

    public Cilindro (float raio, float altura){
        if (raio < 0){
            throw new IllegalArgumentException("O raio não pode ser valor negativo");
        }
        if (altura < 0){
            throw new IllegalArgumentException("A altura não pode ser valor negativo");
        }
        this.altura = altura;
        this.raio = raio;
    }

    public float calcularAreaLateral(){
        return 2 * 3.1415f * raio * altura;
    }

    public float calcularAreaTotal(){
        return 2 * 3.1415f * raio * (altura + raio);
    }

    public float calcularVolume(){
        return 3.1415f * raio * raio * altura;
    }

}
