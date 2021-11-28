package BR.com.aula;
import java.util.Scanner;
import java.text.DecimalFormat;
public class mediaAlunos {
    public static void main(String[] args) {



        System.out.println ("Digite seu nome ");
        Scanner in = new Scanner (System.in);
        String nome = in.next();
        System.out.println ("Bem-vindo "+ nome);
        System.out.println ("Digite sua primeira nota ");
        DecimalFormat frmt = new DecimalFormat("#.##");
        Float nota = Float.valueOf (in.next ());
        System.out.println ("Digite sua segunda nota ");
        Float nota2 = Float.valueOf (in.next ());
        Float media = (nota+nota2)/2;
        System.out.println ("Sua média é : "+ new DecimalFormat (".##").format(media));
        if (media >= 6){
            System.out.println ("Parabéns, passou de ano!");

        }
       else {
            System.out.println ("Se ferrou!");
        }
    }}

