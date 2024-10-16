package lista01.exercicio27;

import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int num = 0;
        int c = 0;
        System.out.println("Digite um numero: ");
        num = leia.nextInt();

        for(int i = 1; i <= num; i++){
            if(i % 2 == 0){
                System.out.println(c+=i);
            }

    }

    }
}
