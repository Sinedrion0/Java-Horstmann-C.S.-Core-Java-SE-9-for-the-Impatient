package lessonThree.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class Eight {
	private static Random rand = new Random();
	private static int countOfAll = 0;
	public static void main(String [] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 10; i > 0; i--) list.add(rand.nextInt(100));
		Collections.shuffle(list);
		list.forEach((x)-> System.out.println(x));
		
		luckySort(list, (x,y)-> Integer.compare(x, y));
		System.out.println(" ");
		list.forEach((x)-> System.out.println(x));
		System.out.println("\n" + countOfAll);
	}
	public static void luckySort(ArrayList<Integer> list, Comparator<Integer> comparator) {
		while(!isSorted(list, comparator)) {
			Collections.shuffle(list);
			System.out.println(" ");
			list.forEach((x)-> System.out.println(x));
			countOfAll++;
		}
	}
	public static boolean isSorted(ArrayList<Integer> list, Comparator<Integer> comparator) {
		for(int i = 0; i < list.size()-1; i++) {
			if (comparator.compare(list.get(i), list.get(i+1)) > 0) {
				return false;
			}
		}
		return true;
	}
}

