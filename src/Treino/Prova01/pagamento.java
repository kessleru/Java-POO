

package Treino.Prova01;

import java.util.Scanner;

public class pagamento {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Valor por Hora: ");
        double valor = sc.nextDouble();
        System.out.print("Horas Trabalhadas: ");
        double horas = sc.nextDouble();

        double pagamento = valor * horas;

        System.out.printf("O pagamento para %s deve ser %.1f ", nome, pagamento);

        sc.close();
    }
}
