package ExerciciosTematicos;

import java.util.Scanner;

public class variaveis3 {

	public static void main(String[] args) {
		/*
		 * Escreva um programa que receba o número de quilômetros
		 * da viagem, o preço médio do litro de gasolina e o consumo do carro (km/L), e exiba o valor total
		 * que será gasto com combustível.
		 */	
Scanner scan = new Scanner(System.in);
System.out.println("Digite o número de quilômetros: ");
double quilometro = scan.nextDouble();
System.out.println("Digite o preço do litro da gasolina: ");
double preçoLitro = scan.nextDouble();
System.out.println("Digite o consumo médio do carro (km/L):");
double consumoCarro = scan.nextDouble();
double litrosNecessarios = quilometro/consumoCarro;
double custoTotal = litrosNecessarios * preçoLitro;
System.out.print("O valor total será de : R$ "+custoTotal);
scan.close();		
	}

}
