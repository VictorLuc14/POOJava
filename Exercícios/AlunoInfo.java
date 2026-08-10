import java.util.Scanner;

public class AlunoInfo{
    public static void main(String[] args){ /*Não precisa daquele espaço no incio, desde que esteja entre chaves.*/
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = input.nextInt();
        input.nextLine();

        System.out.print("Digite seu curso: ");
        String curso = input.nextLine();

        System.out.print("Digite a primeira nota: ");
        double nota1 = input.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = input.nextDouble();

        System.out.println("Dados do aluno");
        System.out.println("------//------");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Curso: " + curso);
        System.out.println("Nota1: " + nota1);
        System.out.println("Nota1: " + nota2);
        System.out.println("Média: " + (nota1 + nota2)/2 );
    }
}