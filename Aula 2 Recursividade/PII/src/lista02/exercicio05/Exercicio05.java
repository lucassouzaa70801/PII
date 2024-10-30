package lista02.exercicio05;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para verificarmos se ele é primo: ");
        int n = scanner.nextInt();

        boolean resultado = ePrimo(n);
        System.out.println("O número " + n + " é primo? " + resultado);

        scanner.close();
    }

    /**
     * Verifica se um número inteiro é primo.
     * @param n O número a ser verificado.
     * @return true se o número for primo, false caso contrário.
     */
    public static boolean ePrimo(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        // Verifica divisores ímpares de 3 até a raiz quadrada do número
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false; // Se o número é divisível por i, não é primo
        }
        return true; // Se passar por todas as verificações, é primo
    }
}


