package Revisao_Repeticao;

import java.util.Scanner;

public class lacos_de_repeticao {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	for (int i = 1; i < 100; i++) {
		int v = (int) (Math.random() * 100);
		if (v % 2 == 0) {
			
			continue;
		}
		System.out.println(v);
	}
	}

}

