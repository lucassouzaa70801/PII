package lista01.exercicio30;

import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int base, expo, calc =
                1;
        System.out.println("Digite a base: ");
        base = leia.nextInt();
        System.out.println("Digite o expoente");
        expo = leia.nextInt();


        for(int i =0;i<expo;i++){
            calc *= base;
            System.out.println(calc);
        }
    }
}
