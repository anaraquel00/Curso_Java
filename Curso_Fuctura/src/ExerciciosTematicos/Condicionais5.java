package ExerciciosTematicos;

import java.util.Scanner;

public class Condicionais5 {
public static void main(String[] args) {
	/*
	 * Uma academia oferece um desconto de 20% para pessoas 
	 * que treinam mais de 5 vezes por semana.
	 * Escreva um programa que pergunte quantos
	 * dias o usuário treina por semana e
	 * mostre o valor com desconto, caso aplicável.
	 */
Scanner scan = new Scanner(System.in);
System.out.println("Digite quantos dias da semana: ");
int diaSemana = scan.nextInt();
double desconto=0.20;
double valorTreino = 20.0;
if (diaSemana>5) {
	desconto = valorTreino-desconto;
	System.out.println("Em "+ diaSemana +"dias de treino semanal você paga "+desconto+" reais.");
}
else {
System.out.println("Em "+ diaSemana +" dias de treino você nao tem desconto");
}
}
}