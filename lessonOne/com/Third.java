package lessonOne.com;

import java.util.Random;

public class Third {
	public static void main (String [] args) {
		int [] numbers = new int [] {new Random().nextInt(500), new Random().nextInt(500) , new Random().nextInt(500)};
		System.out.println(max(numbers)+ "\n");
		System.out.println(max(numbers));
	}
	public static int max (int [] array) {
		for(int a : array) System.out.print(Integer.toString(a) + " ");
		System.out.println("");
		return (array[0] > array[1]?
			   (array[0] > array[2]? array[0]:array[2]) : (array[1] > array[2]? array[1]:array[2]));
	}
	public static int mathMax (int [] array) {
		for(int a : array) System.out.print(Integer.toString(a) + " ");
		System.out.println("");
		return Math.max(array[0], Math.max(array[1], array[2]));
	}
}

////257 123 495 
////257
