public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento:" + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        //Média calculada pelas 3 notas da  Jack, Paulo e suelen;
        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);
        String sinopse;
        sinopse = """
        Top Gun Maverick
        Filme de aventura com galã dos anos 80"
        Muito Bom!
        Ano de Lançamento: """+anoDeLancamento;
        System.out.println(sinopse);

        int classificacao = (int) (media/2);
        System.out.println(classificacao);

        //Formatando texto utilizando o método format().
        String nome = "Jonathan";
        int idade = 21;
        double valor = 95.74;
        System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome,idade,valor));

        //Utilizando o método formatted em Text Block
        String nomeUm= "João";
        int aulas = 4;

        String mensagem = """
                Olá, %s!
                Boas vindas ao curso de Java.
                Teremos %d aulas para te mostrar o que é preciso para dar seu primeiro mergulho na linguagem!
                """.formatted(nome,aulas);

        System.out.println(mensagem);










        // loop for marcado
        aa:
        for( int a =2020;a<=2023;a++) {
            bb:
            for(int b= 2020;b<=2023;b++) {

                if(a==2022 && b==2022){
                    break aa;
                }

                System.out.println(a + "=" + b);
            }
        }

        //for decremento
        int x;
        for (x =10;x>0;x--)
        System.out.println(x);

        //Atualização e inicialização múltipla de variáveis
        int x1 = 1;
        for(long x2=0, y=0; x1< 10 && x2 <10; x1++, x2++) {
            System.out.println("O valor de x2 é: " +x2);
        }
        System.out.println("O valor de x1 é: " +x1);

        //Tentando Executar a sequencia de Fibonacci
        int w,z=2;
        ww:
        for (w=0;w<145;w++){
            System.out.println(w);
            break ww;
        }
    }
}