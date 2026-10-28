package Combate;

public class Guerreiro extends Personagem{
    private int bonusEspada;

    public Guerreiro(String nome, int vida, int forca, Arma arma, int bonusEspada) {
        super(nome, vida, forca, arma);
        if (bonusEspada>=0) {
            this.bonusEspada = bonusEspada;
        }
    }

    @Override
    public int calcularDano() {
        return super.calcularDano()+this.getBonusEspada();
    }

    public int getBonusEspada() {
        return bonusEspada;
    }
}
