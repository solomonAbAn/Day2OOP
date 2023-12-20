package Pack5;

import Pack4.Pack4.Bus;
import Pack4.Pack4.Car;
import Pack4.Pack4.RaceCar;
import Pack4.Pack4.SportCar;
import Pack4.Pack4.Vehicle;

public class Demo {

	
	public static void showVehicleInfo(Vehicle v) {
		System.out.println("the info of vehicle");
		System.out.println(v);
		System.out.println();
		
		
	}
	
	public static Vehicle[] copyinventory1(Vehicle[] va) {
		Vehicle[] vecarr = va;//shallow copy
		return vecarr;
	}
	
	public static Vehicle[] copyinventory2(Vehicle[] va) {
		Vehicle[] vecarr = new Vehicle[va.length];
		for(int i =0; i<va.length; i++) {
			vecarr[i]= new Vehicle(va[i]);
			
		}
		return vecarr;
	}
	
	public static Vehicle[] copyinventory3(Vehicle[] va) {
		Vehicle[] vecarr = new Vehicle[va.length];
		for(int i =0; i<va.length; i++) {
			
			vecarr[i] = va[i].clone();
			
		}
		
		return vecarr;
	}
	
	
	public static void showinventory(Vehicle[] vec) {
		for(int i =0; i<vec.length; i++) {
			System.out.println("the info of vehicle");
			System.out.println(vec[i]);
			System.out.println();
		}
	}
	
	
	
	
	
	public static void sayhi() {// is to able to call the method inside an object
		System.out.println("hello from here");
	}

	public static void main(String[] args) {
		
		
		System.out.println("Vehicles");
		System.out.println("=================");
		Vehicle v1 = new Vehicle();
		Vehicle v2 = new Vehicle(3,4000);
		Vehicle v3 = new Vehicle(v1);
		
		System.out.println("Bus");
		System.out.println("=================");
		Bus b1 = new Bus();
		Bus b2 = new Bus(10);
		Bus b3 = new Bus(b1);
		Bus b4 = new Bus(2,55000,25);
		
		System.out.println("Cars");
		System.out.println("=================");
		Car c1 = new Car();
		Car c2 = new Car(4,20000,3);
		Car c3 = new Car(c1);
		
		
		System.out.println("Sport Cars");
		System.out.println("=================");
		SportCar sc1 = new SportCar();
		SportCar sc2 = new SportCar(2,50000,2,4);
		
		System.out.println("Race Cars");
		System.out.println("=================");
		RaceCar sp1 = new RaceCar();
		RaceCar sp2 = new RaceCar(2,30000,2,4,400);
		RaceCar sp3 = new RaceCar(sp1);
		System.out.println();
		
		
		
		Vehicle[] inven1 = {v2,b4,c2,sc2,sp3};
 		
	Vehicle[] inven2 =  copyinventory1(inven1);
	
	System.out.println("Diplay");
	showinventory(inven2);
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}