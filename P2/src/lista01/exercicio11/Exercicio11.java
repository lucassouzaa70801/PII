package lista01.exercicio11;
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int num;
        System.out.println("Insira um numero: ");
        num = leia.nextInt();

        if (num % 2 == 0) {
            System.out.println("O numero " + num + " eh par");
        } else {
            System.out.println("O numero " + num + " eh impar");
        }
    }
}
