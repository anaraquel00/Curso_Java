package POO;

public class Calculadora {
	
void somar(int a,int b) {
System.out.println(a+b);	
}
Integer verificarMaiorNumero(int a,int b,int c) {
	int maior = Math.max(a, b);
	 maior = Math.max(maior,c);
	 System.out.println("O maior numero é: "+maior);
	return maior;
	 
}
void subtrair (int a, int b) {
System.out.println(a-b);

}
void multiplicar (int a, int b) {
	System.out.println(a*b);
}

void dividir (int a, int b) {
	System.out.println(a/b);
	
}

void porcentagem (int num) {
	System.out.println(num*100/100+"%");
	
}
void raizQuadrada (int num) {
	System.out.println(Math.sqrt(num)); 
}}