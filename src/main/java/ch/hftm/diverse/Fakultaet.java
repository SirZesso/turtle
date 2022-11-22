package ch.hftm.diverse;

public class Fakultaet {

	// Exponentiell erhöhen
	public static void main(String[] args) {
		for (int i = 0; i <= 9; i++) {
			System.out.println("fak(" + i + ") --> " + fak(i));
		}
	}

	/***
	 * @param n Wert, von welchem die Fakultät bestimmt wird
	 * @return Fakultät von n
	 */
	public static int fak(int n) {
		// Beenden der Rekursion
		if (n <= 1) {
			return 1;
		}
		return n * fak(n - 1);
	}
}