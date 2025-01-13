package ExerciciosTematicos;

import java.util.Scanner;

public class Condicionais2 {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("Bem vindos ao Mix Tadeu!!!\nDigite a "
		+ "quantidade de itens:");
int quantidade = scan.nextInt();
System.out.println("Digite o valor total da compra: ");
double valorTotal =scan.nextDouble();
double desconto =0;
if (quantidade >= 6 && quantidade <=10) {
	desconto = 0.05;
}
else if (quantidade >10) {
	desconto =0.10;
}
double valorDesconto = valorTotal * desconto;
double valorFinal = valorTotal - valorDesconto;
System.out.printf("Quantidade de itens: %d\n", quantidade);
System.out.printf("Valor total: R$ %.2f\n", valorTotal);
System.out.printf("Desconto aplicado: R$ %.2f\n", valorDesconto);
System.out.printf("Valor final com desconto: R$ %.2f\n", valorFinal);



}
}
