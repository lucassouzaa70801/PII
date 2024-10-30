package lista02.exercicio10;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String palavra;

            System.out.println("Escreva uma palavra: ");
            palavra = scanner.nextLine();

            inverteString(palavra);

            scanner.close();
        }

        /**
         * Inverte a string fornecida e a exibe no console.
         * @param palavra A palavra a ser invertida.
         */
        public static void inverteString(String palavra) {
            System.out.println(new StringBuilder(palavra).reverse().toString()); // Inverte a string usando StringBuilder
        }
}
