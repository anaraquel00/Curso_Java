package Revisao_Condicionais;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		/*
		 * Escreva um programa que leia a hora atual
		 * em formato 24 horas (0 a 23) e mostre uma 
		 * saudação de acordo com o período do dia.
		 *Se a hora não estiver nesse intervalo, o 
		 *programa deve mostrar “Hora inválida”.
		 *Por exemplo, se a hora for 8, o programa
		 * deve mostrar “Bom dia”.
		 */
		  Scanner scan = new Scanner(System.in);
		  double horario = 9;
		  if (horario >= 6 && horario <=12){	
			  System.out.println("Bom dia");
		 } else if (horario >= 12.01 && horario <=17.59){
		System.out.println("Boa tarde");
	}
		 else if (horario >= 18 && horario <=23.59){
			 System.out.println("Boa noite");
		 }
        else { System.out.println("Vai dormir!");
        }
   }    
}