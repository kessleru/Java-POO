package Exemplo04;

import java.util.Random;

public class Luta {
    //Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    //Métodos Públicos
    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar() {
        if (this.aprovada) {
            System.out.println("### DESAFIADO ###");
            this.desafiado.status();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.status();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); // 0 1 2

            switch (vencedor) {
                case 0: // Empate
                    System.out.println("====================");
                    System.out.println("Empatou!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    System.out.println(
                            "Agora o " + this.desafiante.getNome() + " possui " + this.desafiante.getEmpates() +
                                    " empates e o " + this.desafiado.getNome() + " possui " + this.desafiado.getEmpates() + " empates."
                    );
                    break;

                case 1: // Desafiado vence
                    System.out.println("====================");
                    System.out.println("Desafiado venceu!");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    System.out.println(
                            "Agora o " + this.desafiado.getNome() + " possui " + this.desafiado.getVitorias() + " vitórias."
                    );
                    break;

                case 2: // Desafiante vence
                    System.out.println("====================");
                    System.out.println("Desafiante venceu!");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    System.out.println(
                            "Agora o " + this.desafiante.getNome() + " possui " + this.desafiante.getVitorias() + " vitórias."
                    );
                    break;
            }
        } else {
            System.out.println("A luta não pode acontecer.");
        }
    }

    //Getter e Setter
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }


}
