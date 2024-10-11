package lista01.exercicio06;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int horasT = 0;
        double valorH = 0;


        System.out.println("Digite a quantidade de horas trabalhadas: ");
        horasT = leia.nextInt();
        System.out.println("Digite o valor da hora: ");
        valorH = leia.nextDouble();
        double salarioT = horasT*valorH;
        System.out.println("O Salario total eh: " + salarioT);

    }
}
