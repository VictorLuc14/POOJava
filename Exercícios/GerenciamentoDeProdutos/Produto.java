public class Produto {

    String nome;
    double preco;
    int estoque;

    public double calcularEstoqueTotal(){
        return preco*estoque;
    }

    public void mostrarProduto(){
        System.out.println("Nome: " + nome);
        System.out.println("preco: " + preco);
        System.out.println("Disponível no estoque: " + estoque);
        }

    public double aplicarDesconto(double desconto, int quantidade){
        return quantidade*preco-(quantidade*preco)*(desconto/100);
    }
}
