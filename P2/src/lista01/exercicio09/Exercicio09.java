package lista01.exercicio09;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int num1;
        int num2;
        int resto;
        int coeficiente;

        System.out.println("Digite o primeiro numero inteiro: ");
        num1 = leia.nextInt();
        System.out.println("Digite o segundo numero inteiro: ");
        num2 = leia.nextInt();

        coeficiente = num1/num2;
        resto =  num1 % num2;
        System.out.println("O coeficiente eh: " + coeficiente);
        System.out.println("O resto eh: " + resto);
    }
}
