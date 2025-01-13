package Modulo_III;

import java.util.Scanner;

public class Matriz_multiplas {
public static void main(String[] args) {
	
	        Scanner scan = new Scanner(System.in);

	        final int LINHAS = 6;
	        final int COLUNAS = 4;

	        int[][] matriz = new int[LINHAS][COLUNAS];
	        int[] maioresElementos = new int[LINHAS];

	        // Preenchimento da matriz
	        System.out.println("Digite os elementos da matriz 6 x 4:");
	        for (int i = 0; i < LINHAS; i++) {
	            System.out.printf("Linha %d:%n", i + 1);
	            for (int j = 0; j < COLUNAS; j++) {
	                System.out.printf("Elemento [%d][%d]: ", i, j);
	                matriz[i][j] = scan.nextInt();

	                // Determina o maior elemento da linha
	                if (j == 0 || matriz[i][j] > maioresElementos[i]) {
	                    maioresElementos[i] = matriz[i][j];
	                }
	            }
	        }

	        // Multiplicação de cada elemento pelo maior de sua linha
	        for (int i = 0; i < LINHAS; i++) {
	            for (int j = 0; j < COLUNAS; j++) {
	                matriz[i][j] *= maioresElementos[i];
	            }
	        }

	        // Exibição da matriz resultante
	        System.out.println("\nMatriz resultante após a multiplicação:");
	        for (int i = 0; i < LINHAS; i++) {
	            for (int j = 0; j < COLUNAS; j++) {
	                System.out.printf("%5d ", matriz[i][j]);
	            }
	            System.out.println();
	        }

	        scan.close();
	    }
	

}

