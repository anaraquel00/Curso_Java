package Revisão_switch_case;

import java.util.Scanner;

public class Laco_for_while {

	public static void main(String[] args) {
		
		////
		//imprima os valores pares de 1 a 50
			
			//pares -> x % 2 == 0
			
			int soma = 0;
			for(int i = 1; i <= 20; i++) {
				System.out.print(i + " ");
				soma += i; 
			}

			
			System.out.println("\nSoma: " + soma);
			
			System.out.println();
			for(int i = 20; i >= 1; i--) {
				System.out.print(i + " "); 
			}

		////

		
				Scanner scan = new Scanner(System.in);
				// peca ao usuario que insira um numero
				// continue pedindo ate que ele digite 0
				// depois, mostre a soma dos numeros digitados

				int soma1 = 0;
				
				System.out.println("Digite um valor: ");
				int numero = scan.nextInt();
				
				while(true) {
					soma1 += numero;
					System.out.println("Digite um valor: ");
					numero = scan.nextInt();
					
					if(numero == 0) {
						break;
					}
					
				}
				
		System.out.println("A soma dos valores é: " + soma1);
				
				
				
				// faca um codigo que imprima de 1 ate 20
				// depois imprima de 20 ate 1

				int valor = 1;

				while (valor <= 20) {
					System.out.print(valor++ + " ");
				}
				System.out.println();
				while (valor > 1) {
					System.out.print(--valor + " ");
				}

//				int valor = 1;
//				
//				while(valor <= 10) {
//					System.out.println("Valor: " + valor++);
//					
//				}

			}
		
	}


