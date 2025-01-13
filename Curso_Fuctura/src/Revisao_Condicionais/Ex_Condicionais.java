package Revisao_Condicionais;

import java.util.Locale;
import java.util.Scanner;

public class Ex_Condicionais {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	Locale.setDefault(Locale.US);

	/*
	 * Implemente um sistema de semáforo usando 
	 * switch case. Receba um estado
	 * (vermelho, amarelo ou verde) 
	 * e determine a ação apropriada.
	 */
	
	
	System.out.println("Digite o estado do semaforo "
			+ "(vermelho,amarelo,verde): ");
	String estado = scan.nextLine().toLowerCase();
	switch (estado) {
	case "vermelho" :
	System.out.println("Pare!");
	break;
 	case "amarelo" : 
	System.out.println("Reduza a velocidade");
	break;
 	case "verde" :
 	System.out.println("Siga em frente!");
 	break;	
 		default : System.err.println("Comando invalido!");
	}
	}
	}	

