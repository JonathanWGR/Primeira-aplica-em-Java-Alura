import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double mediaAvaliacao = 0;
        double nota = 0;

        for( int i = 0; i < 3; i++) {
            System.out.println("Diga sua avaliação para o filme ");
            nota = in.nextDouble();
            mediaAvaliacao += nota;

        }
            System.out.println("Média das avaliaçoes " + mediaAvaliacao/3);

    }
}
