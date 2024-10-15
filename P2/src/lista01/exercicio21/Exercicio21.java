package lista01.exercicio21;

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Digite um numero para poder fornecer a tabuada: ");
        num = sc.nextInt();

        for(int i= 0; i<=10; i++)
        {
            System.out.println(num*i);
        }
    }
}
