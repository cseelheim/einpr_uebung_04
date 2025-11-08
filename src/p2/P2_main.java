package p2;

public class P2_main {

	public static void main(String[] args) {
		int a = 3, b = 5, c = 6, intResult;
		double x = 1.5, y = 2.3, doubleResult;

		// a) Ergebnis: -3; Punkt-vor-Strich gilt hier ebenfalls aufgrund des Ranges der
		// Operationen.
		intResult = c - a * 3;
		System.out.println("intResult: " + intResult);

		// b) Ergebnis: 1; Bei 6/5 werden die Nachkommastellen des Ergebnisses aufgrund
		// der Nutzung des int Datentype abgeschnitten.
		intResult = c / b;
		System.out.println("intResult: " + intResult);

		// c) Ergebnis: 3; Wie bei b) werden die Nachkommastellen bei der Rechnung 5/6
		// abgeschnitten und es wird nur 0 übergeben und mit 3 addiert. Hier ist
		// ebenfalls wieder der int Datentyp der Grund für das Verhalten.
		intResult = a + b / c;
		System.out.println("intResult: " + intResult);

		// d) Ergebnis: 1; Der Datentyp double des Ergbnisse ist hier egal, da wir vor
		// der Zuweisung nur mit int Werten rechnen und dort
		// die Nachkommastellen ignoriert werden. Am Ende haben wir zwar einen double
		// Werte, aber vorher wurden bereits die Nachkommstalllen ignoriert.
		doubleResult = c / b;
		System.out.println("doubleResult: " + doubleResult);
		// Fix, Ergebnis: 1.2
		doubleResult = (double) c / b;
		System.out.println("doubleResult: " + doubleResult);

		// e) Ergebnis: 6; Ähnlicher Fall wie bei c). Der Datentyp double des Ergbnisses
		// ist hier egal, da wir vor der Zuweisung nur mit int Werten rechnen.
		doubleResult = c + a / b;
		System.out.println("doubleResult: " + doubleResult);
		// Fix, Ergbnis: 6.6
		doubleResult = c + (double) a / b;
		System.out.println("doubleResult: " + doubleResult);

		// f) Ergebnis: 13.0; Da hier mit double und int Werten gerechnet wird, erfolgt eine
		// implizite Typumwandlung des int Werts in double. Dadurch bleiben die
		// Nachkommsatellen erhalten.
		doubleResult = x + y * b;
		System.out.println("doubleResult: " + doubleResult);
	}

}
