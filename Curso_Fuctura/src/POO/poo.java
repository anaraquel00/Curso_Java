package POO;

public class poo {

	public static void main(String[] args) {
		/*
		 * Pessoa tadeu = new Pessoa(); //System.out.println(tadeu);//local na memoria
		 * //preenchendo os atributos tadeu.nome ="Tadeu"; tadeu.idade=35;
		 * tadeu.cpf="1234567890"; tadeu.exibirDados();
		 * System.out.println("------------"); Pessoa gervasio = new Pessoa();
		 * gervasio.nome ="Gervasio"; gervasio.cpf="876545960"; gervasio.idade=50;
		 * 
		 * gervasio.exibirDados();
		 */
		Calculadora calc = new Calculadora();
		calc.somar(2,5); //sao argumentos inclusos no metodo
		calc.verificarMaiorNumero(2,5,6);
		calc.porcentagem(50);
		calc.raizQuadrada(81);
		calc.multiplicar(3, 9);
		calc.dividir(6, 3);
		calc.subtrair(9, 3);
		calc.verificarMaiorNumero(1,2,10);
		
	}

}
