package Modulo_III;

import java.util.Scanner;

public class Exercicios_cond {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int acoesLucroSuperior1000 = 0;
int acoesLucroInferior200 = 0;

while(true) {
	System.out.print("Digite o tipo de ação (ou 'F' para finalizar): ");
    char tipoAcao = scan.next().charAt(0);

	if(tipoAcao == 'F' || tipoAcao == 'f') { 
		break;
	}
	  System.out.print("Digite o preço de compra da ação: ");
      double precoCompra = scan.nextDouble();

      System.out.print("Digite o preço de venda da ação: ");
      double precoVenda = scan.nextDouble();

      double lucro = precoVenda - precoCompra;
    
      if (lucro > 1000) {
          acoesLucroSuperior1000++;
      } else if (lucro < 200) {
          acoesLucroInferior200++;
      }
      System.out.println("\nResumo:");
      System.out.println("Quantidade de ações com lucro superior a R$ 1.000,00: " + acoesLucroSuperior1000);
      System.out.println("Quantidade de ações com lucro inferior a R$ 200,00: " + acoesLucroInferior200);

      scan.close();
}
}}





