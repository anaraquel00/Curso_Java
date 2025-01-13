package métodos;

import java.util.Scanner;

public class switch_case_horas_trabalhadas {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Qual é o turno trabalhado?");
		String turno;
		turno = scan.nextLine();
		int horas;
		switch (turno) {

		case "Turno Matutino" -> horas = 8;
		case "Turno Vespertino" -> horas = 6;
		case "Turno Noturno" -> horas = 4;
		default -> horas = 18;
		}
		System.out.println("Ele trabalhou " + horas + " horas");
		scan.close();
	}
}
