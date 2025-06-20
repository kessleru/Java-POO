package Treino.Exercício02;

public class Main {
    /*2. Exercício Lâmpada
        a. Criar uma classe Lâmpada que pode ser ligada e desligada. Também deve ser
        possível observar o estado da lâmpada.
        b. O programa deve instanciar objetos da classe Lampada e utilizar seus
        métodos*/
    public static void main(String[] args) {
        Lampada l = new Lampada();
        l.interruptor();
        l.observar();
    }
}
