package POO_2;

public class Poupança_Bamerindus {

public static void main(String[] args) {
Conta_Bancaria cc = new Conta_Bancaria();	
cc.setTitular("Dona Maria");
cc.numeroConta= 8657389-5;
cc.abrirConta("cp");
cc.depositar(600);
cc.sacar(200);
cc.StatusConta();
	
	}

}
