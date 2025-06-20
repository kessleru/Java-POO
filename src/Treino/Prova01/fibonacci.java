

package Treino.Prova01;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de N: ");
        int n = sc.nextInt();
        int x1 = 0, x2 = 1, resultado = 0;
        System.out.printf("%d %d ",x1, x2);
        for (int i = 0; i < n - 2; i++){
            resultado = x1 + x2;
            x1 = x2;
            x2 = resultado;
            System.out.printf("%d ", resultado);
        }
    }
}
