package Revisao_Condicionais;

import java.util.Scanner;

public class Ex_Condicionais_1 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);	
/*
 * Escreva um programa que leia uma letra do alfabeto
 * e diga se ela é uma vogal
 * ou uma consoante. Lembre-se que, 
 * na comparação de Strings, usa-se o método
 * .equals() ou o .equalsIgnoreCase().
 */
System.out.println("Digite uma letra do alfabeto:");
String letra = scan.next().toLowerCase();
if ((letra.equals("a")) || 
(letra.equals("e")) ||
(letra.equals("i")) ||	
(letra.equals("o")) ||
(letra.equals("u"))) 
{
System.out.println("Vogal");	
}
else	{
	System.out.println("Consoante");
	}
}
	}