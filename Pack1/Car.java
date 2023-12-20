package Pack1;

public class Car extends Vehicle {

			private int nSeats;
			
			
public Car() {
	nSeats = 2;
	
}


public Car(int nS) {
	this.nSeats = nS;
}

public Car(Car cac) {
	nSeats = cac.nSeats;
}


public int getnSeats() {
	return nSeats;
}


public void setnSeats(int nSeats) {
	this.nSeats = nSeats;
}


@Override
public String toString() {
	return "Car [nSeats=" + nSeats + "]";
}



			
}
