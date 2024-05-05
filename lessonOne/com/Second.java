package lessonOne.com;

import java.util.Scanner;

public class Second {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter angle: ");
		int angle = scan.nextInt();
		System.out.println("%: " + angle % 360);
		System.out.println("floorMod: " + Math.floorMod(angle, 360));
		}
}
