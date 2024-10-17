package lista01.exercicio33;

import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
            int v[] = new int [20];
            int soma = 0;
            int media;


            for(int i = 0; i < v.length; i++){
                System.out.println("Digite o " + (i+1)+"° numero");
                v[i] = leia.nextInt();
                soma += v[i];

            }
            media = soma / v.length;
            System.out.println("A media eh: "+soma);
            }

    }

