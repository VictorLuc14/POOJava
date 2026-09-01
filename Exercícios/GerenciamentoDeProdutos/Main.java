public class Main {
    public static void main(String[] args){
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();

        produto1.nome = "Batata";
        produto1.preco = 3;
        produto1.estoque = 100;

        produto2.nome = "arroz";
        produto2.preco = 4;
        produto2.estoque = 200;

        System.out.println("----------------------------");
        produto1.mostrarProduto();
        System.out.println("----------------------------");
        System.out.println(produto1.calcularEstoqueTotal());
        System.out.println("----------------------------");
        System.out.println(produto1.aplicarDesconto(10, 10));
        System.out.println("----------------------------");

        produto2.mostrarProduto();
        System.out.println("----------------------------");
        System.out.println(produto2.calcularEstoqueTotal());
        System.out.println("----------------------------");
        System.out.println(produto2.aplicarDesconto(10, 10));
        System.out.println("----------------------------");

    }
}
