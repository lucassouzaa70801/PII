package lista01.exercicio36;

import java.util.Scanner;

public class Exercicio36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 [][] = new int[3][3];
        int soma = 0;


        for (int L = 0; L < m1.length; L++)
            for(int C = 0; C <m1.length; C++){
                System.out.println("Digite os elementos da matriz 3x3:");
                m1[L][C] = sc.nextInt();
                soma += m1[L][C];
            }
        System.out.println("\n A soma dos elementos da matriz eh: "+soma);
    }
}
