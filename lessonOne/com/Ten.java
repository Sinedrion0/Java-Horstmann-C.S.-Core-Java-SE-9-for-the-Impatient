package lessonOne.com;

import java.util.Random;

public class Ten {
	public static void main(String [] args) {
		
	char [] letters = new char []{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
					'K', 'L','M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y','Z',
									'0','1','2','3','4','5','6','7','8','9'};
	//int [] numbers = new int[] {'0','1','2','3','4','5','6','7','8','9'};
	
	String result = "";
	for(int i = 0; i < 10; i++) {
		result += Character.toString(letters[new Random().nextInt(36)]);
	}
	System.out.println("In base 36: " + result);
	try { 
	System.out.println("In base 10: " + Long.parseLong(result, 36));
		}
	catch(NumberFormatException n) {
		
		}
	}
}
