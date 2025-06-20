package Exemplo05;

public class Main {
    public static void main(String[] args) {
        Pessoa p[] = new Pessoa[3];

        p[0] = new Pessoa("Otávio", 19, "Homem");
        p[1] = new Pessoa("Júlia", 19, "Mulher");
        p[2] = new Pessoa("Felipe", 25, "Homem");

        Livro l1 = new Livro("The Witcher", "Joseph", 215, 1, p[0]);
        l1.abrir();
        l1.folhear(100);
        l1.detalhes();

    }
}
