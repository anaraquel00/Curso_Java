package Revisao_Condicionais;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		/*
		 * Desenvolva um conversor que recebe
		 *  uma unidade de medida (metro, centímetro,
		 * quilômetro) e converte para outra unidade 
		 * com base na entrada.
		 */
   Scanner scan = new Scanner(System.in);
   System.out.println("Digite um valor em metros:");
  int metros = scan.nextInt();
  int centimetros = metros * 100;
  double quilometros = metros/1000.0;
		  
  System.out.println("O valor em metros: "+metros);
  System.out.println("Convertido para centimetros: "+centimetros);
  System.out.println("Convertido para quilometros: "+quilometros);		
	}

}
