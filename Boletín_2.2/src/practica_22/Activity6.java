package practica_22;

import java.util.Scanner;

public class Activity6 {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		int sobresaliente = 0, notable = 0, bien = 0, aprobado = 0, insuficiente = 0, muy_deficiente = 0;

		String respuesta = "s";

		do {
			System.out.println("Introduce notas: ");
			int nota = keyboard.nextInt();

			if (nota >= 8 && nota <= 10) {
				sobresaliente++;
			} else if (nota >= 7 && nota <= 8) {
				notable++;
			} else if (nota >= 7 && nota <= 8) {
				notable++;
			} else if (nota == 6) {
				bien++;
			} else if (nota == 5) {
				aprobado++;
			} else if (nota <= 4 && nota >= 3) {
				insuficiente++;
			} else if (nota >= 2 && nota <= 0) {
				muy_deficiente++;
			}
			System.out.println("Quieres introducir mas notas: (s/n)");
			respuesta = keyboard.next();

		} while (respuesta.equalsIgnoreCase("s"));

		System.out.printf("Sobresalientes: %d \nNotables: %d \nbien: %d \naprobados: %d \ninsuficientes: %d \nmuy deficientes: %d \n", sobresaliente, notable, bien, aprobado, insuficiente, muy_deficiente );

	}

}


