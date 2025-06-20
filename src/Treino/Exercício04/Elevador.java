package Treino.Exercício04;

public class Elevador {
    //Atributos
    private int andares;
    private int andarAtual;
    private int capacidade;
    private int pessoa;

    //Construtor
    public Elevador(int andares, int capacidade) {
        this.andares = andares;
        this.capacidade = capacidade;
    }

    //Getter e Setter
    public int getAndares() {
        return andares;
    }

    public void setAndares(int andares) {
        this.andares = andares;
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getPessoa() {
        return pessoa;
    }

    public void setPessoa(int pessoa) {
        this.pessoa = pessoa;
    }

    //Métodos Públicos
    public void entrar(){
        if (pessoa <= capacidade){
            this.pessoa++;
        } else {
            System.out.println("O elevador está cheio.");
        }
    }

    public void sair(){
        if (pessoa != 0){
            this.pessoa--;
        } else {
            System.out.println("O elevador está vazio.");
        }
    }

    public void subir(){
        if (andarAtual == andares){
            System.out.println("Você está no ultimo andar.");
        } else {
            this.andarAtual++;
        }
    }

    public void descer(){
        if (andarAtual == 0){
            System.out.println("Você está no térreo.");
        } else {
            this.andarAtual--;
        }
    }

    public void status(){
        System.out.println("Andar atual: " + andarAtual);
        System.out.println("Pessoas: " + pessoa);
    }
}
