package jsnacks;

import java.util.Scanner;

public class JSnack5 {

	public static void main(String[] args) {
		boolean lunghezza = true;
		int n = 0;
		String parola1, parola2;
		System.out.println("Inserisci 2 parole con la stessa lunghezza");
		Scanner scan = new Scanner(System.in);
		parola1 = scan.nextLine();
		parola2 = scan.nextLine();
		while (lunghezza) {
			if (parola1.length() == parola2.length()) {
				lunghezza = false;
			} else {
				System.out.println("Lunghezza parole non uguale, riprova: ");
				parola1 = scan.nextLine();
				parola2 = scan.nextLine();
			}
		}
		char[] charArray1 = parola1.toCharArray();
		char[] charArray2 = parola2.toCharArray();
		for (int i = 0; i < parola1.length(); i++) {
			if (!(charArray1[i] == charArray2[i])) {
				n++;
				charArray1[i] = Character.toUpperCase(charArray1[i]);
				charArray2[i] = Character.toUpperCase(charArray2[i]);
			}
		}
		parola1 = String.valueOf(charArray1);
		parola2 = String.valueOf(charArray2);
		System.out.println(
				"La distanza di Hamming é di: " + n + " e le lettere delle parole sono indicate in maiuscolo e sono:");
		System.out.println(parola1 + "\t" + parola2);
		scan.close();
	}

}
