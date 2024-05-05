package lessonThree.com;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;



public class Fifth {
	static final Random rand = new Random();
	public static void main(String [] args) {
		Employee1 [] array = new Employee1[] {new Employee1(createName(), rand.nextDouble()), new Employee1(createName(), rand.nextDouble()),
				new Employee1(createName(), rand.nextDouble()), new Employee1(createName(), rand.nextDouble()), new Employee1(createName(), rand.nextDouble()),
				new Employee1(createName(), rand.nextDouble())};
		Employee1 [] array2 = new Employee1[] {new Employee1("denis", 1200.05),new Employee1("denis", 800.345),
				new Employee1("kristina", 3045.223),new Employee1("max", 5.34)};
		Employee1[] employees = {
	    
	            new Employee1("b", 2),
	            new Employee1("a", 2),
	            new Employee1("c", 1)
		};
		
		sortByName(employees);
		
	}
	public static void sortBySalary(Employee1 [] arrayOfEmployee) {
		Arrays.sort(arrayOfEmployee, Comparator.comparing(Employee1::getSalary).thenComparing(Employee1::getName));
		for(Employee1 e : arrayOfEmployee) System.out.printf("Salary:%.3f Name:%s\n", e.getSalary(), e.getName());
	}
	public static void sortByName(Employee1 [] arrayOfEmployee) {
		Arrays.sort(arrayOfEmployee, Comparator.comparing(Employee1::getName).thenComparing(Employee1::getSalary));
		for(Employee1 e : arrayOfEmployee) System.out.printf("Name:%s\\n Salary:%.3f \n", e.getName(), e.getSalary());
	}
	public static String createName() {
	    char [] arrayOfChar = new char [7];
	    for(int i = 0 ; i < 7; i++) arrayOfChar[i] = (char) rand.nextInt(65, 90);
		return String.copyValueOf(arrayOfChar);
	  
	}
	
}

class Employee1 {
	private String name;
	private double salary;
	Employee1(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	String getName() {return this.name;}
	double getSalary() {return this.salary;}
}
