package Treino.Exercício03;

public class Conta {
    private String nome;
    private int numero;
    private float saldo;

    public Conta(String nome, int numero, float saldo) {
        this.nome = nome;
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void depositar(float valor) {
        this.saldo += valor;
    }

    public void sacar(float valor) {
        this.saldo -= valor;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "nome='" + nome + '\'' +
                ", numero=" + numero +
                ", saldo=" + saldo +
                '}';
    }
}
