package Treino.Exercício04;

public class Main {
    /*4. Exercício Elevador
        a. Criar uma classe denominada Elevador para armazenar as informações de um
        elevador dentro de um prédio. A classe deve armazenar o andar atual (térreo =
        0), total de andares no prédio (desconsiderando o térreo), capacidade do
        elevador e quantas pessoas estão presentes nele. A classe deve também
        disponibilizar os seguintes métodos:
        b. Construtor: que deve receber como parâmetros a capacidade do elevador e o
        total de andares no prédio (os elevadores sempre começam no térreo e vazio);
        c. Entrar: para acrescentar uma pessoa no elevador (só deve acrescentar se ainda
        houver espaço);
        d. Sair: para remover uma pessoa do elevador (só deve remover se houver
        alguém dentro dele);
        e. Subir: para subir um andar (não deve subir se já estiver no último andar);
        f. Descer: para descer um andar (não deve descer se já estiver no térreo).*/
    public static void main(String[] args) {
        Elevador e = new Elevador(4, 8);
        e.status();
        e.entrar();
        e.entrar();
        e.descer();
        e.subir();
        e.status();
        e.subir();
        e.status();
        e.sair();
        e.subir();
        e.status();
    }
}
