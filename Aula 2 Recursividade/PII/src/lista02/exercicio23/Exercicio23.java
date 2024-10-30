package lista02.exercicio23;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);

    System.out.print("Digite uma string: ");
    String input = leia.nextLine();

    System.out.print("Digite o caractere que deseja contar: ");
    char caractere = leia.next().charAt(0);

    int contagem = contarOc(input, caractere);

    // Exibe o número de ocorrências do caractere
    System.out.println("O caractere '" + caractere + "' aparece " + contagem + " vez(es) na string.");

        leia.close();
}

    /**
     * Conta recursivamente o número de ocorrências de um caractere em uma string.
     * @param str A string em que o caractere será contado.
     * @param caractere O caractere a ser contado na string.
     * @return O número de vezes que o caractere aparece na string.
     */
    public static int contarOc(String str, char caractere) {
        // Caso base: se a string estiver vazia, retorna 0
        if (str.isEmpty()) {
            return 0;
        }

        // Verifica se o primeiro caractere é igual ao que estamos contando
        int contaA = (str.charAt(0) == caractere) ? 1 : 0;

        // Chama recursivamente para o restante da string
        return contaA+ contarOc(str.substring(1), caractere);
    }
}
