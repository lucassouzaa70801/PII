package lista01.exercicio37;

import java.util.Scanner;

public class Exercicio37 {
    public static void main(String[] args) {
        int [][] matriz = new int [3][3];
        int [][] matrizTransp = new int [3][3];

        Scanner leia = new Scanner(System.in);

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                System.out.println("Digite o numero desejado ");
                matriz[i][j] = leia.nextInt();

            }
        }
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                matrizTransp[j][i] = matriz[i][j];
            }
        }

        for(int i = 0; i < matrizTransp.length; i++){
            for(int j = 0; j < matrizTransp[0].length; j++){
                System.out.println(matrizTransp[i][j] + " ");

            }
            System.out.println();
        }

    }
}