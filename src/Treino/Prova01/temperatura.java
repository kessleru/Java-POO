

package Treino.Prova01;

import java.util.Scanner;

public class temperatura {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura: ");
        double temperatura = sc.nextDouble();

        if (temperatura <= 37){
            System.out.print("Classificação: Normal");
        } else if (temperatura > 37 && temperatura <= 38.5){
            System.out.print("Classificação: febre leve");
        } else{
            System.out.print("Classificação: febre alta");
        }
        sc.close();
    }
}
