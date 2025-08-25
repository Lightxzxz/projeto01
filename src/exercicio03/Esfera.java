package exercicio03;

public class Esfera {
    double raio;



    public Esfera(double raio){

        if (raio < 0){
            throw new IllegalArgumentException("O raio não pode ser negativo");
        }
        this.raio = raio;
    }

    public double calcularArea(){
        return (double) 4 * 3.1415 * (raio*raio);
    }

    public double calcularVolume(){
        return (double) (4.00f / 3.00f) * 3.1415 * (raio*raio*raio);
    }


}
