package Modulo_III;

import java.util.Scanner;

public class Fatorial {
public static void main(String[] args) {
	
	        Scanner scan = new Scanner(System.in);

	        final int TAMANHO = 5;
	        int[] numeros = new int[TAMANHO];
	        int soma = 0;

	        // Entrada dos números
	        for (int i = 0; i < TAMANHO; i++) {
	            System.out.printf("Digite o %dº número: ", i + 1);
	            numeros[i] = scan.nextInt();
	            soma += numeros[i]; // Acumula a soma dos números
	        }

	        // Exibição dos números digitados
	        System.out.print("Os números digitados foram:\n");
	        for (int i = 0; i < TAMANHO; i++) {
	            System.out.print(numeros[i]);
	            if (i < TAMANHO - 1) {
	                System.out.print(" + ");
	            }
	        }
	        System.out.printf(" = %d%n", soma); // Exibe a soma total

	        scan.close();
	    }
	}
