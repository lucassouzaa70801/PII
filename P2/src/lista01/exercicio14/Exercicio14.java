package lista01.exercicio14;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int num;
        System.out.println("Digite um numero");
        num = leia.nextInt();

        if(num < 0){
            System.out.println("O numero eh negativo");
        } else if(num == 0){
            System.out.println("O numero eh 0");
        }else{
            System.out.println("O numero eh positivo");
        }
    }
}
