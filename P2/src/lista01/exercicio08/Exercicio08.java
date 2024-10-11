package lista01.exercicio08;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double base;
        double altura;
        double area;

        System.out.println("Digite a base do retangulo: ");
        base = leia.nextDouble();
        System.out.println("Digite a altura do retangulo: ");
        altura = leia.nextDouble();
        area = base*altura;
        System.out.println("A area do retangulo: " + area);
    }
}
