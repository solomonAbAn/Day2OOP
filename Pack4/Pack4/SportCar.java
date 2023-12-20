package Pack4.Pack4;

public class SportCar extends Car{
	
	private double gasconsuption;
	
	public SportCar() {
		System.out.println("Creating sport Car from default cons");
		gasconsuption = 4;
	}
	
	public SportCar(int nd, double pr, int ns,double gs) {
		super(nd,pr,ns);
		System.out.println("Creating Sport Car from super cons");
		gasconsuption = gs;
	}

	public double getGasconsuption() {
		return gasconsuption;
	}

	public void setGasconsuption(double gs) {
		gasconsuption = gs;
	}
	
	
	@Override
	public String toString() {
		return "Car has" + getNumOfSeats()
				+ " seats and the price for Car is " + getPrice()
				+ "Also this Car has " + getNumOfDoors() + " Doors"
				+" the gas consuption is " + gasconsuption;
	}
	
	
}
