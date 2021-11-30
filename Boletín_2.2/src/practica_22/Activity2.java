package practica_22;

import java.util.Random;

public class Activity2 {

	public static void main(String[] args) {

		Random random = new Random();

		int number = 0;
		boolean exit = false;

		do {
			number = random.nextInt(900) + 1;

			System.out.println(number);
			exit = (number % 9 == 0);
		} while (!exit);
		System.out.println("el ultimo numero es multiplo");

	}
}
