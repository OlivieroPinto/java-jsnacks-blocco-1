package jsnacks;

import java.util.Scanner;

public class JSnak1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero = 0;
		int sommanumeri = 0;
		System.out.println("scrivi 5 numeri e io ti diró la loro somma");
		for (int i = 1; i <= 5; i++) {
			numero = scan.nextInt();
			sommanumeri = sommanumeri + numero;
		}
		System.out.println(sommanumeri);
		scan.close();
	}

}
