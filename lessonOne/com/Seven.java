package lessonOne.com;

import java.util.Scanner;

public class Seven {
	public static void main (String [] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first integer:");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second integer:");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        int diff = num1 - num2;
        int product = num1 * num2;
        int quotient = Integer.divideUnsigned(num1, num2);
        int remainder = Integer.remainderUnsigned(num1, num2);

        System.out.println("Unsigned sum: " + Integer.toUnsignedLong(sum));
        System.out.println("Unsigned difference: " + Integer.toUnsignedLong(diff));
        System.out.println("Unsigned product: " + Integer.toUnsignedLong(product));
        System.out.println("Unsigned quotient: " + Integer.toUnsignedLong(quotient));
        System.out.println("Unsigned remainder: " + Integer.toUnsignedLong(remainder));
        System.out.println(Integer.MAX_VALUE);
	}
}
