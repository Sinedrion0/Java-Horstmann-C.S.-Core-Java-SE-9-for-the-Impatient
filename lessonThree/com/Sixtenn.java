package lessonThree.com;

import java.util.Random;

public class Sixtenn {
	
	private static final Random generator = new Random();
	
	public static void main(String [] args) {
		cycle(randomInts(10,50), 10);
	}
	
	public static Sequence1 randomInts(int low, int high) {
		Sixtenn.RandomSequence ras = new Sixtenn().new RandomSequence(low,high);
			 return ras;
	
	}
	public static void cycle(Sequence1 rsm, int count) {
		int lol = 0;
		while(rsm.hasNext() && lol < count) {System.out.println(rsm.next()); lol++;}
	}

	class RandomSequence implements Sequence1{
		@Override
		public String toString() {
			return "RandomSequence [low=" + low + ", high=" + high + "]";
		}
		int low;
		int high;
		RandomSequence(int low, int high){
			this.low = low;
			this.high = high;
		}
		@Override
		public int next() {
			return low + generator.nextInt(high - low + 1);
		}
		@Override
		public boolean hasNext() {
			return true;
		}}
}


interface Sequence1 {
	boolean hasNext();
	int next();
}