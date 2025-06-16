package Guanabara.Exemplo02;

public class ContaBanco {

    public int numConta;
    protected String tipo;
    private String titular;
    private float saldo;
    private boolean status;

    public void estadoAtual(){
        System.out.println("----------------------------------------");
        System.out.println("Conta: " + this.numConta);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Titular: " + this.titular);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Status: " + this.status);
    }

    public void abrirConta(String tipo) {
        this.setTipo(tipo);
        this.setStatus(true);
        if (this.getTipo().equals("CC")) {
            this.setSaldo(50);
        } else if (this.getTipo().equals("CP")) {
            this.setSaldo(150);
        }
    }

    public void fecharConta(){
        if (this.getSaldo() > 0) {
            System.out.println("Conta com dinheiro");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta em débito");
        } else {
            this.setStatus(false);
        }

    }

    public void depositar(float valor) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Depósito realizado com sucesso");
            this.estadoAtual();
        } else {
            System.out.println("Impossivel depositar");
        }
    }

    public void sacar(float valor) {
        if (this.getStatus() && this.getSaldo() >= valor) {
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Saque realizado com sucesso");
            this.estadoAtual();
        } else if (this.getStatus() && this.getSaldo() < 0) {
            System.out.println("Saldo insuficiente");
        } else {
            System.out.println("Impossivel sacar");
        }
    }

    public void pagarMensal(){
        float valor = 0;
        if (this.getTipo().equals("CC")) {
            valor = 12;
        } else if (this.getTipo().equals("CP")) {
            valor = 20;
        } else {
            System.out.println("Tipo de conta invalido");
        }

        if (this.getStatus() && this.getSaldo() >= valor) {
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Mensalidade paga com sucesso");
            this.estadoAtual();
        } else if (this.getStatus() && this.getSaldo() < 0) {
            System.out.println("Saldo insuficiente");
        } else {
            System.out.println("Impossivel sacar");
        }
    }

    //Contrutor
    public ContaBanco(){
        this.saldo = 0;
        this.status = false;
    }

    //Getter and Setter
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
