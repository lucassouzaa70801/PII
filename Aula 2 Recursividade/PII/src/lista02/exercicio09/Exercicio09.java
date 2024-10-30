package lista02.exercicio09;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int baseR;
    int alturaR;
    int resultadoArea;

    System.out.println("Digite a base do retângulo: ");
    baseR = scanner.nextInt();
    System.out.println("Digite a altura do retângulo: ");
    alturaR = scanner.nextInt();

    resultadoArea = calculaArea(baseR, alturaR);
    mostrarResultado(resultadoArea);

    scanner.close();
}


    public static int calculaArea(int baseR, int alturaR) {
        return baseR * alturaR; // Fórmula da área do retângulo
    }

    public static void mostrarResultado(int resultadoArea) {
        System.out.println("O resultado da área é: " + resultadoArea);
    }
}
