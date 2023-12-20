package Pack4.Pack4;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		//15object 
		Vehicle[] invntory = {v1,v2,v3,b1,b2,b3,b4,c1,c2,c3,sc1,sc2,sp1,sp2,sp3};

		for(int i = 0 ; i < invntory.length;i++) {
			System.out.println(invntory[i]);
		}
		
		
		
	}

}
