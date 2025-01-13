package métodos;

import java.util.Scanner;

public class switch_case_mes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um numero do mês(1 à 12):");
		int num;
		num = scan.nextInt();

		String mesnum;

		switch (num) {

		case 1 -> mesnum = "janeiro";
		case 2 -> mesnum = "fevereiro";
		case 3 -> mesnum = "março";
		case 4 -> mesnum = "abril";
		case 5 -> mesnum = "maio";
		case 6 -> mesnum = "junho";
		case 7 -> mesnum = "julho";
		case 8 -> mesnum = "agosto";
		case 9 -> mesnum = "setembro";
		case 10 -> mesnum = "outubro";
		case 11 -> mesnum = "novembro";
		case 12 -> mesnum = "dezembro";
		default -> mesnum = "mes invalido!";
		}

		System.out.println("É o mês de " + mesnum);
		scan.close();
	}

}
