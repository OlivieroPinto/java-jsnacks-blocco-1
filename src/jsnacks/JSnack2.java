package jsnacks;

import java.util.Scanner;

public class JSnack2 {

	public static void main(String[] args) {
		int numero;
		System.out.println("inserisci un nuemro:");
		Scanner scan = new Scanner(System.in);
		numero = scan.nextInt();
		if (numero % 2 == 0) {
			System.out.println(numero);
		} else {
			numero++;
			System.out.println(numero);
		}
		scan.close();
	}

}
