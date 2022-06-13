package jsnacks;

public class JSnack4 {

	public static void main(String[] args) {
		int sommanumeri = 0;
		int[] numeri = { 23, 54, 32, 6, 33, 12, 18, 32, 21, 67, 87, 90, 14, 1, 2, 3, 4, 5, 6 };
		for (int i = 0; i < numeri.length; i++) {
			if (!(numeri[i] % 2 == 0)) {
				sommanumeri += numeri[i];
			}
		}
		System.out.println("La somma dei numeri in posizione dispari é: " + sommanumeri);
	}

}
