package métodos;

import java.util.Scanner;

public class switch_classificador_idade {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a idade entre 0 à 100:");
		int idade = scan.nextInt();
		String crianca, adolescente, adulto, idoso;

		switch (idade) {

		case 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12:
			System.out.println("E uma criança!");
			break;
		case 13, 14, 15, 16, 17:
			System.out.println("E um adolescente!");
			break;
		case 18 - 64:
			System.out.println("E um adulto!");
			break;
		case 65 - 100:
			System.out.println("E um idoso");
			break;
		default:
			System.err.println("Nao existe!");
			break;

		}

	}

}
