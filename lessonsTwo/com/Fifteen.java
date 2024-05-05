package lessonsTwo.com;

import java.util.ArrayList;

public class Fifteen {
	
	ArrayList<Man> list = new ArrayList<Man>();
	
	private class Man {
		@Override
		public String toString() {
			return "Man [name=" + name + ", weight=" + weight + ", height=" + height + "]";
		}
		String name;
		int weight;
		int height;
	}
	public void measure (String name, int weight, int height) {
		Man man = new Man();
		man.name = name;
		man.weight = weight;
		man.height = height;
		list.add(man);
		}
	
	public static void main(String [] args) {
		Fifteen fith = new Fifteen();
		fith.measure("Denis", 85, 180);
		System.out.println(fith.list.get(0));
	}
}
