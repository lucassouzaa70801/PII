package lista01.exercicio07;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int idade;
        double conversorD;

        System.out.println("Informe sua idade em anos: ");
        idade = leia.nextInt();

        conversorD = idade * 365.25;

        System.out.println("A idade convertida para dias eh: " + conversorD);
    }
}
