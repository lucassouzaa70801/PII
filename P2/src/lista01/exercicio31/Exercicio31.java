package lista01.exercicio31;

import java.util.Scanner;

public class Exercicio31 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int [] v = new int [10];
        int soma = 0;

        for(int i= 0; i<v.length; i++){
            System.out.print("Digite o " + (i + 1) + "º número: ");
            v[i] = leia.nextInt();
            soma += v[i];

        }
        System.out.println("A soma dos elementos do vetor eh " + soma);
    }
}
