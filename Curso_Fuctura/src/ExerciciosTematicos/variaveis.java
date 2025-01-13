package ExerciciosTematicos;

import java.util.Scanner;

public class variaveis {

	public static void main(String[] args) {
		/*
		 * Seu Creso tem uma loja de animais e precisa de um programa que armazene o
		 * nome de cada animal, sua espécie e idade em anos. Além disso, ele quer saber
		 * quanto cada um dos animais come em gramas de ração por dia. Crie variáveis
		 * para armazenar essas informações e exiba tudo de maneira organizada para Seu
		 * Creso revisar.
		 */
		Scanner scan = new Scanner(System.in);

		String nome, especie;
		int idade;
		double racao;
		System.out.println("Nome do animal: ");
		nome = scan.nextLine();
		System.out.println("Espécie do animal: ");
		especie = scan.nextLine();
		System.out.println("Idade do animal: ");
		idade = scan.nextInt();
		System.out.println("Quantidade de racão por dia: ");
		racao = scan.nextDouble();
		System.out.println("Dados do animal: \n" + nome + " da espécie" + " " + especie + ".\nTem " + idade
				+ " anos e come " + racao + " quilos de racão por dia.");

	}

}
