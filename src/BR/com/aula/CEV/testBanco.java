package BR.com.aula.CEV;

public class testBanco {
    public static void main(String[] args) {
contaBanco p1= new contaBanco ();
       p1.setNumConta (1111);
       p1.setDono ("Matheus");
       p1.abrirConta ("cc");
       p1.depositar (45f);
       p1.estadoAtual ();

       contaBanco p2= new contaBanco ();
       p2.setNumConta (53545);
       p2.setDono ("Jozias");
       p2.abrirConta ("cp");
       p2.estadoAtual ();

        contaBanco p3= new contaBanco ();
        p3.setNumConta (56545);
        p3.setDono ("Manu");
        p3.abrirConta ("cc");
        p3.estadoAtual ();
    }
    }
