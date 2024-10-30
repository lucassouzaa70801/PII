package lista02.exercicio20;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
    int n1;
    int n2;
    System.out.println("Digite o primeiro número ");
    n1 = leia.nextInt();
    System.out.println("Digite o segundo número ");
    n2 = leia.nextInt();

    // Calcula e exibe o máximo divisor comum
    int resultado = MaximoDivisorC(n1, n2);
    System.out.println("O máximo divisor comum é: " + resultado);
}

    /**
     * Calcula o máximo divisor comum (MDC) de dois números inteiros usando o algoritmo de Euclides.
     * @param a O primeiro número inteiro.
     * @param b O segundo número inteiro.
     * @return O máximo divisor comum entre os dois números.
     */
    public static int MaximoDivisorC(int a, int b) {
        if (b == 0) {
            return a; // Caso base: se b for 0, o MDC é a
        }
        //Chama recursivamente o método para encontrar o MDC
        return MaximoDivisorC(b, a % b);
    }
}
