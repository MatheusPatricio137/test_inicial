package BR.com.aula.CEV;

public class contaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private Float saldo;
    private boolean status;

    public void estadoAtual(){
        System.out.println ("-----------------------");
        System.out.println ("Conta: "+this.getNumConta ());
        System.out.println ("Tipo de conta: "+this.getTipo ());
        System.out.println ("Dono: "+this.getDono ());
        System.out.println ("Saldo atual : "+this.getSaldo ());
        System.out.println ("Status: "+this.getStatus ());
    }
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public Float getSaldo() {
        return saldo;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    //métodos
    public contaBanco() {
        this.setSaldo (0f);
        this.setStatus (false);

    }

    public void abrirConta(String t) {
        this.setTipo (t);
        this.setStatus (true);
        if ( t  == "cc") {
            this.setSaldo (50f);
            System.out.println ("Conta cc aberta!");
        } else if ( t == "cp") {
            this.setSaldo (150f);
            System.out.println ("Conta cp aberta!");
        }
else {
            System.out.println ("digite uma conta válida!");
        }
    }

    public void fecharConta() {
        if (this.saldo > 0) {
            System.out.println ("Conta com dinheiro");
        } else if (this.getSaldo () < 0) {
            System.out.println ("a conta está em débito");
        } else {
            this.setStatus (false);
            System.out.println ("Conta fechada!");
        }

    }

    public void depositar(Float v) {
        if (this.getStatus ()) {
            this.setSaldo (this.getSaldo ()+v );
            System.out.println ("Depositado com sucesso na conta de: "+this.getDono ());
        } else {
            System.out.println ("impossivel depositar");
        }

    }

    public void sacar(Float v) {
        if (this.getStatus ()) {
            if (this.getSaldo () >= v) {
                this.setSaldo (this.getSaldo ()-v);
                System.out.println ("Saque realizado na conta de "+this.getDono ());
            } else {
                System.out.println ("Saldo insuficiente");
            }

        } else {
            System.out.println ("Impossivel sacar, a conta está fechada");
        }
    }

    public void pagarMensalidade() {
        int v=0 ;
        if (this.getTipo ()== "cc") {
            v = 12;
        } else if (this.getTipo ()== "cp") {
            v = 20;
        }
            if (getStatus ()) {
                this.setSaldo (this.getSaldo ()-v);
                System.out.println ("mensalidade paga por "+this.getDono ());
                } else {
                    System.out.println ("saldo insuficiente");
                }
            }
        }

