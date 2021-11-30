package BR.com.aula;

import java.util.Scanner;

public class nomes {

    String nomeAluno;
    Integer idade;
    Float nota;
   String matriculado;

    nomes(){

    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Float getNota() {
        return nota;
    }

    public void setNota(Float nota) {
        this.nota = nota;
    }

    public String getMatriculado() {
        return matriculado;
    }

    public void setMatriculado(String matriculado) {
        this.matriculado = matriculado;
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


