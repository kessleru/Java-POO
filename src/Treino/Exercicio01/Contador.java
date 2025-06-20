package Treino.Exercicio01;

public class Contador {
    //Atributos
    private int contador;

    //Getter e Setter
    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    //Métodos Públicos
    @Override
    public String toString() {
        return "Contador{" +
                "contador=" + contador +
                '}';
    }

    public void zerarContador() {
        contador = 0;
    }

    public void incrementarContador() {
        contador++;
    }
}
