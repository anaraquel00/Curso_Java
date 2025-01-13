package Modulo_III;

import java.util.Scanner;

public class Ex_Vetores {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

System.out.println("Digite o nome do produto: ");
String produto = scan.nextLine();
System.out.println("Digite o codigo do produto: ");
double codigo = scan.nextDouble();
System.out.println("Digite o preço do produto: ");
double preco = scan.nextDouble();
if (codigo % 2 == 0 || preco > 1000.0) {
	double reajuste = preco *1.20;
	System.out.println("O valor do produto foi reajustado em "+reajuste);
}else if (codigo % 2 != 0) {
	double reajuste = preco *1.15;
	System.out.println("O valor do produto foi reajustado em "+reajuste);
	
}else { 
	double reajuste = preco *1.10;
	System.out.println("O valor do produto foi reajustado em "+reajuste);
}}}
