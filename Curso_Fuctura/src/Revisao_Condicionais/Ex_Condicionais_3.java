package Revisao_Condicionais;

import java.util.Locale;
import java.util.Scanner;

public class Ex_Condicionais_3 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	Locale.setDefault(Locale.US);
/*
* Escreva um programa que leia o preço de
* um produto e a forma de pagamento
* escolhida pelo cliente:
* → 1 - em espécie → 2 - cartão de crédito 
* → 3 - cartão de débito
* * Mostre o valor final da compra.
* * Considere que o produto tem 10% de 
* desconto se for pago em espécie ou no
* cartão de débito e não tem desconto 
* se for pago no cartão de crédito.
*/
System.out.println("Digite o nome do produto: ");
String produto = scan.nextLine();
System.out.println("Digite a quantidade: ");
int quantidade = scan.nextInt();
// Consumir o caractere de nova linha que sobra no buffer
scan.nextLine();
System.out.println("Digite o valor do produto: ");
double valor = Double.parseDouble(scan.nextLine());
// Cálculo do valor total
int valorTotal = (int) (valor * quantidade);
System.out.println("O valor total é: R$ " + valorTotal);
//Perguntar a forma de pagamento		
System.out.println("Qual a forma de pagamento?"
+ " (Espécie, Cartão de crédito, Cartão de débito)");

String formaPagamento = scan.nextLine().toLowerCase();

//Calcular o valor final de acordo com a forma de pagamento
double valorFinal;

switch (formaPagamento) {
case "espécie":
	valorFinal = valorTotal *0.90;
	System.out.printf("O valor a ser pago será: R$ %.2f "
			+ "(10%% de desconto)\n", valorFinal);
    break;
case "cartão de débito":
	valorFinal = valorTotal *0.90;
	System.out.printf("O valor a ser pago será: R$ %.2f "
			+ "(10%% de desconto)\n", valorFinal);
	break;
case "cartão de crédito":
	valorFinal = valorTotal;
	System.out.printf("O valor a ser pago será: R$ %.2f "
			, valorFinal);
	break;
default: System.out.println("Forma de pagamento invalida");	
	

}
scan.close();

}
	
}
