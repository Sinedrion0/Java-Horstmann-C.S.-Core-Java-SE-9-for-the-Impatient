package lessonOne.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Thirteen {
	 @SuppressWarnings("removal")
	public static void main(String[] args) {

		 int [] combination = new int [6];
		 boolean iteration = false;
		 int count = 0;

		 ArrayList <Integer> list = new ArrayList<Integer>(50);
		 for(int i = 1; i <= 49; i++) list.add(i);
		 
		 while(iteration == false) {
			 
			 int random = new Random().nextInt(list.size()-1);
			 combination [count++] = list.remove(random);
			 if(count == 6) iteration = true;
		 }
		 
		 Arrays.sort(combination);
		 for(int j : combination) System.out.print(Integer.toString(j) + " ");
	 }
}
