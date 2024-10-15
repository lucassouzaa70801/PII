package lista01.exercicio24;

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        boolean valida = true;
        System.out.println("Digite um numero: ");
        num = sc.nextInt();
        for (int i = 2; i < num; i++) {
            if(num%i==0){
                valida = false;
            }
        }
        if(valida == false){
            System.out.println("Nao eh primo");
        }else{
            System.out.println("Eh primo");
        }
    }
}
