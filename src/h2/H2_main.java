package h2;

public class H2_main {

	public static void main(String[] args) {
		boolean x = false, y = false, a = false, b = false, c = false;
		int input = 11;

		x = false;
		if (input == 10 || input == 11) {
			x = true;
		}

		y = false;
		if (input == 1 || input == 11) {
			y = true;
		}

		boolean e1 = x == true;
		boolean e2 = y == true;
		boolean e3 = x == y;

		if (e1 && e2) {
			a = true;
		}

		if (e1 || e3) {
			b = true;
		}

		if (x && y) {
			c = false;
		} else if (x && !y) {
			c = true;
		} else if (!x && y) {
			c = false;
		} else if (!x && !y) {
			c = true;
		}

		System.out.println("input: " + input);
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
	}

}
