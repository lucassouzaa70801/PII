package lista01.exercicio19;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double valorp, valordesc, desc, valorf;
        System.out.println("Informe o valor do produto: ");
        valorp = leia.nextDouble();
        System.out.println("Informe o percentual do desconto: ");
        valordesc = leia.nextDouble();

        desc = (valordesc/100) * valorp;
        valorf = valorp - desc;
        System.out.println("O valor do produto com desconto eh " + valorf);
    }
}
