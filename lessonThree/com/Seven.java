package lessonThree.com;

import java.util.Iterator;

public class Seven {
	 public static void main(String[] args) {
		 printing(new DigitSequence(1783));
	 }
	 public static void printing(Iterator<Integer> it) {
		 while(it.hasNext()) {System.out.println(it.next());}
	 }
}


 class DigitSequence implements Iterator<Integer> {
	 private int number;
	 public DigitSequence(int n) {
	 number = n;
	 }
	 public boolean hasNext() {
	 return number != 0;
	 }
	 public Integer next() {
	 int result = number % 10;
	 number /= 10;
	 return result;
	 }
	 public int rest() {
	 return number;
	 }
	}
