package Revisão_switch_case;

import java.util.Scanner;

public class aula_30_11 {

	public static void main(String[] args) {
		
		/*
		 * O Índice de Massa Corpórea (IMC) é um valor calculado baseado na altura e no
		 * peso de uma pessoa. De acordo com o valor do IMC, podemos classificar o
		 * indivíduo dentro de certas faixas. → Abaixo de 18.5: Abaixo do peso → Entre
		 * 18.5 e 25: Peso ideal → Entre 25 e 30: Sobrepeso → Entre 30 e 40: Obesidade →
		 * Acima de 40: Obesidade mórbida
		 * 
		 * Observação: O IMC é calculado pela expressão peso/altura² (peso dividido pelo
		 * quadrado da altura)
		 */
		
			
				Scanner scan = new Scanner(System.in);

				System.out.println("Digite a altura");
				double altura = scan.nextDouble();
				System.out.println("Digite o peso");
				double peso = scan.nextDouble();

				double imc = peso / (altura * altura);
			String situacao = "";
		//Abaixo de 18.5: Abaixo do peso
				if(imc < 18.5) {
					situacao = "abaixo do peso";
				}
		// → Entre 18.5 e 25: Peso ideal 
				else if(imc >= 18.5 && imc < 25) {
					situacao = "peso ideal";
				}
		//Entre 25 e 30: Sobrepeso 
				else if(imc >= 25 && imc < 30) {
					situacao = "sobrepeso";
				}
		//Entre 30 e 40: Obesidade 
				else if(imc >= 30 && imc < 40) {
					situacao = "obesidade";
				}
		//Acima de 40: Obesidade mórbida
				else {
					situacao = "obesidade mórbida";
				}
			
				switch(situacao) {
				case "abaixo do peso" -> System.out.println("Você está abaixo do peso. Consulte um nutricionista.");
				case "peso ideal" -> System.out.println("Parabéns, você está no peso ideal.");
				case "sobrepeso" -> System.out.println("Você está um pouco acima do peso ideal. Repense sua rotina de exercícios.");
				case "obesidade" -> System.out.println("Você está obeso, procure um nutricionista e um cardiologista.");
				case "obesidade mórbida" -> System.out.println("Você está com obesidade mórbida, procure um médico urgentemente.");
				
					}
				
			}
		
}


