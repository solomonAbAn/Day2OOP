package Pack5;

public class SportCar extends Car{
	
	private double gasconsuption;
	private long serialNum;//long is a long int
	private static long serialNumcnt = 2000;
	
	public SportCar() {
		System.out.println("Creating sport Car from default cons");
		gasconsuption = 4;
		serialNum = serialNumcnt;
		serialNumcnt++;
	}
	
	public SportCar(int nd, double pr, int ns,double gs) {
		super(nd,pr,ns);
		System.out.println("Creating Sport Car from super cons");
		gasconsuption = gs;
	}
//	
//	public SportCar(SportCar sp) {
//		System.out.println("Creating race Car from copy cons");
//	
//	}
	
	

	public double getGasconsuption() {
		return gasconsuption;
	}

	public void setGasconsuption(double gs) {
		gasconsuption = gs;
	}
	
	public double getPrice() {
		String s = "Sport Car";
		System.out.println("this comes from " + s + " Class");
		return price;
	}
	@Override
	public String toString() {
		return "Car has" + getNumOfSeats()
				+ " seats and the price for Car is " + getPrice()
				+ "Also this Car has " + getNumOfDoors() + " Doors"
				+" the gas consuption is " + gasconsuption;
	}
	public long getSerialNum() {
		return serialNum;
	}
	//clone== copy const and return the vehicle
//	public SportCar clone() {
//		return new SportCar(this);
//
//}
	
	
}
