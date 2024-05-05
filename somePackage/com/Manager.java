package somePackage.com;

public class Manager extends Employee{
	private static double bouns;
	private String name;
	private int salary;
	public Manager(String name, int salary) {
		super(name,salary);
		this.name = name;
		this.salary = salary;
	}
	
	public static void main(String[] args) {
		Employee empl = new Manager("Name", 128);
		Object onj = new Object();
	}
	public double setSalary(double bouns) {
		return bouns * 3500.054;
	}
	@Override
	protected double getSalary (boolean task) {
		return super.getSalary(task) + bouns;
	}	
	/*
	@Override
	public String getName() {
		return this.name;
	}
	*/
}
