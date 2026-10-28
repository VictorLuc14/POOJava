package Combate;

public class Guardiao extends Personagem{
    private int armadura;

    public Guardiao(String nome, int vida, int forca, Arma arma, int armadura) {
        super(nome, vida, forca, arma);
        if (armadura>=0) {
            this.armadura = armadura;
        }
    }

    @Override
    public void receberDano(int dano) {
        if (dano>0 && dano>getArmadura()){
            super.receberDano(dano-getArmadura());
        }
    }

    public int getArmadura() {
        return armadura;
    }
}
