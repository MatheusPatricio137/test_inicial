package BR.com.aula;

import java.util.Scanner;

public class nomes {

    String nomeAluno;
    Integer idade;
    Float nota;
   String matriculado;

    nomes(){

    }

    void Status() {
        System.out.println ("Bem-vindo "+this.nomeAluno);
        System.out.println ("Sua idade é de : "+this.idade+" anos");

        }

    void matricular() {
        if (this.matriculado.equals ("nao")){
            System.out.println ("Você precisa se matricular primeiro!");
        }
else {
            System.out.println ("Você está com a matrícula ativa! ");
        }


    }
void recuperacao(){
        if(this.nota==5){
            System.out.println ("Sua nota foi abaixo da média, irá para a recuperação!");
        }




}

    void reprovar() {
        if (this.nota<5){
            System.out.println ("Você reprovou! Sua nota foi de "+this.nota);
        }
else{
            System.out.println ("Parabéns voce passou! Sua nota foi de "+this.nota);
        }


    }


}


