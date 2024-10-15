package lista01.exercicio16;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ano;
        System.out.println("Digite o ano");
        ano = sc.nextInt();
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println("eh bissexto");
        }else{
            System.out.println("nao eh bissexto");
        }
    }
}
