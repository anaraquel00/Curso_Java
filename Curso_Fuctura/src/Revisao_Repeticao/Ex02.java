package Revisao_Repeticao;

import java.util.Random;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		/*
		 * Implemente um jogo em que o computador
		 *  escolhe um número aleatório entre 1 e
		 * 100, e o jogador tenta adivinhar. O jogo
		 *  continua até que o jogador acerte o
		 * número.
		 */
     Random loto = new Random();
	 Scanner scan = new Scanner(System.in);	
	 int numeroSecreto = loto.nextInt(100); 
	 int palpite =0;	
System.out.println("Bem-vindo ao jogo de adivinhação!");
System.out.println("Tente adivinhar o número entre 1 e 100.");
while (palpite != numeroSecreto) {
System.out.println("Digite o seu palpite: ");
palpite = scan.nextInt();
if (palpite > numeroSecreto){
	System.out.println("Voce não acertou!");
}
if (palpite < numeroSecreto){
	System.out.println("Voce não acertou!!");
}
else {
    System.out.println("Parabéns! Você adivinhou o número!");
}
		
	}
}
}
