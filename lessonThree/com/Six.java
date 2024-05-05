package lessonThree.com;

import java.math.BigInteger;

public class Six {
	 public static void main(String[] args) {
		 average(new SquareSequence(), 15);
	 }
	 public static void average(Sequence <BigInteger> s, int n) {
		 int count = 0;
		 while(s.hasNex() && count < n) {
			 count++;
			 System.out.println(s.next());
		 }
	 }
	 
}

interface Sequence <T> {
	default boolean hasNex() {return true;}
	T next();
	static Sequence<BigInteger> create(){
		return () -> {
			BigInteger a = BigInteger.valueOf(0);
			BigInteger b = a.add(BigInteger.valueOf(1));
			BigInteger c = b.multiply(b);
			return c;
		};
	}
}



class SquareSequence implements Sequence<BigInteger>{
	BigInteger a = BigInteger.valueOf(0);
	@Override
	public BigInteger next() {
		a = a.add(BigInteger.valueOf(1));
		a = a.multiply(a);
		return a;
	}}




