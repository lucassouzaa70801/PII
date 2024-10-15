package lista01.exercicio13;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double peso;
        double altura;
        double imc;
        System.out.println("Insira seu peso: ");
        peso = leia.nextDouble();
        System.out.println("Insira sua altura: ");
        altura = leia.nextDouble();

        imc = peso/(altura * altura);

        if (imc >= 18.5 && imc <= 24.90) {
            System.out.println("parabens, esta com o peso ideal");

        } else if (imc < 18.5) {
            System.out.println("Voce esta abaixo do peso, va comer");
        }else{
            System.out.println("Voce esta acima do peso, va treinar");
        }
    }
}