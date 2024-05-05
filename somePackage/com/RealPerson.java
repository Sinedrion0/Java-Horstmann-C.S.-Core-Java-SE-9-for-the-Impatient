package somePackage.com;

public class RealPerson extends Person{
	private int id;
	public RealPerson(String name, int id) {
		super(name);
		this.id = id;
	}

	@Override
	public int getId() {
		return id;
	}

}
