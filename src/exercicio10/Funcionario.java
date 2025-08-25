package exercicio10;

public class Funcionario {
    String nome;
    int numFilhos;
    float salario;

    public Funcionario (String nome, int numFilhos, float salario){
        this.nome = nome;
        this.numFilhos = numFilhos;
        this.salario = salario;
    }

    public float calcularAumentoSalarial(double percentual){
        salario += salario * (percentual / 100);
        return salario;
    }

    public float calcularInss(){
        if(salario <= 2545.00f){
            return 0.06f * salario;
        }else{
            return 0.1f * salario;
        }
    }

    public float calcularImpostoRenda(){
        int isento = 0;

        if(salario <= 1903.98f){
            return isento;
        } else if (salario >= 1903.99f && salario <= 2826.65f) {
            return 0.075f * salario;
        } else if (salario >= 2826.66f && salario <= 3751.05f) {
            return 0.15f * salario;
        } else if (salario >= 3751.06f && salario <= 4664.68f) {
            return 0.225f * salario;
        }else {
            return 0.275f * salario;
        }
    }

    public float calcularIRPF(){
        return calcularImpostoRenda() - ( 545.00f * numFilhos);
    }
}
