package somePackage.com;

public class Outher  {
	
	 public static void main(String[] args){
		 Employee em = new Employee2(100.015d);
		 System.out.println(em.getId());
		 Employee em1 = new Employee2(100.001d);
		 System.out.println(em1.getId());
		 Employee em2 = new Employee2(200.003d);
		 System.out.println(em2.getId());
		 
		 System.out.println(em.compareTo(em1));
		 System.out.println(em.compareTo(em2));
		 System.out.println(em2.compareTo(em));
	}
}
 class Employee2 implements Identified, Comparable<Employee> {
	private int id;
	private static int mainId = 0;
	private double salary;
	 Employee2(double salary){
		 this.salary = salary;
		 id = mainId++;
	 }
	 public int getId() { 
		 return id;
		 }
	 //Integer.compare(this.getId(), other.getId())
	@Override
	public int compareTo(Employee2 other) {
		return  Double.compare(this.salary, other.salary);
	}
 }
	 interface Identified {
		 default int getId() {
		 return Math.abs(hashCode());
			 } 
		}
