package lista02.exercicio02;

import java.util.Scanner;

/**
 *  teste exercicio 02
 */
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        int numero = leia.nextInt();
        if(ePar(numero)){
            System.out.println("É par");
        }else{
            System.out.println("É impar");
        }
    /** Função para identificar se o numero é par ou ímpar
     * @param numero valor inteiro digitado pelo usuario
     * @return verdadeiro ou falso conforme o valor de numero de entrada
     * */
    }
    public static boolean ePar(int numero){
       return (numero % 2) == 0;
    }


}
