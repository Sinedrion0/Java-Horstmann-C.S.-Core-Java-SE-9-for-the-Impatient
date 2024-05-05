package lessonOne.com;

import java.math.BigInteger;

public class Six {
	public static void main (String [] args) {
		System.out.println(fuck(1000));
	}
	public static BigInteger fuck (int a) {
		BigInteger count = BigInteger.ONE;
			for(int j = 1; j <= a; j++) {
				count = count.multiply(BigInteger.valueOf(j));
			}
			return count;
		}
	}

