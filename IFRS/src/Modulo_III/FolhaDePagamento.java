package Modulo_III;

import java.util.Scanner;

public class FolhaDePagamento {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		final int NUM_FUNCIONARIOS = 58;
		final double PLANO_SAUDE_PERCENTUAL = 0.045;

		double totalFolhaPagamento = 0;
		double totalImpostoDeRenda = 0;

		for (int i = 1; i <= NUM_FUNCIONARIOS; i++) {
			// Entrada do salário
			System.out.printf("Digite o salário do funcionário %d: R$ ", i);
			double salario = scanner.nextDouble();

			// Cálculo do plano de saúde
			double descontoPlanoSaude = salario * PLANO_SAUDE_PERCENTUAL;

			// Cálculo do INSS
			double descontoINSS = 0;
			if (salario <= 1212) {
				descontoINSS = salario * 0.075;
			} else if (salario <= 2427.35) {
				descontoINSS = salario * 0.09;
			} else if (salario <= 3641.03) {
				descontoINSS = salario * 0.12;
			} else {
				descontoINSS = salario * 0.14;
			}

			// Cálculo do imposto de renda (IR)
			double descontoIR = 0;
			if (salario > 1903.98 && salario <= 2826.65) {
				descontoIR = (salario - 1903.98) * 0.075;
			} else if (salario > 2826.65 && salario <= 3751.05) {
				descontoIR = (salario - 2826.65) * 0.15;
			} else if (salario > 3751.05 && salario <= 4664.68) {
				descontoIR = (salario - 3751.05) * 0.225;
			} else if (salario > 4664.68) {
				descontoIR = (salario - 4664.68) * 0.275;
			}

			// Cálculo do salário líquido
			double salarioLiquido = salario - descontoPlanoSaude - descontoINSS - descontoIR;

			// Acumula os valores para cálculos totais
			totalFolhaPagamento += salarioLiquido;
			totalImpostoDeRenda += descontoIR;

			// Exibição do salário líquido do funcionário
			System.out.printf("Salário líquido do funcionário %d: R$ %.2f%n", i, salarioLiquido);
		}

		// Exibição dos resultados finais
		System.out.printf("%nResumo da folha de pagamento:%n");
		System.out.printf("Valor total da folha de pagamento: R$ %.2f%n", totalFolhaPagamento);
		System.out.printf("Valor total do imposto de renda recolhido: R$ %.2f%n", totalImpostoDeRenda);

		scanner.close();
	}
}
