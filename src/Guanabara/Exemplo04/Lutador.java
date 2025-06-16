package Guanabara.Exemplo04;

public class Lutador {
    //Atributos
    private String nome;
    private int idade;
    private float altura;
    private float peso;
    private String nacionalidade;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    //Métodos Públicos
    public void apresentar() {
        System.out.println("Apresentando o lutador: ");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Altura: " + this.altura);
        System.out.println("Peso: " + this.peso);
        System.out.println("Nacionalidade: " + this.nacionalidade);
        System.out.println("Categoria: " + this.categoria);
        System.out.println("Vitorias: " + this.vitorias);
        System.out.println("Derrotas: " + this.derrotas);
        System.out.println("Empates: " + this.empates);
    }

    public void status() {
        System.out.println(this.getNome() + " é um peso " + this.getCategoria());
        System.out.println(this.getVitorias() + " V | " + this.getDerrotas() + " D | " + this.getEmpates() + " E");
    }

    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }

    //Construtor
    public Lutador(String nome, int idade, float altura, float peso, String nacionalidade, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.nacionalidade = nacionalidade;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    //Getter e Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.peso < 52.2) {
            this.categoria = "Inválido";
        } else if (this.peso < 70.3) {
            this.categoria = "Leve";
        } else if (this.peso < 83.9) {
            this.categoria = "Médio";
        } else if (this.peso < 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }

    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
}
