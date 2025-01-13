package ExerciciosTematicos;

import java.util.Scanner;

public class Repeticao {
public static void main(String[] args) {
	/*Genésia quer fazer uma contagem regressiva 
	de dias até seu aniversário. 
	Escreva um programa que receba o número 
	de dias até o aniversário dela 
	e conte até zero, exibindo uma mensagem para 
	cada dia que passa.
*/
	Scanner scan = new Scanner(System.in);
	/*
	 * System.out.println("Digite quantos dias faltam pro aniversario de Genésia");
	 * int dias = scan.nextInt(); while (dias >= 0) { if (dias > 0) {
	 * System.out.println("Faltam "+dias+" dias pro aniversario de Genésia"); } else
	 * { System.out.println("Hoje é o seu aniversario! Parabéns!!"); } dias--; }
	 * scan.close();
	 */
	/*
	 * System.out.println("Informe quantos dias para o aniversario"); int
	 * diasRestantes = scan.nextInt(); for (int i=diasRestantes;i>=0;i--) { if
	 * (diasRestantes > 0) { System.out.println("Faltam %d dias.".formatted(i)); }
	 * else { System.out.println("Parabéns! Hoje é o seu aniversario!!"); }
	 * diasRestantes --; }
	 */
	
	System.out.println("Informe a quantidade de latas vendidas: ");
	int latasVendidas = scan.nextInt();
	//double precoDaLata=0;
	double total=0;
	int contador = 1;
	while (contador<=latasVendidas) {
	System.out.println("Informe o preço da lata n° %d: ".formatted(contador));
	
	total += scan.nextDouble();
  contador++;
  }
	System.out.println("O total de latas vendidas foi "+latasVendidas);
	System.out.println("O valor total da venda foi R$ "+total);
	
}	
}

