package Treino.Exercício03;

public class Main {
    /*3. Exercício Conta
        a. Criar uma classe Conta que contenha o nome do cliente, o número da conta e
        o saldo. Estes valores deverão ser informados no construtor da classe;
        b. Criar um método depositar e um método sacar para realizar o depósito e o
        saque de valores da conta
        c. O programa deve instanciar objetos da classe Conta e utilizar seus métodos.
        */
    public static void main(String[] args) {
        Conta c = new Conta("Otávio", 54, 55.6f);
        System.out.println(c.toString());
        c.depositar(5.1f);
        System.out.println(c.toString());
        c.sacar(35.1f);
        System.out.println(c.toString());

    }
}
