package lista02.exercicio13;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double x1;
        double y1;
        double x2;
        double y2;
        double resultado;

        System.out.println("Digite a coordenada x1: ");
        x1 = leia.nextDouble();
        System.out.println("Digite a coordenada y1: ");
        y1 = leia.nextDouble();
        System.out.println("Digite a coordenada x2: ");
        x2 = leia.nextDouble();
        System.out.println("Digite a coordenada y2: ");
        y2 = leia.nextDouble();

        resultado = calculaDistancia(x1, y1, x2, y2);
        mostraDistancia(resultado);
    }

    /**
     * Calcula a distância euclidiana entre dois pontos no plano cartesiano.
     * @param x1 Coordenada x do primeiro ponto.
     * @param y1 Coordenada y do primeiro ponto.
     * @param x2 Coordenada x do segundo ponto.
     * @param y2 Coordenada y do segundo ponto.
     * @return A distância entre os dois pontos calculada pela fórmula da distância euclidiana.
     */
    public static double calculaDistancia(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void mostraDistancia(double resultado) {
        System.out.println("O resultado é: " + resultado); // Exibe a distância calculada
    }
    }

