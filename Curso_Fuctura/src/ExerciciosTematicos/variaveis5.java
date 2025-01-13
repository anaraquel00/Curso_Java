package ExerciciosTematicos;

import java.util.Scanner;

public class variaveis5 {

	public static void main(String[] args) {
	/*	Gervásio quer um programa que armazene suas notas
	    em quatro matérias e calcule a média.
		Use variáveis para guardar o nome de cada matéria,
		as notas de cada uma e exiba a média final, 
		junto com as notas e os nomes das matérias.*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a primeira matéria: ");
		String materia1 = scan.nextLine();
		System.out.println("Digite a nota da primeira matéria: ");
		double nota1 = scan.nextDouble();
		scan.nextLine();
		System.out.println("Digite a segunda matéria: ");
		String materia2 = scan.nextLine();
		System.out.println("Digite a nota da segunda matéria: ");
		double nota2 = scan.nextDouble();
		scan.nextLine();
		System.out.println("Digite a terceira matéria: ");
		String materia3 = scan.nextLine();
		System.out.println("Digite a nota da terceira matéria: ");
		double nota3 = scan.nextDouble();
		scan.nextLine();
		System.out.println("Digite a quarta matéria: ");
		String materia4 = scan.nextLine();
		System.out.println("Digite a nota da quarta matéria: ");
		double nota4 = scan.nextDouble();
		scan.nextLine();
		double media = (nota1+nota2+nota3+nota4)/4;
		System.out.println("Resultado: \n"+materia1+":"+nota1+"\n"
		+materia2+":"+nota2+"\n"+materia3+":"+nota3+"\n"+materia4+":"+nota4+"\n"+
		"Média final: "+media);
	}

}
