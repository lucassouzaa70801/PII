package lista02.exercicio22;

import java.util.Scanner;

public class Execicio22 {
    public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);

    System.out.print("Digite uma string: ");
    String input = leia.nextLine();

    // Verifica se a string é um palíndromo e exibe o resultado
    if (isPalindromo(input)) {
        System.out.println("Sim, \"" + input + "\" é um palíndromo!");
    } else {
        System.out.println("Não, \"" + input + "\" não é um palíndromo.");
    }

}

    /**
     * Verifica recursivamente se uma string é um palíndromo.
     * @param str A string a ser verificada.
     * @return true se a string for um palíndromo, false caso contrário.
     */
    public static boolean isPalindromo(String str) {
        // Se a string tiver 0 ou 1 caractere, é palíndromo
        if (str.length() <= 1) {
            return true;
        }

        // Compara o primeiro e o último caractere
        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false; // Não é um palíndromo
        }

        // Remove o primeiro e o último caractere e verifica o restante
        return isPalindromo(str.substring(1, str.length() - 1));
    }
}
