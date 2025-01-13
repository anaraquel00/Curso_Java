package Revisao_Repeticao;
import java.util.Random;
import java.util.Scanner;
public class MegaSena {

	public static void main(String[] args) {
	Random loto = new Random();
	Scanner scan = new Scanner(System.in);
	int[] numerosSorteados = new int[6];
	for (int i = 0; i < 6; i++) {
        numerosSorteados[i] = loto.nextInt(60) + 1;
	}
	int [] numerosUsuario = new int[6];
	System.out.println("Digite 6 números entre 1 e 60:");
	for (int i = 0; i < 6; i++) {
        System.out.print("Número " + (i + 1) + ": ");
        numerosUsuario[i] = scan.nextInt();
     	}
	int acertos = 0;
    System.out.println("\nNúmeros sorteados:");
    for (int numero : numerosSorteados) {
        System.out.print(numero + " ");
    }
    System.out.println("\n\nNúmeros que você escolheu:");
    for (int numero : numerosUsuario) {
        System.out.print(numero + " ");
    }

    System.out.println("\n\nAcertos:");
    for (int numeroUsuario : numerosUsuario) {
        for (int numeroSorteado : numerosSorteados) {
            if (numeroUsuario == numeroSorteado) {
                System.out.print(numeroUsuario + " ");
                acertos++;
            }
	}
    }  
 
System.out.println("\n\nVocê acertou " + acertos + " números!");

scan.close();
	}
}
