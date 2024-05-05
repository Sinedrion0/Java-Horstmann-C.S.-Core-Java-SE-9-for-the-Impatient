package lessonThree.com;

import java.util.Random;

public class First {
	
	private static int count = 0;
	private static double allSalary = 0;
	static Random rand = new Random();
	
	public static void main(String [] args) {
		Employee [] arrayOfEmployees = new Employee [50];
		for(int i = 0 ; i < 50; i++) {
			arrayOfEmployees[i] = new Employee(rand.nextDouble(3500), Employee.giveName());
			System.out.printf("%.3f %s\n",arrayOfEmployees[i].getMeasurable(),
					arrayOfEmployees[i].getName() );
		}
		System.out.println(Measurable.average(arrayOfEmployees));
		System.out.println("Largest salary has " + ((Employee)Measurable.largest(arrayOfEmployees)).getName());
		System.out.printf("Largest salary is %.3f", Employee.getLargestSalary(arrayOfEmployees));
	}
}


class Employee implements Measurable {
	@Override
	public String toString() {
		return "Employee [name " + name + "]";
	}

	private final double salary;
	private final String name;
	private static String [] arrayOfName = new String [] {"Denis", "Igor", "Mikola", "Stas"
			, "Dasha" , "Masha", "Ulya", "Olesya"};
	Employee (double salary, String name){
		this.salary = salary;
		this.name = name;
	}
	@Override
	public double getMeasurable() {
		return this.salary;
	}
	public String getName() {
		return this.name;
	};
	
	public static double getLargestSalary(Measurable [] m) {
		Measurable largest = Measurable.largest(m);
		Employee largestEmployee = (Employee)largest;
		return largestEmployee.getMeasurable();
	}
	
	public static String giveName() {
		Random rand2 = new Random();
		return arrayOfName[rand2.nextInt(8)];
		
		}
	}
	

interface Measurable {
	double getMeasurable();
	
	 static double average (Measurable e []) {
		double allSalary = 0;
		for(Measurable m : e) {
			allSalary += m.getMeasurable();
		}
		return allSalary / e.length;
	}
	 static Measurable largest(Measurable[] e) {
		 Measurable largest = e[0];
		 for(Measurable unit : e) {
			if (unit.getMeasurable() > largest.getMeasurable()) {
				largest = unit;
			}
		 }
		 return largest;
	 }
}




