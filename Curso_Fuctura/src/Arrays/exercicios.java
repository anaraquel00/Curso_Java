package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class exercicios {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("");
	//List<Integer> lista = new ArrayList<>();
	//adicionando itens à lista:
	/*lista.add(1);
	lista.add(2);
	System.out.println("Adicione um valor à lista: ");
	int valor =scan.nextInt();
	lista.add(valor);
	System.out.println(lista);
	//para cade item na lista , faça 
	for (Integer numero : lista) {
		System.out.println(Math.sqrt(numero)+" ");
	}
}*/
List<String> nomes = new ArrayList<>();
//adicionando nomes
nomes.add("Tadeu"); //indice 0
nomes.add("Gevarsio");//indice 1
nomes.add("Creso");//indice 2
nomes.add("Gumercindo");//indice 3
nomes.add("Alcebiades");//indice 4
nomes.add("Joao Guilherme");//indice 5

System.out.println(nomes);
//pecorrendo cada item da lista
for (String nome: nomes) {
	if (nome.equals("Tadeu")) {
		System.out.println("Ola, Tadeu");
	}
	
}
//remover um item
//nomes.remove("Alcebiades");//remover pelo valor do item
//nomes.remove(4);//remover pelo indice
System.out.println(nomes);
//acessar um item
System.out.println(nomes.get(4));
//localizar e modificar um item
nomes.set(nomes.indexOf("Creso"),"Creso Almeida");
System.out.println(nomes);
/*
 * Create = adicionar dados
 * Read   = acessar dados
 * Update = atualizar dados
 * Delete = apagar dados 
 */

}
}
