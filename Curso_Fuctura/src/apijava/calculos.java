package apijava;

import java.util.Scanner;

public class calculos {
public static void main(String[] args) {
	/*int i;
	for(i=1;i<100;i++) { 
	System.out.println(Math.pow(i, 2));*/
	
	/*System.out.println("Numero decimal\tNumero Binario");
	System.out.println("--------------------------------");
	
	for (int i=1;i<101;i++) {
		String binario = Integer.toBinaryString(i);
		System.out.println(i+"\t\t"+binario);
		*/
	
	/*System.out.println("Numero Binario\t Numero decimal");
	for (int i=1;i<11;i++) {
	String binario = Integer.toBinaryString(i);
	System.out.println(binario+"\t\t"+i);
	}*/
	/*
	 * Escreva um programa em Java que calcule
	 * as raízes de uma equação de segundo
	 * grau utilizando a fórmula de Báskara.
	 */
	 /*int i=1;
	 int a = 2;
	 int b = 3;
	 int c = 5;
	 System.out.println(Math.pow(i,2)*a+b*i+c);*/
	
		/*
		 * Escreva um programa em Java que leia
		 * um número real qualquer e um número de
		 * casas decimais (inteiro) e o arredonde
		 * o número real para o número de casas
		 * especificado.
		 */
	 
	        // Criação do scanner para entrada do usuário
	       // Scanner scanner = new Scanner(System.in);

	        // Leitura do número real
	       // System.out.print("Digite um número real: ");
	       // double numero = scanner.nextDouble();

	        // Leitura do número de casas decimais
	       // System.out.print("Digite o número de casas decimais: ");
	       // int casasDecimais = scanner.nextInt();

	        // Arredondar o número para o número de casas decimais especificado
	       // double resultado = Math.round(numero * Math.pow(10, casasDecimais)) / Math.pow(10, casasDecimais);

	        // Exibir o resultado
	        //System.out.println("O número arredondado é: " + resultado);

	        // Fechar o scanner
	       // scanner.close();
			/*
			 * Escreva um programa em Java que
			 * simule o lançamento de um dado, ou seja,
			 * sorteie um número entre 1 e 6.
			 */
			
			Scanner scan = new Scanner(System.in); 
			
			//  (int)(Math.random()*6); System.out.println(randomNum);
		System.out.println("Digite o 1° numero: ");
		double num = scan.nextDouble();
		System.out.println("Digite o 2° numero: ");
		double num2 = scan.nextDouble();
		
		System.out.println(Math.pow(num, num2)
				+";"+Math.sqrt(num)+";"
		+Math.sqrt(num2)+";"
		+Math.cbrt(num)+";"
		+Math.cbrt(num2));			
	        
	        }
	
	
	

	 

}

		


