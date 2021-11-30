package practica_22;

import java.util.Random;

public class Activity1 {

	public static void main(String[] args) {
		int dado;
		int number = 0;
		Random random = new Random();

		while (number <= 20) {

			dado = random.nextInt(6) + 1;
			System.out.println("The dice number is " + dado);
			number = number + 1;

		}

	}

}
