package lista01.exercicio38;

import java.util.Scanner;

public class Exercicio38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[4][4];
        int somaDiagonal = 0;


        System.out.println("Digite os elementos da matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();

                if (i == j) {
                    somaDiagonal += matriz[i][j];
                }
            }
        }


        System.out.println("\nA soma dos elementos da diagonal principal é: " + somaDiagonal);
    }
}
