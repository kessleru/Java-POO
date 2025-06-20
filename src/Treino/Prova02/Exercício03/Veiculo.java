package Treino.Prova02.Exercício03;

public abstract class Veiculo {
    //Atributos
    private String marca;
    private String modelo;

    //Getters e Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    //Construtor
    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    //Métodos Públicos
    public void exibirInfo(){
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
    }
}
