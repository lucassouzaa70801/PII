package lista02.exercicio16;

import java.util.Scanner;

public class Exercicio16 { public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
    int n;
    int resultado;

    System.out.println("Digite o número: ");
   n = leia.nextInt();

    // Chama a função que calcula a soma de 1 até N
    resultado = somaD(n);
    System.out.println("A soma de 1 ate " + n + " é: " + resultado);

}

    /**
     * Calcula a soma de todos os números inteiros de 1 até n de forma recursiva.
     * @param n O número até o qual a soma deve ser calculada.
     * @return A soma de todos os números inteiros de 1 até n.
     */
    public static int somaD(int n) {
        if (n == 1) {
            return 1; // Caso base: a soma de 1 é 1
        } else {
            // Chamada recursiva para calcular a soma de 1 até n
            return n + somaD(n - 1);
        }
    }
}
