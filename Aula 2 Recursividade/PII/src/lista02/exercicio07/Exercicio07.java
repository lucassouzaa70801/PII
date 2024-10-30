package lista02.exercicio07;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite a temperatura em Celsius para ser convertida em Fahrenheit: ");
    double temp = scanner.nextDouble();

    double convert = converteTemp(temp);
    mostraTemp(convert);

    scanner.close();
}

    /**
     * Converte uma temperatura de Celsius para Fahrenheit.
     * @param temp A temperatura em graus Celsius.
     * @return A temperatura convertida em graus Fahrenheit.
     */
    public static double converteTemp(double temp) {
        return 9.0 / 5.0 * temp + 32.0; // Fórmula de conversão
    }

    /**
     * Exibe a temperatura convertida
     */
    public static void mostraTemp(double convert) {
        System.out.println("A temperatura convertida é: " + convert);
    }
}
