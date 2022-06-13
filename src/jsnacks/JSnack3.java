package jsnacks;

import java.util.Random;

public class JSnack3 {

	public static void main(String[] args) {
		String[] nomi = { "Luigi", "Antonio", "Claudio", "Davide", "Lucio", "Manuel" };
		String[] cognomi = { "Carolla", "Esposito", "De Lucia", "Cavallo", "Zottoli", "Pasquale", "Monzo", "Iannece" };
		Random rand = new Random();
		for (int posizione = 0; posizione < 3; posizione++) {
			int n = rand.nextInt(nomi.length);
			int i = rand.nextInt(cognomi.length);
			System.out.println(nomi[n] + "\t" + cognomi[i]);
		}
	}

}
