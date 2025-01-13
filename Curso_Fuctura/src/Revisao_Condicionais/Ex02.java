package Revisao_Condicionais;

public class Ex02 {

public static void main(String[] args) {
	/*
	 * Crie um programa que recebe uma nota
	 * musical (A, B, C, D, E ou F) e fornece
	 * informações sobre ela, como a frequência.
	 */
	
	String notaMusical = "A";
	switch (notaMusical){
	
	case "A" -> System.out.println("Do"); 
	case "B" -> System.out.println("Re");
	case "C" -> System.out.println("Mi");
	case "D" -> System.out.println("Fa");
	case "E" -> System.out.println("So");
	case "F" -> System.out.println("La");
	default -> System.out.println("Nota invalida");
			}
	}
}
	
	


