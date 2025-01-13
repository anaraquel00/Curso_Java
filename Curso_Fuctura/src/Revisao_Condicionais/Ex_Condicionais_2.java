package Revisao_Condicionais;

import java.util.Scanner;

public class Ex_Condicionais_2 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);	
/*
* Escreva um programa que leia dois números
* inteiros e um operador aritmético
* (+, -, *, /) e realize a operação 
* correspondente.Se o operador não for
* válido, mostre uma mensagem de erro.
*/
System.out.println("Digite um número: ");
int num1 = 0;
num1 = scan.nextInt();
System.out.println("Digite um segundo número: ");
int	num2 = 0;
num2 = scan.nextInt();
System.out.println("Digite um operador aritmetico(+,-,*,/): ");
char operador = scan.next().charAt(0);

if (operador == '+') {
	System.out.println(num1 + num2);
		}
else if(operador == '-') {
	System.out.println(num1 - num2);
}
else if (operador == '*') {
	System.out.println(num1 *num2);
}
else if (operador =='/') {
	System.out.println(num1/num2);
}
else { 
	System.out.println("Operador invalido");
}
	}
}
