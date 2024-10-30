package lista02.exercicio17;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
    int n;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o número desejado: ");
    n  = scanner.nextInt();

    // Chama a função que calcula a quantidade de dígitos
    System.out.println("O número " + n + " possui " + calculaD(n) + " dígitos.");

    scanner.close(); // Fecha o scanner para evitar vazamento de recursos
}

    /**
     * Calcula a quantidade de dígitos de um número inteiro positivo de forma recursiva.
     * @param n O número do qual se deseja contar os dígitos.
     * @return A quantidade de dígitos do número.
     */
    public static int calculaD(int n) {
        if (n < 10) {
            return 1; // Caso base: se o número for menor que 10, tem apenas 1 dígito
        }
        // Chamada  para contar os dígitos
        return 1 + calculaD(n / 10);
    }
}
