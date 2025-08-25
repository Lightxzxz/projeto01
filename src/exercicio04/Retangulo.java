package exercicio04;

public class Retangulo {
    float comprimento, largura;

    public Retangulo(float comprimento, float largura){
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public float calcularPerimetro(){
        return (comprimento*2) + (largura*2);
    }

    public float calcularArea(){
        return largura * comprimento;
    }
}
