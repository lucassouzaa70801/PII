package lista02.exercicio11;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double num;
        double resultado;

        System.out.println("Digite um número: ");
        num = leia.nextDouble();

        resultado = calculaQuadrado(num);
       ResultadoQ(resultado);
    }
    public static double calculaQuadrado(double num) {
        return Math.pow(num, 2); // Usa a função Math.pow para calcular o quadrado
    }
    /**
     * Exibe o resultado do cálculo ;
     * @param resultado O resultado do quadrado a ser exibido.
     */
    public static void ResultadoQ(double resultado) {
        System.out.println("O resultado é: " + resultado);
    }
}
