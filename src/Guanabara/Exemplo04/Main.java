package Exemplo04;

public class Main {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];

        l[0] = new Lutador("Pretty Boy", 31, 1.75f, 68.9f, "França", 11, 2, 1);
        l[1] = new Lutador("Putscript", 29, 1.68f, 57.8f, "Brasil", 14, 2, 3);
        l[2] = new Lutador("Snapshadow", 35, 1.65f, 80.9f, "EUA", 12, 2, 1);
        l[3] = new Lutador("Dead Code", 28, 1.93f, 81.6f, "Austrália", 13, 0, 2);
        l[4] = new Lutador("UFOCobol", 37, 1.70f, 119.3f, "Brasil", 5, 4, 3);
        l[5] = new Lutador("Nerdaart", 30, 1.81f, 105.7f, "EUA", 12, 2, 4);

        Luta UEC = new Luta();
        UEC.marcarLuta(l[0], l[1]);
        UEC.lutar();

    }
}
