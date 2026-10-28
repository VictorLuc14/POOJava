package Combate;

public class Arma {
    private String nome;
    private int bonusDano;
    private int durabilidade;

    public Arma(String nome, int bonusDano, int durabilidade) {
        if (bonusDano<=0 || durabilidade<=0){
            System.out.println("Valor inválido!");
            return;
        }
        this.nome = nome;
        this.bonusDano = bonusDano;
        this.durabilidade = durabilidade;
    }

    public int bonusAtivo(){
        if (this.getDurabilidade()>0){
            return this.getBonusDano();
        }
        return 0;
    }

    public void usar(){
        if (this.getDurabilidade()>0) {
            this.durabilidade--;
        }
    }

    public String getNome() {
        return nome;
    }

    public int getBonusDano() {
        return bonusDano;
    }

    public int getDurabilidade() {
        return durabilidade;
    }
}
