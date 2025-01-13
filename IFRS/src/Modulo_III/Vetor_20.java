package Modulo_III;

import java.util.Scanner;

public class Vetor_20 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);	
	 final int TAMANHO = 20;
     int[] vetorOriginal = new int[TAMANHO];
     double[] vetorResultado = new double[TAMANHO];
     int maiorValor;

     // Entrada de dados
     System.out.println("Digite os 20 números inteiros do vetor:");
     for (int i = 0; i < TAMANHO; i++) {
         System.out.printf("Elemento %d: ", i + 1);
         vetorOriginal[i] = scan.nextInt();
     }

     // Encontrar o maior valor
     maiorValor = vetorOriginal[0];
     for (int i = 1; i < TAMANHO; i++) {
         if (vetorOriginal[i] > maiorValor) {
             maiorValor = vetorOriginal[i];
         }
     }

     // Divisão dos elementos pelo maior valor
     for (int i = 0; i < TAMANHO; i++) {
         vetorResultado[i] = (double) vetorOriginal[i] / maiorValor;
     }

     // Exibição dos resultados
     System.out.println("\nVetor após a divisão pelo maior valor:");
     for (int i = 0; i < TAMANHO; i++) {
         System.out.printf("Elemento %d: %.2f%n", i + 1, vetorResultado[i]);
     }
}}
