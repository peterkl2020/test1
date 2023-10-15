package test1;
import java.util.Scanner;

public class division {

public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Enter the third integer: ");
        int num3 = scanner.nextInt();

        int sum = num1 + num2 + num3;

        System.out.println("The sum of " + num1 + " and " + num2 + " and " + num3 + " is: " + sum);

        scanner.close();

	}

}
