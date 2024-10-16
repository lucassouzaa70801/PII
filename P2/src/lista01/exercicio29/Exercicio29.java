package lista01.exercicio29;

import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int num;
        int soma = 0;
        boolean teste = true;
        System.out.println("Digite um numero: ");
        num = leia.nextInt();

        for(int i= 1; i<=num; i++){
            if(num % i == 0){
                soma +=i;
            }else if( soma == num){
                teste = true;
            }else{
                teste = false;
            }
        }
            if (teste == true){
                System.out.println("e perfeito");
            }else{
                System.out.println("nao e perfeito");
            }
    }
}
