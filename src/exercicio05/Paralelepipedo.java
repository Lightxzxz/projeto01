package exercicio05;

public class Paralelepipedo {
    float altura, largura, comprimento;

    public Paralelepipedo(float altura, float largura, float comprimento){
        this.altura = altura;
        this.largura = largura;
        this.comprimento = comprimento;
    }

    public float calcularVolume(){
        return altura * comprimento * largura;
    }

    public float calcularArea(){
        return 2 * (altura * largura + altura * comprimento + largura * comprimento);
    }
}
