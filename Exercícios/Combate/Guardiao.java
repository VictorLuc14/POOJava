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
        if (dano>0)
        super.receberDano(dano);
    }

    public int getArmadura() {
        return armadura;
    }
}
