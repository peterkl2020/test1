package test1;

import java.util.Scanner;

public class calculations {

	  public static void main(String[] args) {
			
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the first integer: ");
	        int num1 = scanner.nextInt();

	        System.out.print("Enter the second integer: ");
	        int num2 = scanner.nextInt();

	        int difference = num1 - num2;

	        System.out.println("The difference between " + num1 + " and " + num2 + " is: " + difference);

	        scanner.close();
	}

}
