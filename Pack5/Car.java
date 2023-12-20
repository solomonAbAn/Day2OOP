package Pack5;

public class Car extends Vehicle{
	
	private int numOfSeats;
	private long serialNum;//long is a long int
	private static long serialNumcnt = 2000;
	
	public Car() {
		System.out.println("Creating Car from default cons");
		numOfSeats = 5;
		serialNum = serialNumcnt;
		serialNumcnt++;
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

	public double getPrice() {
		String s = "Car";
		System.out.println("this comes from " + s + " Class");
		return price;
	}
	
	
	@Override
	public String toString() {
		return "Car has" + numOfSeats
				+ " seats and the price for Car is " + getPrice()
				+ "Also this Car has " + getNumOfDoors() + " Doors";
	}
	
	public long getSerialNum() {
		return serialNum;
	}
	//clone== copy const and return the vehicle
			public Car clone() {
				return new Car(this);

	}
}
