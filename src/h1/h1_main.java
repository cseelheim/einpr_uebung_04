package h1;

public class h1_main {

	public static void main(String[] args) {
		int zone = 4;
		double price = 46.9;

		price = 0.0;
		switch (zone) {
		case 5:
			price += 0.7;
		case 4:
		case 3:
			price += 0.5;
		case 2:
			price += 0.35;
		case 1:
			price += 2.00;
			break;
		default:
			price = 4.00;
			break;
		}

		System.out.println("Fahrkartenpreis: " + price + "€");

	}

}
