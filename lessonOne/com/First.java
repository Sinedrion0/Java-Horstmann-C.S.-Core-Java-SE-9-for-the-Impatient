package lessonOne.com;

import java.util.Scanner;

public class First {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Write ur decimal number: ");
		int number = scan.nextInt();
		System.out.println(Integer.toString(number,2));
		System.out.println(Integer.toString(number,8));
		System.out.println(Integer.toString(number,16));
		System.out.println("Write ur floating number: ");
		double fraction = scan.nextDouble();
		System.out.println(Double.toHexString(fraction));
		
	}
}
