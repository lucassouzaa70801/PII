package lista01.exercicio26;

import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int resul, num2 = 0, num3 = 1;

        System.out.println("Digite um numero: ");
        int numero = leia.nextInt();

        for(int i = 1; i<=numero; i++){
            System.out.println(num2 + " ");

            int  proximo  = num2 + num3;
            num2 = num3;
            num3 = proximo;
        }
    }
}
