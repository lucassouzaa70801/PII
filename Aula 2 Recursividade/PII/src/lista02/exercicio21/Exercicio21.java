package lista02.exercicio21;

public class Exercicio21 {
    public static void main(String[] args) {
    int[] vetor = {1, 2, 3, 4, 5}; // Apenas um exemplo de vetor
    int soma = somaVetor(vetor, vetor.length);

    System.out.println("A soma dos elementos do vetor é: " + soma);
}

    /**
     * Calcula a soma dos elementos de um vetor recursivamente.
     * @param vetor O vetor de inteiros cujos elementos serão somados.
     * @param a O número de elementos no vetor.
     * @return A soma dos elementos do vetor.
     */
    public static int somaVetor(int[] vetor, int a) {
        if (a == 0) {
            return 0; //  se o tamanho é 0, a soma é 0
        } else {
            // Chama recursivamente para somar o último elemento com a soma do restante
            return vetor[a - 1] + somaVetor(vetor, a - 1);
        }
    }
}

