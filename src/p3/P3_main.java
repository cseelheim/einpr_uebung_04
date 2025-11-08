package p3;

public class P3_main {

	public static void main(String[] args) {
		// a) Das Ergbnis ist immer false, da x und y nie gleichzzeitg geich und
		// ungleich sein können und wir durch das Ausrufezeichen das Ergebnis der
		// Klammer immer wieder negieren.
		expression_a(true, true);
		expression_a(true, false);
		expression_a(false, true);
		expression_a(false, false);

		// b) Das Ergbnis ist immer true, da wir x mit einem "oder wahr" verknüpft
		// haben.
		expression_b(true, true);
		expression_b(true, false);
		expression_b(false, true);
		expression_b(false, false);

		// c) Das Ergbnis ist nur true, wenn x auch rue ist, da wir x mit einem "und wahr"
		// verknüpft haben.
		expression_c(true, true);
		expression_c(true, false);
		expression_c(false, true);
		expression_c(false, false);

		// d)
		expression_d(true, true); // false
		expression_d(true, false); // true
		expression_d(false, true); // true
		expression_d(false, false); // true
	}

	// a)
	private static boolean expression_a(boolean x, boolean y) {
		boolean result = !(x != y && x == y);
		print_expression(x, y, result, "!(x!=y && x==y)");
		return result;
	}

	// b)
	private static boolean expression_b(boolean x, boolean y) {
		boolean result = x || true;
		print_expression(x, y, result, "x || true");
		return result;
	}

	// c)
	private static boolean expression_c(boolean x, boolean y) {
		boolean result = x && true;
		print_expression(x, y, result, "x && true)");
		return result;
	}

	// d)
	private static boolean expression_d(boolean x, boolean y) {
		boolean result = (x && !y) || (!x);
		print_expression(x, y, result, "(x && !y) || (!x)");
		return result;
	}

	private static void print_expression(boolean x, boolean y, boolean result, String expression) {
		System.out.println("Der Ausdruck " + expression + " ergibt für x = " + x + " und y = " + y + " das Ergbnis "
				+ result + ".");
	}

}
