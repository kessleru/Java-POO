package Exemplo05;

public interface Publicação {
    public abstract void abrir();
    public abstract void fechar();

    void folhear(int pagina);

    public abstract void avancarPag();
    public abstract void voltarPag();
}
