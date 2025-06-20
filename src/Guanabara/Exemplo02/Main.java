package Exemplo02;

public class Main {
    public static void main(String[] args) {
        ContaBanco c1 = new ContaBanco();
        c1.setNumConta(1234);
        c1.setTitular("Maria");
        c1.abrirConta("CC");
        c1.estadoAtual();
    }
}
