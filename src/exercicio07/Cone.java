package exercicio07;



public class Cone {
    float raio, altura;

    public Cone (float raio, float altura){
        this.raio = raio;
        this.altura = altura;
    }

    public float calculoGeratriz(){
        return (float) Math.sqrt((altura * altura)+ (raio * raio));
    }

    public float calculoAreaLateral(){
        return 3.1415f * raio * calculoGeratriz();
    }

    public float calculoAreaTotal(){
        return 3.1415f * raio * (calculoGeratriz() + raio);
    }

    public float calculoVolume(){
        return 1.0f/3.0f * 3.1415f * (raio * raio) * altura;
    }

}
