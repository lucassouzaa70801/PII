package lista02.exercicio06;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        System.out.println("Digite o terceiro número: ");
        int num3 = scanner.nextInt();

        int resultado = mediaNum(num1, num2, num3);
        exibeSoma(resultado);

        scanner.close();
    }

    /**
     * Calcula a média de três números inteiros.
     * @param num1 O primeiro número a ser considerado na média.
     * @param num2 O segundo número a ser considerado na média.
     * @param num3 O terceiro número a ser considerado na média.
     * @return A média dos três números.
     */
    public static int mediaNum(int num1, int num2, int num3) {
        return (num1 + num2 + num3) / 3; // Calcula a média aritmética
    }

    /**
     * Exibe o resultado da média no console.
     */
    public static void exibeSoma(int resultado) {
        System.out.println("O resultado da média é: " + resultado);
    }
}
