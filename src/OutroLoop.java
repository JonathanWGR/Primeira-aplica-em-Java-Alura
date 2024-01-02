import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int guardaNota = 0;

        while( nota != -1) {
            System.out.println("Diga sua avaliação para o filme ou -1 para encerrar ");
            nota = in.nextDouble();
            if(nota != -1) {
                mediaAvaliacao += nota;
                guardaNota++;
            }
        }
        System.out.println("Média das avaliaçoes " + mediaAvaliacao / guardaNota + " tivemos "+guardaNota+ " avaliações");

                int contador = 1;

                while(contador <= 10) {
                    System.out.println(contador);

                }
            }
        }
