package lista01.exercicio20;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade;
        System.out.println("Informe sua idade: ");
        idade = sc.nextInt();

        if(idade >=16){
            System.out.println("Esta apta para votar");
        }else {
            System.out.println("Nao esta apta para votar");
        }
    }
}
