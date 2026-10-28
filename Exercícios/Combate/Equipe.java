package Combate;

public class Equipe {
    private String nome;
    private Personagem[] membros;
    private int quantidade;

    public Equipe(String nome, int capacidade) {
        if (capacidade<=0){
            return;
        }
        this.nome = nome;
        this.membros = new Personagem[capacidade];
        this.quantidade = 0;
    }

    public boolean adicionar(Personagem personagem){
        if (quantidade >= this.membros.length || !personagem.estaVivo() || contem(personagem)){
            return false;
        }
        this.membros[quantidade] = personagem;
        quantidade++;
        return true;
    }

    public boolean contem(Personagem personagem){
        for (Personagem pers : this.membros){
            if(personagem==pers){
                return true;
            }
        }
        return false;
    }

    public boolean temVivo(){
        for (Personagem pers : this.membros){
            if (pers.estaVivo()){
                return true;
            }
        }
        return false;
    }
}
