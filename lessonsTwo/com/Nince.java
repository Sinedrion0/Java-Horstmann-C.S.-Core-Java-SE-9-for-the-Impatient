package lessonsTwo.com;

public class Nince {
	
	private double maxFuelLevel = 100;
	private double fuelLevel = maxFuelLevel;
	private double way = 0;
	double fuelEfficiency;
	
	 Nince(){this.fuelEfficiency = 1;}
	Nince(double fuelEfficiency){
		this.fuelEfficiency = fuelEfficiency;
	}
	
	public void drive (double miles) {
		 way += miles;
		 fuelLevel -= (miles * fuelEfficiency);
	}
	
	public void tankUp (double gallons) {
		fuelLevel += gallons;
	}
	
	public double milesPassed () {
		return way;
	}
	
	public double levelOfFuel() {
		return fuelLevel;
	}
	
	public static void main(String [] args) {
		Nince car = new Nince();
		car.drive(130.4);
		car.tankUp(190);
		System.out.printf("milesPassed: %.1f \nlevelOfFuel: %.1f", car.milesPassed(), car.levelOfFuel());
	}
}
