package lista02.exercicio04;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
    System.out.println("Digite o primeiro numero: ");
    int a = leia.nextInt();
    System.out.println("Digite o segundo numero: ");
    int b = leia.nextInt();

    int resultado = eMaior(a,b);

    System.out.println("O maior eh: "+resultado);

}
    public static int eMaior(int a, int b){
        if( a > b){
            return a;
        }else if (b >a){
            return b;
        }else{
            return 0;
        }
    }
}
