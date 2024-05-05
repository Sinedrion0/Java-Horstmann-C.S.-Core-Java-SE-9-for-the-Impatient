package lessonOne.com;

import java.util.Scanner;

public class Eleven {
	 public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Write ur line: ");
		 String line = scan.nextLine();
		 
		 for(int i = 0; i < line.length(); i++) {
			int codePoint = line.codePointAt(i);
			if(codePoint > 126 || codePoint < 32) {
				System.out.println("Symbol: " + line.substring(i, i+1) + " codePint: " + codePoint);}
		 }
	 }
}
