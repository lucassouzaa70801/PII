package lista01.exercicio05;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        double horas = 0 ;
        double conversorM;
        double conversorS;
    Scanner leia = new Scanner(System.in);

        System.out.println("Insira o tempo em horas: " );
        horas = leia.nextDouble();

        conversorM =  horas * 60;
        conversorS = horas * 3600;

        System.out.println("A hora equivalente em minutos eh: " + conversorM);
        System.out.println("A hora equivalente em minutos eh: " + conversorS);
    }
}
