package Revisão_switch_case;

import java.util.Scanner;

public class while_ {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*int valor = 1;
		while (valor < 10) {
			System.out.println("Valor atual: "+valor++);*/
			
			//Faça um código aue mostre na tela de 1 até 20	
			//Depois imprima de 20 até 1	
				
				/*int valor =1;
				while (valor <= 20) {
					System.out.print(valor++ + " ");
					
				}
				
				while (valor > 1) {
					System.out.print(--valor + " ");*/
				
				
					
				//peca ao usuario insira um numero
				//continue pedindo ate que ele digite zero
				//depois, mostre a soma dos numeros digitados
				int soma=0;
				System.out.println("Digite um valor: ");
				int num = scan.nextInt();				
				
				while(true) {
			    soma += num;
					System.out.println("Digite um valor:");
				num = scan.nextInt();	
				
				if (num ==0) {
					break;
				}
				}
				System.out.println("A soma é de: "+soma);
		}
		

	}


