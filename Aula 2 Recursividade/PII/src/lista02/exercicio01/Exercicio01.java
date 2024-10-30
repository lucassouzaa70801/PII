package lista02.exercicio01;

import java.util.Scanner;

public class Exercicio01 {

    public class Exercicio03 {import java.sql.SQLOutput;

        public class Exercicio01 {
            public static void main(String[] args) {
                Scanner leia = new  Scanner(System.in);
                int a ;
                int b ;
                System.out.println("Digite o valor do primeiro numero: ");
                a = leia.nextInt();
                System.out.println("Digite o valor do segundo numero: ");
                b = leia.nextInt();

                int resultado = soma(a,b);
                escrevASoma(resultado);

            }

            public static  int soma(int a, int b){
                return a+b;

            }
            public static int escrevASoma(int soma){
                System.out.println("O valor da soma eh: "+ soma);
            }

        }
    }

}
