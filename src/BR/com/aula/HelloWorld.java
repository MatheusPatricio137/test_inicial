package BR.com.aula;
import java.util.Scanner;
import java.util.Arrays;

public class HelloWorld {
    public static void main(String[] args) {
        //Criei as variáveis de nome em tipo String, e dinheiro em tipo int
        String[] nome = {"pedrin", "cleintin", "pablin"};
        String[] dinheiro = {"1000 reais","2000 reais","3000 reais"};
        System.out.println ("Digite um numero de 0 a 2");
        Scanner in = new Scanner (System.in);
        int pessoa = in.nextInt ();
        System.out.println (Arrays.toString (dinheiro));//transforma o array que está em number para string



            switch (pessoa) {

                case 0:
                    System.out.println ("Bem-vindo senhor " + nome[0]);
                    System.out.println ("Seu saldo é de: "+ dinheiro[0]);

                    break;
                case 1:
                    System.out.println ("Bem-vindo senhor " + nome[1]);
                    System.out.println ("Seu saldo é de: "+ dinheiro[1]);
                    break;
                case 2:
                    System.out.println ("Bem-vindo chico " + nome[2]);
                    System.out.println ("Seu saldo é de: "+ dinheiro[2]);
                    break;


                default:

                    ;



            }

    }


    }








