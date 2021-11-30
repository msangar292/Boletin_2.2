package practica_22;

import java.util.Scanner;

public class Activity3 {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		int suma = 0;
		
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("escribe primer numero:");
		num1 = keyboard.nextInt();
		System.out.println("escribe segundo numero: ");
		num2 = keyboard.nextInt();
		
	do {
		
		suma = suma + num1;
		num2--;
	} while (num2!=0);
			
			System.out.println("el producto es: " + suma);
		
	}

}
