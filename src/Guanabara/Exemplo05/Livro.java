package Exemplo05;

public class Livro implements Publicação{
    //Atributos
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    //Construtor
    public Livro(String titulo, String autor, int totPaginas, int pagAtual, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = pagAtual;
        this.aberto = false;
        this.leitor = leitor;
    }

    //Getter e Setter
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    //Métodos Públicos
    public void detalhes(){
        System.out.println("Titulo: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("TotPaginas: " + this.getTotPaginas());
        System.out.println("PagAtual: " + this.getPagAtual());
        System.out.println("Aberto: " + this.isAberto());
        System.out.println("Leitor: " + this.leitor.getNome());
    }

    //Métodos Privados

    @Override
    public void abrir() {
        setAberto(true);
        setPagAtual(1);
        System.out.println("Livro aberto na página " + this.getPagAtual());
    }

    @Override
    public void fechar() {
        setAberto(false);
        setPagAtual(0);
    }

    @Override
    public void folhear(int pagina) {
        setPagAtual(pagina);
        System.out.println("Folheado para a pagina " + pagina);
    }

    @Override
    public void avancarPag() {
        setPagAtual(getPagAtual() + 1);
    }

    @Override
    public void voltarPag() {
        setPagAtual(getPagAtual() - 1);
    }
}
