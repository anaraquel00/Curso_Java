package Métodos;

import java.util.Scanner;

public class carro_app {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);	
	
	System.out.println("Informe o modelo do carro: ");
	String modelo = scan.nextLine();
	System.out.println("Informe o ano do carro: ");
	int ano = scan.nextInt();
	scan.nextLine();
	System.out.println("Informe a cor do carro: ");
	String cor = scan.nextLine();
	Carro carro = new Carro(modelo, ano, cor);
	System.out.println("Carro é um carro de modelo "
			+modelo+"\nAno: "+ano+
			"\nCor: "+cor+"\né o carro mais"
					+ " vendido da concessionaria.");
	
	
}
	
}
