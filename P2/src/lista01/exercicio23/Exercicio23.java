package lista01.exercicio23;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f = 1, num;
        System.out.println("Digite um numero para podermos calcular seu fatorial: ");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            f *= i;
            System.out.println("Fatorial de "+i+"="+f);
        }
    }
}
