package lessonOne.com;

import java.util.Scanner;

public class Eight {
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 System.out.print("Write sentences: ");
		 String sentence = scan.nextLine();
		 String array [] = sentence.split(" ");
		 for(String s : array) System.out.println(s);
    }
}
