package lista01.exercicio32;

import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int [] v = new int [15];

        for(int i = 0; i <v.length; i++){
            System.out.println("Digite o "+ (i+1)+ "° numero ");
            v[i] = leia.nextInt();
        }
        int maior = v[0];
        int menor = v[0];
        for(int i = 1; i <v.length; i++){
            if(v[i] > maior){
                maior = v[i];
            }
            if(v[i] < menor){
                menor = v[i];
            }
            System.out.println("O maior numero eh: " + maior);
            System.out.println("O menor numero eh: " + menor);
        }
    }
}
