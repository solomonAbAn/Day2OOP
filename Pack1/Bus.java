package Pack1;

public class Bus extends Vehicle {
	private int nPassengers;
	private int nWheels;
	
	
	public Bus() {
		nPassengers = 10;
		nWheels = 4;
	}
	
	
	public Bus(int nP, int nW, int sp, String bd, int nd, int pr) {
		//this
		//this
		//this
		//this
		
		this.nPassengers = nP;
		this.nWheels = nW;
	}
	
	public Bus(Bus buc) {
		nPassengers = buc.nPassengers;
		nWheels = buc.nWheels;
	}


	public int getnPassengers() {
		return nPassengers;
	}


	public void setnPassengers(int nPassengers) {
		this.nPassengers = nPassengers;
	}


	public int getnWheels() {
		return nWheels;
	}


	public void setnWheels(int nWheels) {
		this.nWheels = nWheels;
	}


	@Override
	public String toString() {
		return "Bus [nPassengers=" + nPassengers + ", nWheels=" + nWheels + "]";
	}
	
	
	
	
	
}
