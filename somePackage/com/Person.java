package somePackage.com;

public abstract class Person {
	private String name;
	public Person(String name){this.name = name;}
	public final String getName() {return name;}
	public abstract int getId();
}
