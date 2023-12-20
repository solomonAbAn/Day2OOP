package Pack4.Pack4;

public class Vehicle {
	protected int numOfDoors;
	private double price;

	public Vehicle() {
		System.out.println("Creating vehicle from default cons");
		numOfDoors = 4;
		price = 10000;
	}

	public Vehicle(int nd, double pr) {
		System.out.println("Creating vehicle from parameter cons");
		numOfDoors = nd;
		price = pr;
	}
	
	public Vehicle(Vehicle v) {
		System.out.println("Creating vehicle from copy cons");
		numOfDoors = v.numOfDoors;
		price = v.price;
	}

	public int getNumOfDoors() {
		return numOfDoors;
	}

	final public void setNumOfDoors(int nd) {
		numOfDoors = nd;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double pr) {
		price = pr;
		
	}

	public void showinfo() {
		System.out.println("numOfDoors=" + numOfDoors + ", price=" + price + "]");
	}
	
	@Override
	public String toString() {
		return "Vehicle [numOfDoors=" + numOfDoors + ", price=" + price + "]";
	}
}
