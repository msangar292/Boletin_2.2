package practica_22;

import java.util.Scanner;

public class Activity4 {

    public static void main(String[] args) {

        @SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
        int num1, i;

        System.out.println("Introduzca un número: ");
        do {
            num1 = keyboard.nextInt();
        } while (num1 >= 0 && num1 >= 10);

        for (i = 0; i <= 10; i++) {
            System.out.println(num1 * i);

        }
    }

}