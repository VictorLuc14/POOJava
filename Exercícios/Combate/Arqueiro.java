package Combate;

public class Arqueiro extends Personagem {
    private int precisao;
    private int flechas;

    public Arqueiro(String nome, int vida, int forca, Arma arma, int flechas, int precisao) {
        super(nome, vida, forca, arma);
        if (flechas>0 && precisao>0) {
            this.flechas = flechas;
            this.precisao = precisao;
        }
    }

    @Override
    public int calcularDano() {
        if(this.getFlechas()>0){
            return super.calcularDano()+this.getPrecisao();
        }
        return super.calcularDano();
    }

    @Override
    public boolean atacar(Personagem alvo) {
        if (this.getFlechas()>0){
            this.flechas--;
        }
        return super.atacar(alvo);
    }

    public int getPrecisao() {
        return precisao;
    }

    public int getFlechas() {
        return flechas;
    }
}
