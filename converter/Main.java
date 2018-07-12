package converter;

import java.util.Scanner;

public class Main {
	private double pound = 0.89;
	private double dolar = 1.17;
	private double yen = 131.33;
	private Scanner keyboard = new Scanner(System.in);

	Main() {
		converter();
	}

	private void converter() {
		double eur;
		double result;
		int num;
		String resp;
		
		do {
			System.out.println("Put euros to convert.");
			eur = keyboard.nextDouble();

			System.out.println("¿Which wanna convert?");
			System.out.println("1.  Eur. to pound");
			System.out.println("2.  Eur. to dolar.");
			System.out.println("3.  Eur. to yen.");
			num = keyboard.nextInt();

			if (num == 1) {
				result = eur * pound;
				System.out.println(eur + " Euros are " + result + " Pounds.");

			} else if (num == 2) {
				result = eur * dolar;
				System.out.println(eur + " Euros are " + result + " Dolars.");

			} else if (num == 3) {
				result = eur * yen;
				System.out.println(eur + " Euros are " + result + " Yen.");
			}
			System.out.println("Do you wanna convert more? (Yes/No)");
			resp = keyboard.next();
			
		} while (!resp.equalsIgnoreCase("no"));
	}

	public static void main(String[] args) {
		Main Interface = new Main();

	}

}
