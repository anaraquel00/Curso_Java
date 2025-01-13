package ExerciciosTematicos;

import java.util.Scanner;

public class variaveis2 {

	public static void main(String[] args) {
		/* No Mercado Mix Tadeu, a seção de frutas precisa
		 * registrar o tipo de cada
		 * fruta, a quantidade em estoque, o preço por quilo
		 * e uma informação booleana
		 * que indique se a fruta está na promoção ou não.
		 * Escreva um programa que registre esses dados para
		 * quatro frutas diferentes e
		 * exiba uma tabela com as informações para o gerente.
		 */
		Scanner scan = new Scanner(System.in);

		String fruta;
		int quantidade;
		double preço;
		System.out.println("Fruta: ");
		fruta = scan.nextLine();
		System.out.println("Quantidade: ");
		quantidade = scan.nextInt();
		System.out.println("Preço: ");
		preço = scan.nextDouble();
		double promoção = 10;
		if (preço < 10.0) {
			System.out.println("Está na promoção "+promoção);
		}
		System.out.println("Olá!\n"+fruta+" pedida!\n"+quantidade+" unidades "
				+preço+" reais e "+promoção);
	}

}
