package lista01.exercicio17;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("Digite o primeiro numero: ");
        num1 = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        num2 = sc.nextInt();
        System.out.println("Digite o terceiro numero: ");
        num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3 ) {
            System.out.println("O " + num1 + " eh o maior");
        }else if(num2 > num1 && num2 > num3){
            System.out.println("o " + num2 + " eh o maior");
        }else{
            System.out.println("O "+num3+" eh o maior");
        }
    }
}
