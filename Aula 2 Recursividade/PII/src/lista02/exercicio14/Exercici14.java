package lista02.exercicio14;

import java.util.Scanner;

public class Exercici14 {
    public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
    int numero;
    int recursividade;

    System.out.println("Digite o número desejado: ");
    numero = leia.nextInt();

    recursividade = fatorialRecursivo(numero);
    System.out.println("O fatorial de " + numero + " é: " + recursividade);

}

    /**
     * Calcula o fatorial de um número inteiro de forma recursiva.
     * @param numero O número do qual se deseja calcular o fatorial.
     * @return O fatorial do número.
     */
    public static int fatorialRecursivo(int numero) {
        if (numero == 1 || numero == 0) { // O fatorial de 0 também é 1
            return 1;
        }
        return numero * fatorialRecursivo(numero - 1); // Chamada recursiva
    }
}
