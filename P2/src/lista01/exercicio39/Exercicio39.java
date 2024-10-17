package lista01.exercicio39;

import java.util.Scanner;

public class Exercicio39 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
            int matriz1 [][] = new int[2][2];
            int matriz2 [][] = new int[2][2];
            int matriz3 [][] = new int[2][2];

            for(int i = 0; i < matriz1.length; i++)
                for(int j = 0; j < matriz2.length; j++){
                System.out.println("Digite os elementos da matriz 1: ");
                matriz1[i][j] = leia.nextInt();
            }
            for (int i = 0; i<matriz2.length; i++)
                for (int j = 0; j<matriz2.length; j++){
                System.out.println("Digite os elementos da matriz 2: ");
                matriz2[i][j] = leia.nextInt();
            }
            for (int i = 0; i<matriz3.length; i++)
                for (int j = 0; j<matriz3.length; j++){

                    matriz3[i][j] = matriz1[i][j] * matriz2[i][j];
                    int resultado = 0;
                    resultado   = matriz3[i][j];

                    System.out.println(resultado);
                }




    }
}

