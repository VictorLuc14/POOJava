package Combate;

public class Mago extends Personagem {
    private int poderMagico;
    private int mana;

    public Mago(String nome, int vida, int forca, Arma arma, int poderMagico, int mana) {
        super(nome, vida, forca, arma);
        if (poderMagico>0 && mana>0) {
            this.poderMagico = poderMagico;
            this.mana = mana;
        }
    }

    @Override
    public int calcularDano() {
        if (this.getMana()>=10) {
            return super.calcularDano() +this.getPoderMagico();
        }
        return super.calcularDano();

    }

    @Override
    public boolean atacar(Personagem alvo) {
        if (this.getMana()>=10){
            this.mana--;
        }
        return super.atacar(alvo);
    }

    public int getPoderMagico() {
        return poderMagico;
    }

    public int getMana() {
        return mana;
    }
}
