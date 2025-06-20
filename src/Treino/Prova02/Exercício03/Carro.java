package Treino.Prova02.Exercício03;

public class Carro extends Veiculo{
    //Atributos
    private int numeroPortas;

    //Getters e Setters
    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    //Construtor
    public Carro(String marca, String modelo, int numeroPortas) {
        super(marca, modelo);
        this.numeroPortas = numeroPortas;
    }

    //Métodos Públicos
    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Portas: " + getNumeroPortas());
    }
}
