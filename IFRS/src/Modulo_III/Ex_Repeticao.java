package Modulo_III;

import java.util.Scanner;

public class Ex_Repeticao {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("Informe a quantidade de funcionarios do sexo masculino: ");
int QuantFuncM = scan.nextInt();
System.out.println("Informe a quantidade de funcionarios do sexo feminino: ");
int QuantFuncF = scan.nextInt();
int QuantFunc = QuantFuncM + QuantFuncF;
double total=0;
int contador = 1;
while (contador<=QuantFunc) {
System.out.println("Deseja adicionar mais funcionario: "+contador);

QuantFunc += scan.nextDouble();
contador++;
}
int mediaM = QuantFuncM/QuantFunc;
System.out.println("A média de homens é: "+mediaM);
int mediaF = QuantFuncF/QuantFunc;
System.out.println("A média de mulheres é : "+mediaF);

}	


}

