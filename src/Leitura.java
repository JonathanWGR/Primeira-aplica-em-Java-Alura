import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito");
        String filme = leitura.nextLine();
        System.out.println("Qual o ano de lançamento? ");
        int anoDeLançamento = leitura.nextInt();
        System.out.println("Diga sua avaliação para o filme");
        double avaliacao = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(anoDeLançamento);
        System.out.println(avaliacao);


        System.out.println("Digite seu nome: ");
        String nome = leitura.nextLine();
        System.out.println("Idade: ");
        int idade = leitura.nextInt();
        System.out.println("altura: ");
        double altura = leitura.nextDouble();


            }
        }



