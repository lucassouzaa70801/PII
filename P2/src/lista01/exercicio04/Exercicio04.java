package lista01.exercicio04;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        double R;
        double A;
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o raio do circulo: ");
        R = leia.nextDouble();
        A = Math.PI*R*R;


        System.out.println("A area do circulo eh: "+ String.format("%2f",A));


    }
}
