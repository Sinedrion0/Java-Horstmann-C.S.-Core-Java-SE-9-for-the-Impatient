package lessonsTwo.com;

public class Four {
	 public static void main(String[] args) {
		 Other other1 = new Other(120);
		 Other other2 = new Other(270);
		 swap(other1, other2);
		 System.out.println("\no1: " + other1.getter() + " o2: "+ other2.getter());
		 Integer a1 = new Integer(560);
		 Integer a2 = new Integer(870);
		 swapInt(a1,a2);
		 System.out.println("\n i1:" + a1 + " i2: " + a2);
	 }
	 public static void swap (Other o1, Other o2) {
		 int temp = o1.getter();
		 o1.setter(o2.getter());
		 o2.setter(temp);
		 System.out.println("o1: " + o1.getter() + " o2: "+ o2.getter());
	 }
	 public static void swapInt (Integer i1, Integer i2) {
		 int temp = i1;
		 i1 = i2;
		 i2 = temp;
		 System.out.println("i1: " + i1 + " i2: " + i2);
	 }
	}

class  Other {
	private int value;
	Other (){value = 0;}
	Other (int value){this.value = value;}
	public void setter (int value) {this.value = value;}
	public int getter () {return value;}
	@Override
	public String toString() {
		return Integer.toString(value);
	}
}
