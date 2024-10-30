package lista02.exercicio03;

import java.util.Scanner;

public class Exercicio03 {  public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
    System.out.println("Informe o fatorial: ");
    int num = leia.nextInt();

    int resultado = eFatorial(num);
    System.out.println(resultado);

}

    public static int eFatorial(int num){
        if(num == 0){
            return 1;
        }else{

        }return num * eFatorial(num-1);

    }








}

