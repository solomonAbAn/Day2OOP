package Pack5;

public class RaceCar extends SportCar{
	
	private int hoursepower;
	private long serialNum;//long is a long int
	private static long serialNumcnt = 2000;
	
	public RaceCar() {
		System.out.println("Creating raceCar from default cons");
		hoursepower = 400;
		serialNum = serialNumcnt;
		serialNumcnt++;
	}
	
	public RaceCar(int nd, double pr, int ns,double gs,int hp) {
		super(nd,pr,ns,gs);
		System.out.println("Creating raceCar from super cons");
		hoursepower = hp;
	}

	public RaceCar(RaceCar rc) {
		System.out.println("Creating race Car from copy cons");
		setNumOfDoors(rc.getNumOfDoors());
		setPrice(rc.getPrice());
		setNumOfSeats(rc.getNumOfSeats());
		setGasconsuption(rc.getGasconsuption());
		hoursepower = rc.hoursepower;
	}
	
	public int getHoursepower() {
		return hoursepower;
	}

	public void setHoursepower(int hp) {
		hoursepower = hp;
	}
	public double getPrice() {
		String s = "Race Car";
		System.out.println("this comes from " + s + " Class");
		return price;
	}
	@Override
	public String toString() {
		return "Car has" + getNumOfSeats()
				+ " seats and the price for Car is " + getPrice()
				+ " Also this Car has " + getNumOfDoors() + " Doors"
				+"  the gas consuption is " + getGasconsuption()
				+ " the hourse power is   :  " + hoursepower;
	}
	
	public long getSerialNum() {
		return serialNum;
	}
	//clone== copy const and return the vehicle
	public RaceCar clone() {
		return new RaceCar(this);

}

}
