package Modulo_III;

import java.util.Scanner;

public class Soma_Vetor {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);	

	final int NUM_VETOR = 5;
	int [] A = new int[NUM_VETOR];
	int[] B = new int[NUM_VETOR];
	int acumulado = 0;	
	for (int i = 0; i < NUM_VETOR; i++) {
	 System.out.printf("Digite o vetor A : ",i+1);
	 A[i] = scan.nextInt();
	}
	for (int i = 0; i < NUM_VETOR; i++) {
	 System.out.printf("Digite o vetor B: ",i+1);
	 B[i] = scan.nextInt();
	}
	 System.out.println("\nSubtrações realizadas:");
	 for (int i = 0; i < NUM_VETOR; i++) {
		 int subtracao = A[i] - B[NUM_VETOR - 1 - i];
         acumulado += subtracao;
         System.out.printf("A[%d] - B[%d] = %d%n", i, NUM_VETOR - 1 - i, subtracao);
     }	 
	
	 System.out.println("\nResultado acumulado de todas as subtrações: " + acumulado);
}
}
