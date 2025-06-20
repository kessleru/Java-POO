package Treino.Prova02.Exercício04;

import java.util.Scanner;

public class Biblioteca {
    //Atributos
    private Livro[] listaDeLivros;
    private int quantidade;

    //Getters e Setters
    public Livro[] getListaDeLivros() {
        return listaDeLivros;
    }

    public void setListaDeLivros(Livro[] listaDeLivros) {
        this.listaDeLivros = listaDeLivros;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    //Construtor
    public Biblioteca() {
        this.listaDeLivros = new Livro[10];
        this.quantidade = 0;
    }

    //Métodos Públicos
    public void menu(){
        Scanner sc = new Scanner(System.in);
        int escolha = 0;
        do{
            System.out.println("----------MENU----------");
            System.out.println("1. Adicionar livro");
            System.out.println("2. Listar todos os livros");
            System.out.println("3. Remover um livro");
            System.out.println("4. Buscar livro pelo título");
            System.out.println("0. Para sair");
            escolha = sc.nextInt();
            sc.nextLine();
            switch (escolha){
                case 1:
                    adicionarLivro();
                    break;
                case 2:
                    listarLivros();
                    break;
                case 3:
                    removerLivro();
                    break;
                case 4:
                    buscarLivro();
                    break;
            }
        } while (escolha != 0);
    }

    public void adicionarLivro(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nome do livro: ");
        String nome = sc.nextLine();
        System.out.println("Nome do autor: ");
        String autor = sc.nextLine();
        System.out.println("Ano de publiçâo: ");
        int ano = sc.nextInt();
        sc.nextLine();
        listaDeLivros[quantidade] = new Livro(nome, autor, ano);
        quantidade++;
    }

    public void listarLivros(){
        for(int i = 0; i < quantidade; i++){
            listaDeLivros[i].exbir();
        }
        if (quantidade > 1){
            System.out.println("Temos " + quantidade + " livros");
        } else {
            System.out.println("Temos " + quantidade + " livro");
        }

    }

    public void removerLivro(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nome do livro a ser removido: ");
        String nome = sc.nextLine();
        int nulo = 0;
        int exata = 0;
        for (int i = 0; i < quantidade; i++){
            if (listaDeLivros[i].getTitulo().equals(nome)){
                listaDeLivros[i] = null;
                quantidade--;
                break;
            }
        }
        for (int i = 0; i < 10; i++){
            if (listaDeLivros[i] == null){
                exata = i;
                nulo = i;
                break;
            }
        }
        nulo++;
        for (int i = nulo; i < 10; i++){
            int o = i - 1;
            exata++;
            System.out.println(" realocando o livro: " + exata + " para " + o);
            listaDeLivros[o] = listaDeLivros[exata];
        }
        if (quantidade > 1){
            System.out.println("Temos " + quantidade + " livros");
        } else {
            System.out.println("Temos " + quantidade + " livro");
        }
    }

    public void buscarLivro(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nome do livro a ser removido: ");
        String nome = sc.nextLine();
        for (int i = 0; i < quantidade; i++) {
            if (listaDeLivros[i].getTitulo().equals(nome)) {
                listaDeLivros[i].exbir();
            } else {
                System.out.println("Nenhum livro encontrado.");
            }
        }
    }
}
