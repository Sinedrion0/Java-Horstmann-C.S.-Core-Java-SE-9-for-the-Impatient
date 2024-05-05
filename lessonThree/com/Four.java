package lessonThree.com;

public class Four {
	public static void main(String [] args) {
		IntSequence.of(1,2,3,4,5,6);
		IntSequence.prtinting(IntSequence.constant(100));
	}
}


interface IntSequence {
	default boolean hasNext() {return true;}
	int next();
	static void of(int... array) {prtinting(helper(array));}
	
	static void prtinting(IntSequence n) {
		while(n.hasNext()) {System.out.println(n.next());}
	}
	
	static IntSequence constant (int consta) {
		return () -> {
		return consta;};
	}
	private static IntSequence helper (int... numebers) {
		return new IntSequence() {
			// int i = 0;
			 int count = 0;
			@Override
			public boolean hasNext() {
				//boolean result = false;
				//if(count-- != 0) result = true;
				return count < numebers.length;
				
			}
			@Override
			public int next() {
				count++;
				return numebers[count - 1];
			}
		};
	}
}





