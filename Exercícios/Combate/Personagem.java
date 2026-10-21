public class Personagem {
    private String nome;
    private int vida;
    private int forca;
    private Arma arma;

    public Personagem(String nome, int vida, int forca, Arma arma) {
        if (vida>0 && forca>0){
            this.nome = nome;
            this.vida = vida;
            this.forca = forca;
            this.arma = arma;
        }
        else{
            System.out.println("Valores inválidos!");
        }
    }

    public int calcularDano(){
        if (this.getForca()>0){
            return getForca() + this.arma.bonusAtivo();
        }
        return 0;
    }

    public void receberDano(int dano){
        if(dano>0 && this.getVida()>0){
            if(this.getVida()<dano){
                this.vida=0;
            }
            this.vida-=dano;
        }
    }

    public boolean estaVivo(){
        if(this.getVida()==0){
            return false;
        }
        return true;
    }

    public boolean atacar(Personagem alvo){
        if(this.estaVivo() && alvo.estaVivo() && this.arma.getDurabilidade()>0){
            if (alvo==this) {
                return false;
            }
            alvo.receberDano(this.calcularDano());
            this.arma.usar();
            return true;
        }
        return false;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public int getForca() {
        return forca;
    }

    public Arma getArma() {
        return arma;
    }
}
