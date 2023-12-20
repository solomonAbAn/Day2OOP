package Pack4.Pack4;

public class Car extends Vehicle{
	
	private int numOfSeats;
	
	public Car() {
		System.out.println("Creating Car from default cons");
		numOfSeats = 5;
	}
	
	public Car(int nd, double pr, int ns) {
		super(nd,pr);
		System.out.println("Creating Car from super cons");
		numOfSeats = ns;
	}

	public Car(Car c) {
		System.out.println("Creating Car from Copy cons");
		setNumOfDoors(c.getNumOfDoors());
		setPrice(c.getPrice());
		numOfSeats = c.numOfSeats;
		
	}

	public int getNumOfSeats() {
		return numOfSeats;
	}

	public void setNumOfSeats(int ns) {
		numOfSeats = ns;
	}

	@Override
	public String toString() {
		return "Car has" + numOfSeats
				+ " seats and the price for Car is " + getPrice()
				+ "Also this Car has " + getNumOfDoors() + " Doors";
	}
}
