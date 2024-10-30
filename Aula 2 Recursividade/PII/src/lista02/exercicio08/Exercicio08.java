package lista02.exercicio08;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double raio;
    double resultadoArea;

    System.out.println("Digite o raio do círculo para calcularmos a área: ");
    raio = scanner.nextDouble();

    resultadoArea = calculaRaio(raio);
    mostraRaio(resultadoArea);

    scanner.close();
}


    public static double calculaRaio(double raio) {
        return Math.PI * Math.pow(raio, 2); // Fórmula da área do círculo
    }

    /**
     * Exibe a área do círculo no console.
     * @param resultadoArea A área do círculo a ser exibida.
     */
    public static void mostraRaio(double resultadoArea) {
        System.out.println("O resultado da área é: " + resultadoArea);
    }
}
