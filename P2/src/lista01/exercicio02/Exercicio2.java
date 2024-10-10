package lista01.exercicio02;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        float nota1 = 0;
        float nota2 = 0;
        float nota3 = 0;
        float nota4 = 0;
        float media = 0;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o nota1: ");
        nota1 = leia.nextFloat();

        System.out.println("Digite o nota2: ");
        nota2 = leia.nextFloat();

        System.out.println("Digite o nota3: ");
        nota3 = leia.nextFloat();

        System.out.println("Digite o nota4: ");
        nota4 = leia.nextFloat();

        media = (nota1 + nota2 + nota3 + nota4)/4;

        System.out.println("A media eh: " + media);
    }

}
