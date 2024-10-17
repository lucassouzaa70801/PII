package lista01.exercicio34;

import java.util.Scanner;

public class Exercicio34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v [] = new int[5];
        int contador = 0;

        for(int i = 0; i < v.length; i++){
            System.out.println("Digite o " + (i+1)+"° digite");
            v[i] = sc.nextInt();
            if(v[i] % 2 == 0) {
                contador++;
            }

        }
        System.out.println("A quantidade de numeros pares eh: "+contador);
    }
}
