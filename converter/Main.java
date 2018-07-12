package converter;

import java.util.Scanner;

public class Main {
	private double pound = 0.89;
	private double dolar = 1.17;
	private double yen = 131.33;
	private double ruble = 72.54;
	private Scanner keyboard = new Scanner(System.in);

	Main() {
		converter();
	}

	private void converter() {
		double eur;
		double total;
		int num;
		String resp;

		do {
			System.out.println("Put euros to convert.");
			eur = keyboard.nextDouble();

			System.out.println("¿Which wanna convert?");
			System.out.println("1.  Eur. to pound");
			System.out.println("2.  Eur. to dolar.");
			System.out.println("3.  Eur. to yen.");
			System.out.println("4.  Eur. to ruble.");
			num = keyboard.nextInt();

			switch (num) {
			case 1:
				total = eur * pound;
				System.out.println(eur + " Euros are " + total + " Pounds.");
				break;
			case 2:
				total = eur * dolar;
				System.out.println(eur + " Euros are " + total + " Dolars.");
				break;
			case 3:
				total = eur * yen;
				System.out.println(eur + " Euros are " + total + " Yen.");
				break;
			case 4:
				total = eur * ruble;
				System.out.println(eur + " Euros are " + total + " Rubles.");
				break;

			}

			System.out.println("Do you wanna convert more? (Yes/No)");
			resp = keyboard.next();

		} while (!resp.equalsIgnoreCase("no"));
	}

	public static void main(String[] args) {
		Main Interface = new Main();

	}

}
