package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class listas {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// wrapper classes
		// int -> Integer

		// double -> Double
		// boolean -> Boolean
		// char -> Character
		List<String> compras = new ArrayList<>();
		/*
		 * compras.add("Arroz"); compras.add("Bacon"); compras.add("Coentro");
		 * compras.add("Danone"); compras.add("Espinafre"); for (int i =0; i < 5;i++) {
		 * System.out.println("Adicione um item na lista"); String item =
		 * scan.nextLine(); compras.add(item);
		 * 
		 * }
		 */
	/*	while (true) {
			System.out.println("Adicione um item");
			String item = scan.nextLine();
			compras.add(item);
			System.out.println("Deseja adicionar mais um item?s/n");
			String resposta = scan.nextLine();
			if (resposta.equalsIgnoreCase("n")) {
				break;
			}
		}
System.out.println(compras);
	}
}*/ compras.add("Arroz");
	compras.add("Bacon");
	compras.add("Coentro");
	compras.add("Danone");
	compras.add("Espinafre");
	compras.set(compras.indexOf("Espinafre"), "Café");
}
	
	
	}