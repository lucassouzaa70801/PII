package lista01.exercicio12;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int num1, num2;
        System.out.println("Digite um numero : ");
        num1 = leia.nextInt();
        System.out.println("Digite outro numero : ");
        num2 = leia.nextInt();

        if(num1 > num2){
            System.out.println("o " +num1+ " eh maior");
        }else{
            System.out.println("o " +num2+ " eh maior");
        }
    }
}
