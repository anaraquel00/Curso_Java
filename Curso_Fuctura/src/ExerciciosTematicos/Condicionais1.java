package ExerciciosTematicos;

import java.util.Scanner;

public class Condicionais1 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);	
	System.out.println("Bem vindos ao Zoombie!!\nDigite sua idade: ");
	int idade = scan.nextInt();
	if (idade<=12) {
		System.out.println("Criança nao paga!!");
	}
	else if (idade>12 && idade < 60) {
		double ingresso = 20.0;
		System.out.println("O ingresso custa R$ "+ingresso);
	}
	else 	{
		double ingresso2= 10.0;
		System.out.println("O ingresso fica por: "+ingresso2);
	}
	

	}

}
