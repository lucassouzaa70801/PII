package lista02.exercicio15;

import java.util.Scanner;

public class Exercicio15 {public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
    int numero;

    System.out.println("Digite o número: ");
    numero = leia.nextInt();

    // Chama a função que calcula o n-ésimo termo de Fibonacci
    System.out.println("O " + numero + "º termo da sequência de Fibonacci é: " + fibonacci(numero));

}

    /**
     * Calcula o n-ésimo termo da sequência de Fibonacci de forma recursiva.
     * @param n O índice do termo desejado na sequência de Fibonacci.
     * @return O n-ésimo termo da sequência de Fibonacci.
     */
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0; // O primeiro termo (0º) da sequência de Fibonacci
        } else if (n == 1) {
            return 1; // O segundo termo (1º) da sequência de Fibonacci
        } else {
            // Chamada recursiva para calcular o n-ésimo termo
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
