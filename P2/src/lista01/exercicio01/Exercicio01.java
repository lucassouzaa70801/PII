package lista01.exercicio01;

import java.util.Scanner;

public class Exercicio01 {
    //psvm
    public static void main(String[] args) {
        //scanner 'nome variavel' para entrada do teclado
            Scanner leia = new Scanner(System.in);
        int num1;
        int num2;
        int soma = 0;

        //sout
        System.out.println("Digite o num1: ");
        num1 = leia.nextInt();

        System.out.println("Digite o num2: ");
        num2 = leia.nextInt();

        soma = num1+num2;

        // resultado da operação
        System.out.println("O resultado da soma eh: " + soma);
    }

}
