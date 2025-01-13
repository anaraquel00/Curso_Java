package Modulo_III;

import java.util.Scanner;

public class locadora {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);	

final int NUM_CLIENTES = 8;
String[] clientes = new String[NUM_CLIENTES];
int[] locacoes = new int[NUM_CLIENTES];
int[] locacoesGratis = new int[NUM_CLIENTES];

// Entrada de dados
for (int i = 0; i < NUM_CLIENTES; i++) {
    System.out.printf("Digite o nome do cliente %d: ", i + 1);
    clientes[i] = scan.nextLine();

    System.out.printf("Digite a quantidade de DVDs locados por %s em 2017: ", clientes[i]);
    locacoes[i] = scan.nextInt();
    scan.nextLine(); // Limpar o buffer

    // Calcula as locações grátis
    locacoesGratis[i] = locacoes[i] / 10;
}

// Exibição dos resultados
System.out.println("\nClientes e suas locações grátis:");
for (int i = 0; i < NUM_CLIENTES; i++) {
    System.out.printf("%s tem direito a %d locações grátis.%n", clientes[i], locacoesGratis[i]);
}

scan.close();
}
}

