package Banco_de_Barril;

public class banco_app {
public static void main(String[] args) {
Conta_Banco p1 = new Conta_Banco();	
p1.setNum_Conta(974895);
p1.setDono("Maria");
p1.abrirConta("CC");

Conta_Banco p2 = new Conta_Banco();
p2.setNum_Conta(69539);
p2.setDono("Joao");
p2.abrirConta("CP");

p1.depositar(900);
p1.sacar(100);
p1.sacar(800);
p1.fecharConta();
p1.sacar(50);
p1.fecharConta();
p2.depositar(700);
p2.pagarMensal();


p1.estadoAtual();
p2.estadoAtual();


}
}
