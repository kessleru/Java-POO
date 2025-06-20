package Treino.Exercício02;

public class Lampada {
    private boolean estado;

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void interruptor(){
        estado = !estado;
    }

    public void observar(){
        if (estado) {
            System.out.println("Lampada está ligada");
        } else {
            System.out.println("Lampada está desligada");
        }
    }
}
