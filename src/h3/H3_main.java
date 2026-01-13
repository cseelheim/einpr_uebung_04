package h3;

public class H3_main {

	public static void main(String[] args) {
		float celsiusFloat = -13.5f, fahrenheitFloat = 0.0f;
		double celsiusDouble = -13.5, fahrenheitDouble = 0.0;

		fahrenheitFloat = celsiusFloat * (9f / 5f) + 32;
		fahrenheitDouble = celsiusDouble * (9d / 5d) + 32;

//		System.out.println("Celsius (float): " + celsiusFloat);
//		System.out.println("Fahrenheit (float): " + fahrenheitFloat);
//		System.out.println("Celsius (double): " + celsiusDouble);
//		System.out.println("Fahrenheit (double): " + fahrenheitDouble);
	}

}
