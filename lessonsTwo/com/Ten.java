package lessonsTwo.com;

import java.util.ArrayList;
import java.util.Random;



public class Ten {
	private static Random random = new Random();
	public static int range (int low, int high) {
		return low + random.nextInt(high - low + 1);
	}
	public int getArray(int array[], int low, int high) {
		try {
		if(array.length == 0) {System.out.println("Array is empty \n");}
		return array [Ten.range(low, high)];
		}
		catch(IndexOutOfBoundsException e) {System.out.println("Array is empty"); return 0;}
	}
	public static int getArrayList(ArrayList<Integer> list, int low, int high) {
		try { 
		return list.get(Ten.range(low, high));
	}
		catch (IndexOutOfBoundsException e) {System.out.println("ArrayList is empty"); return 0;}
	}
	
	public static void main (String [] args) {
	int array [] = new int [] {};
	//ArrayList<Integer> list =  new ArrayList<Integer>();
//	for(int i = 0; i < 30; i++) {list.add(i);}
//	for(int i = 0; i < 20; i++) {
	System.out.println(new Ten().getArray(array, 0, 29));
	}
}
