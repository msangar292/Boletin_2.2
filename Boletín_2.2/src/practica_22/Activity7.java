package practica_22;

import java.util.Scanner;

public class Activity7 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Introduce dos numeros: ");
		int n1 = keyboard.nextInt();
		int n2 = keyboard.nextInt();
		int par = 0;
		int impar = 0;
		
		do {
			if (n2%2 == 0 ) {
				par += n2;
			} else {
				impar += n2;
				
			}
			n2--;
		}while (n1 <= n2 );
		System.out.println("La suma de numeros pares es: " + par);
		System.out.println("la suma de numeros impares es: " + impar);
		
		}

	}


