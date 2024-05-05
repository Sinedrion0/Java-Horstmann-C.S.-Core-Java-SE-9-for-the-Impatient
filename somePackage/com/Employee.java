package somePackage.com;

public class Employee  {
	private String nameE;
	protected int salaryE;
	public Employee(String name, int salary) {
		this.nameE = name;
		this.salaryE = salary;
	}
	public static void main(String[] args) {
		
	}
	protected double getSalary (boolean task) {
		if(task == false)	return 0;
		else return this.salaryE;
	}
	public  String getName() {
		return this.nameE;
	}
	public void checkTheSalary() {
		if(salaryE < 1500) System.out.println("U'r poor");
		else System.out.println("U'r good");
	}
	
}
