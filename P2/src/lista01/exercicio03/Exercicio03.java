package lista01.exercicio03;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        float C;
        float conversor = 0 ;
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius: ");
        C = leia.nextFloat();
        conversor = (C * 9/5) + 32;
        System.out.println("A temperatura convertida para Fahrenheit eh: " + conversor);
    }
}
