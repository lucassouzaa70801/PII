package lista01.exercicio35;

import java.util.Scanner;

public class Exercicio35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v1[] = new int[5];
        int v2[] = new int[5];
        int v3[] = new int[5];

        for (int i = 0; i < v3.length; i++) {
            System.out.println("Digite o: " + (i + 1) + "° numero");
            v1[i] = sc.nextInt();
        }
        for (int i = 0; i < v1.length; i++) {
            System.out.println("Digite o: " + (i + 1) + "° numero do segundo vetor");
            v2[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            v3[i] = v1[i] * v2[i];

        }
        System.out.println("\nVetor resultante da multiplicação:");
        for (int i = 0; i < 5; i++) {
            System.out.print(v3[i] + " ");
        }
    }
}
