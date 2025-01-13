package ExerciciosTematicos;

import java.util.Scanner;

public class variaveis4 {

	public static void main(String[] args) {
		
	/*
	* Crie um programa que armazene a 
	* quantidadede kWh consumidos, o preço do kWh e
	* o valor da taxa mínima.
	*/	
	Scanner scan = new Scanner(System.in);
	System.out.println("Digite o preço do kWh: ");
	double precoKwh = scan.nextDouble();
	System.out.println("Digite a quantidade de kWh consumidos: ");
	double kWhConsumido = scan.nextDouble();
	double taxaMinima = 5.0;
	double valorTotal = (precoKwh * kWhConsumido)+ taxaMinima;
	System.out.println("O valor total é de : "+valorTotal);
	
		
		

	}

}
