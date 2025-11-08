package p2;

public class P2_main {

	public static void main(String[] args) {
		int a = 3, b = 5, c = 6, intResult;
		double x = 1.5, y = 2.3, doubleResult;

		// a) Ergebnis: -3; Punkt vor Strich gitl aufgrunf des Rangs der Operationen.
		intResult = c - a * 3;
		System.out.println("intResult: " + intResult);

		// b) Ergebnis: 1; Bei 6:5 wird der Rest aufgrund des int Datentype weggelassen.
		intResult = c / b;
		System.out.println("intResult: " + intResult);

		// c) Ergebnis: 3; Wie bei b) wird der Rest von 5:6 weggelasen und es wird nur 0
		// übergebn und mit 3 addiert. Hie rist wieder daer int Datentyp der Grund für
		// das Verhalten.
		intResult = a + b / c;
		System.out.println("intResult: " + intResult);

		// d) Ergebnis: 1; Der Datentyp double des Ergbnisse
		// ist hier egal, da wir vor der Zuweisung nur mit int Werten rechnen und dort
		// die Nachkommastellen ignoriert werden. Am Ende haben wir zwar einen double
		// Werte, aber vorher wurden bereits die Nachkommstalllen fallengelassen.
		doubleResult = c / b;
		System.out.println("doubleResult: " + doubleResult);
		// Fix, Ergebnis: 1.2
		doubleResult = (double) c / b;
		System.out.println("doubleResult: " + doubleResult);

		// e) Ergebnis: 6; Ähnlicher Fall wie bei c). Der Datentyp double des Ergbnisse
		// ist hier egal, da wir vor der Zuweisung nur mit int Werten rechnen.
		doubleResult = c + a / b;
		System.out.println("doubleResult: " + doubleResult);
		// Fix, Ergbnis: 6.6
		doubleResult = c + (double) a / b;
		System.out.println("doubleResult: " + doubleResult);

		// f) Ergebnis: 13.0; Da hier mti double und int Werten gerehcntet, erfolgt eine
		// implizite Typumwandlung des int Werts in double. Dadruch bleiben die
		// Nachkommsatellen erhalte.
		doubleResult = x + y * b;
		System.out.println("doubleResult: " + doubleResult);
	}

}
