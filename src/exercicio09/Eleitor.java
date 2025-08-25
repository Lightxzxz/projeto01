package exercicio09;

public class Eleitor {
    String nome;
    int anoDeNasc;

    public Eleitor(String nome, int anoDeNasc){
        this.nome = nome;
        this.anoDeNasc = anoDeNasc;
    }

    public String tipoEleitor(){
        int idade = 2025 - anoDeNasc;

        if(idade < 16){
            return "Não Eleitor";
        } else if (idade >= 16 && idade <18) {
            return "Eleitor Facultativo";
        } else if (idade >= 18 && idade <= 65){
            return "Eleitor Obrigatório";
        }else {
            return "Eleitor Facultativo";
        }
    }
}
