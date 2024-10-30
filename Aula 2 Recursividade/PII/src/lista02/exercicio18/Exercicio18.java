package lista02.exercicio18;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
    int base;
    int exponent;

    System.out.println("Digite a base: ");
    base = leia.nextInt();

    System.out.println("Digite o expoente: ");
    exponent = leia.nextInt();

    // Chama a função que calcula a potência e exibe o resultado
    System.out.println(base + " elevado a " + exponent + " é " + calculaP(base, exponent));

        leia.close();
}

    /**
     * Calcula a potência de um número inteiro (base) elevado a um número inteiro (exponente) de forma recursiva.
     * @param base A base que será elevada.
     * @param exponent O expoente ao qual a base será elevada.
     * @return O resultado da base elevada ao expoente.
     */
    public static int calculaP(int base, int exponent) {
        if (exponent == 0) {
            return 1; // qualquer número elevado a 0 é 1
        }
        // Chamada recursiva para calcular a potência
        return base * calculaP(base, exponent - 1);
    }
}
