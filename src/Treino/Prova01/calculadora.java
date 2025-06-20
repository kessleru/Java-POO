
package Treino.Prova01;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        int x1 = sc.nextInt();
        System.out.print("Digite o segundo numero: ");
        int x2 = sc.nextInt();
        System.out.println("S - soma / N - subtração / M - multiplicaçâo / D - divisão");
        char escolha = sc.next().charAt(0);
        switch (escolha){
            case 'S':
                int soma = x1 + x2;
                System.out.print(soma);
                break;
            case 'N':
                int sub = x1 - x2;
                System.out.print(sub);
                break;
            case 'M':
                int multi = x1 * x2;
                System.out.print(multi);
                break;
            case 'D':
                int div = x1 / x2;
                System.out.print(div);
                break;
        }
    }
}
