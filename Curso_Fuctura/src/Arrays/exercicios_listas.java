package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class exercicios_listas {
public static void main(String[] args) {
	
	Random r = new Random();
	// 1)Crie uma lista com numeros aleatorios.
	 List<Integer>lista = new ArrayList<>();
	 for (int i=0;i<20; i++) {
		 int random = r.nextInt(100)+1;
		 lista.add(random);
	}
	 System.out.println(lista);
	 //2) Adicione o número 11 à Lista criada no exercício anterior.
	 lista.add(11);
	 System.out.println(lista);
	 //3) Remova o número na 5ª posição da Lista.
	 lista.remove(4);
	 System.out.println(lista);
	 //4) Concatene a Lista atual com uma nova Lista contendo os números de 12 a 15.
	 List<Integer>lista2 = new ArrayList<>();
	 lista2.add(12);
	 lista2.add(13);
	 lista2.add(14);
	 lista2.add(15);
	 lista.addAll(lista2);
	 System.out.println(lista);
	 //5) Encontre o comprimento da Lista resultante.
	 System.out.println("Tamanho da Lista: " + lista.size());
	 //6) Verifique se o número 8 está presente na Lista.
	 System.out.println("A lista contém 8? " + lista.contains(8));
	 //7) Inverta a ordem dos elementos na Lista.
	 System.out.println("Lista invertida: "+lista.reversed());
	 // 8) Remova todos os números pares da Lista.
	 System.out.println("Numeros pares: ");
	 // 9) Substitua o valor da 3ª posição por 30.
	System.out.println("Substituicao: ");
	lista2.set(2, 30);
	System.out.println(lista2);
	 // 10) Ordene a Lista de forma crescente.
	Collections.sort(lista2);
	System.out.println(lista2);
	}
}
