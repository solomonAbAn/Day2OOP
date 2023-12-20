package Pack1;

public class Vehicle {

	private String brand;
	private double speed;
	private int numOfDoors;
	private double price;
	
	public Vehicle() {
		brand = "default";
		speed = 100;
		numOfDoors = 1;
		price = 0;
		
	}
	
	public Vehicle(String bd, double sp, int nd, double pr) {
		this.brand = bd;
		this.speed = sp;
		this.numOfDoors = nd;
		this.price = pr;
		
	}
	
	
	public Vehicle(Vehicle vec) {
		brand = vec.brand;
		speed = vec.speed;
		numOfDoors = vec.numOfDoors;
		price = vec.price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getNumOfDoors() {
		return numOfDoors;
	}

	public void setNumOfDoors(int numOfDoors) {
		this.numOfDoors = numOfDoors;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Vehicle [brand=" + brand + ", speed=" + speed + ", numOfDoors=" + numOfDoors + ", price=" + price + "]";
	}
	
	
	
	
}
