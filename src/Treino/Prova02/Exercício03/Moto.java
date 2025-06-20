package Treino.Prova02.Exercício03;

public class Moto extends Veiculo{
    //Atributos
    private int cilindradas;

    //Getters e Setters
    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    //Construtor
    public Moto(String marca, String modelo, int cilindradas) {
        super(marca, modelo);
        this.cilindradas = cilindradas;
    }

    //Métodos Públicos
    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Cilindradas: " + getCilindradas());
    }
}
