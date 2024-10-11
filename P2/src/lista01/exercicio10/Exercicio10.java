package lista01.exercicio10;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double valorDolar;
        double taxa;
        double conversao;

        System.out.println("Digite o valor em Dolar: ");
        valorDolar = leia.nextDouble();
        System.out.println("Digite o valor da taxa de cambio: ");
         taxa = leia.nextDouble();

        conversao = (valorDolar * taxa);
        System.out.println("O valor do dolar convertido eh: " + conversao);

    }
}
