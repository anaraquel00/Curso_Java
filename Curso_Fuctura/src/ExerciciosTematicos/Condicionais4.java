package ExerciciosTematicos;

import java.util.Scanner;

public class Condicionais4 {
public static void main(String[] args) {
Scanner scan =new Scanner(System.in);
System.out.println("Digite a primeira nota: ");
double nota = scan.nextDouble();
System.out.println("Digite a segunda nota: ");
double nota2 = scan.nextDouble();
System.out.println("Digite a terceira nota: ");
double nota3 = scan.nextDouble();
double media = (nota+nota2+nota3)/3;
if (media==10) {
	System.out.println("Você ganhou um chocolate!!");
}
	else if (media>=7) {
	System.out.println("Parabéns, você foi aprovado!!");
}
	else {
	System.out.println("Você esta em recuperaçao!");
}





}
}
