package Pack5;

public class Bus extends Vehicle {

	private int passangerCapacity;
	private long serialNum;//long is a long int
	private static long serialNumcnt = 2000;

	public Bus() {
		System.out.println("Creating Bus from default cons");
		passangerCapacity = 10;
		serialNum = serialNumcnt;
		serialNumcnt++;
	}

	public Bus(int pc) {
		System.out.println("Creating Bus from parameter cons");
		passangerCapacity = pc;
	}
//legit
	public Bus(Bus c) {
		System.out.println("Creating Bus from copy cons");
		setNumOfDoors(c.getNumOfDoors());
		setPrice(c.getPrice());
		passangerCapacity = c.passangerCapacity;

	}

	public Bus(int nd, double pr, int pc) {
		this(pc);
		System.out.println("Creating Bus from this  cons");
		setPrice(pr);
		setNumOfDoors(nd);

	}

	public int getPassangerCapacity() {
		return passangerCapacity;
	}

	public void setPassangerCapacity(int pc) {
		passangerCapacity = pc;
	}

	
	public double getPrice() {
		String s = "Bus";
		System.out.println("this comes from " + s + " Class");
		return price;
	}
	
	
	@Override
	public String toString() {
		return "Bus has " + passangerCapacity + " capacity" + " and the price for bus is " + getPrice()
				+ "Also thsi bus has " + getNumOfDoors() + " Doors";
	}
	public long getSerialNum() {
		return serialNum;
	}
	
	//clone== copy const and return the vehicle
		public Bus clone() {
			return new Bus(this);

}
}
