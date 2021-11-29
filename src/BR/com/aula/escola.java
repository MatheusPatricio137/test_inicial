package BR.com.aula;

import java.util.Scanner;

public class escola {
    public static void main(String[] args) {
            Scanner in=new Scanner (System.in);
            System.out.println ("Escreva seu nome");
            String escreverNome= in.next ();
            System.out.println ("Escreva sua idade");
            Integer escreverIdade=  in.nextInt ();
            System.out.println ("Está matriculado, sim ou nao?");
           String escreverMatricula=in.next ();
            System.out.println ("Escreva sua nota");
            Float escreverNota=in.nextFloat ();
            nomes alunoA= new nomes ();

                    alunoA.nomeAluno = escreverNome;
                    alunoA.idade = escreverIdade;
                    alunoA.matriculado = escreverMatricula;
                    alunoA.nota = escreverNota;
                    alunoA.Status ();
                    alunoA.matricular ();
                    alunoA.reprovar ();





    }
}