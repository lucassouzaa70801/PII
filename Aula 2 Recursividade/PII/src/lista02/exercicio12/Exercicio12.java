package lista02.exercicio12;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
    String palavra;

    System.out.println("Digite a palavra desejada: ");
    palavra = leia.nextLine();

    System.out.println("Número de vogais: " + contagemVogal(palavra));

   leia.close();
}

    /**
     * Conta o número de vogais em uma palavra.
     * @param palavra A palavra na qual as vogais serão contadas.
     * @return O número de vogais encontradas na palavra.
     */
    public static int contagemVogal(String palavra) {
        String vogais = "aeiouAEIOU"; // Conjunto de vogais, tanto minúsculas quanto maiúsculas
        int vogal = 0;

        for (int i = 0; i < palavra.length(); i++) {
            char letra = palavra.charAt(i);
            if (vogais.indexOf(letra) != -1) { // Verifica se a letra é uma vogal
                vogal++;
            }
        }
        return vogal;
    }
}
