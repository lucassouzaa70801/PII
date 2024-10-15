package lista01.exercicio18;

import java.util.Scanner;

public class Execicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.println("Digite o primeiro numero: ");
        num1 = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        num2 = sc.nextInt();

        if(num2 == 0){
            System.out.println("Numero invalido, digite outro novamente ");
        }else if(num1 % 2 == 0){
            System.out.println(+num1+" eh multiplo de " + num2);
        }else {
            System.out.println("nao sao multiplos");
        }

    }
}
