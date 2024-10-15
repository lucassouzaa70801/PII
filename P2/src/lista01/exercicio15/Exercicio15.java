package lista01.exercicio15;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double lado1, lado2, lado3;
        System.out.println("Digite o valor do lado 1 do triangulo");
        lado1 = sc.nextDouble();
        System.out.println("Digite o valor do lado 2 do triangulo");
        lado2 = sc.nextDouble();
        System.out.println("Digite o valor do lado 3 do triangulo");
        lado3 = sc.nextDouble();

        if( lado1 == lado2 || lado2 == lado3){
            System.out.println("O triangulo eh equilatero");
        }else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
            System.out.println("O triangulo eh isoceles");
        }else{
            System.out.println("O triangulo eh escaleno");
        }
    }
}
