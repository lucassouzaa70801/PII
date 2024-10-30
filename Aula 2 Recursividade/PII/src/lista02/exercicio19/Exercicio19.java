package lista02.exercicio19;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
    String palavra;

    System.out.println("Escreva uma palavra: ");
    palavra = leia.nextLine();

    // Chama a função que inverte a string e exibe o resultado
    System.out.println("Palavra invertida: " + inverterString(palavra));

        leia.close();
}

    /**
     * Inverte a string passada como parâmetro de forma recursiva.
     * @param palavra A string que será invertida.
     * @return A string invertida.
     */
    public static String inverterString(String palavra) {
        if (palavra.isEmpty()) {
            return palavra; // Caso base: se a string estiver vazia, retorna a string vazia
        }
        // Chamada recursiva que inverte a string
        return inverterString(palavra.substring(1)) + palavra.charAt(0);
    }
}
