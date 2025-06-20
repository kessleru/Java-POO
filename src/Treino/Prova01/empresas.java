
package Treino.Prova01;

public class empresas {
    public static void main(String[] args){
        double empresaX = 80000;
        double empresaY = 120000;
        int ano = 0;

        for (int i = 0; i < 100; i++){
            empresaX = empresaX + (empresaX * 0.05);
            empresaY = empresaY + (empresaY * 0.02);
            ano++;
            if (empresaX > empresaY){
                    break;
            }
        }

        System.out.println("Ano: " + ano);
        System.out.printf("Empresa Y: %.2f %n",empresaY);
        System.out.printf("Empresa X: %.2f %n", empresaX);
    }

}
