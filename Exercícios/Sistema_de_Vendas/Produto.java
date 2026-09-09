public class Produto {

    String nome;
    double preco;
    int quantidadeEstoque;

    public boolean temEstoque(int quantidade) {
        return quantidade <= quantidadeEstoque;
    }

    public void retirarEstoque(int quantidade){
        if(quantidade<=quantidadeEstoque){
            quantidadeEstoque-=quantidade;
            System.out.println("Produtos retirados com sucesso!");
        }
        else{
            System.out.println("Estoque insuficiente!");
        }
    }

    public void aplicarDesconto(double desconto){
        System.out.println(
                preco-(preco*(desconto/100))
        );
    }

    void exibirDados() {
        System.out.println("/////////////");
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidadeEstoque);
    }

}
