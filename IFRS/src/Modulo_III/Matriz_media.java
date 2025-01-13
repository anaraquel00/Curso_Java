package Modulo_III;

import java.util.Scanner;

public class Matriz_media {
public static void main(String[] args) {
	
        Scanner scan = new Scanner(System.in);

        final int TAMANHO = 10;
        int[][] matriz = new int[TAMANHO][TAMANHO];
        int somaDiagonal = 0;

        // Preenchimento da matriz
        System.out.println("Digite os elementos da matriz 10 x 10:");
        for (int i = 0; i < TAMANHO; i++) {
            for (int j = 0; j < TAMANHO; j++) {
                System.out.printf("Elemento [%d][%d]: ", i, j);
                matriz[i][j] = scan.nextInt();

                // Soma os elementos da diagonal principal
                if (i == j) {
                    somaDiagonal += matriz[i][j];
                }
            }
        }

        // Cálculo da média da diagonal principal
        double mediaDiagonal = (double) somaDiagonal / TAMANHO;

        // Exibição da média
        System.out.printf("\nA média dos elementos da diagonal principal é: %.2f%n", mediaDiagonal);

        scan.close();
    }
}

