package Pack4.Pack4;

public class Bus extends Vehicle {

	private int passangerCapacity;

	public Bus() {
		System.out.println("Creating Bus from default cons");
		passangerCapacity = 10;
	}

	public Bus(int pc) {
		System.out.println("Creating Bus from parameter cons");
		passangerCapacity = pc;
	}
//legit
	public Bus(Bus b) {
		System.out.println("Creating Bus from copy cons");
		setNumOfDoors(b.getNumOfDoors());
		setPrice(b.getPrice());
		passangerCapacity = b.passangerCapacity;

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

	@Override
	public String toString() {
		return "Bus has " + passangerCapacity + " capacity" + " and the price for bus is " + getPrice()
				+ "Also thsi bus has " + getNumOfDoors() + " Doors";
	}

}
