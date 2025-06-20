package Treino.Exercicio01;

public class main {
    /*1. Exercício Contador
        a. Criar uma classe Contador que encapsule um valor usado para a contagem de
        itens ou eventos. A classe deve conter métodos que devem:
            b. Zerar o contador;
            c. Incrementar o contador em uma unidade;
            d. Retornar o valor do contador;
        e. O programa deve instanciar objetos da classe Contador e utilizar seus
        métodos.*/
    public static void main(String[] args) {
        Contador c1 = new Contador();
        c1.incrementarContador();
        c1.incrementarContador();
        System.out.println(c1.toString());
        c1.zerarContador();
        System.out.println(c1.toString());
    }

}
