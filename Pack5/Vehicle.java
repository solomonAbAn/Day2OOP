package Pack5;

public class Vehicle {
	protected int numOfDoors;
	protected double price;
	private long serialNum;//long is a long int
	private static long serialNumcnt = 1000; //static because it is not an attribute

	public Vehicle() {//default
		System.out.println("Creating vehicle from default cons");
		numOfDoors = 4;
		price = 10000;
		serialNum = serialNumcnt;
		serialNumcnt++;
	}

	public Vehicle(int nd, double pr) {
		System.out.println("Creating vehicle from parameter cons");
		this.numOfDoors = nd;
		this.price = pr;
		serialNum = serialNumcnt;
		serialNumcnt++;
	}
	
	public Vehicle(Vehicle c) {
		System.out.println("Creating vehicle from copy cons");
		numOfDoors = c.numOfDoors;
		price = c.price;
		serialNum = serialNumcnt;
		serialNumcnt++;
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
	
	public boolean isCheaper(Vehicle v) {
		String s1 = "Vehicle class";
		String s2 = v.getClass().toString();
		
		if(getPrice()<v.getPrice()) {
			System.out.println("the price of " + s1  + " is cheaper than " + s2);
			return true;
		}else {
			System.out.println("the price of " + s2  + " is cheaper than " + s1);
			return false;
		}
	}
	
	
	
	public long getSerialNum() {
		return serialNum;
	}
	
	
	//clone== copy const and return the vehicle
	public Vehicle clone() {
		return new Vehicle(this);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
