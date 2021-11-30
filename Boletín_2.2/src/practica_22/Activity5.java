package practica_22;

import java.util.Scanner;

public class Activity5 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
        System.out.println("Introduce numeros");
        int num1= keyboard.nextInt();
        int num2= keyboard.nextInt();


        int j= num2;

        for(int i=num1;i<j;) {
            j/=2;
            i*=2;
            System.out.printf("%d %d \n", i, j);
}
	}
}