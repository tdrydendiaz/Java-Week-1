
public class Car extends Vehicle {

	private int noOfDoors;
	private int noOfPassengers;

	public Car(int noOfDoors, int noOfPassengers, int noOfWheels, int sizeOfEngine, int noOfLights,
			String registrationNo) {
		super(noOfWheels, sizeOfEngine, noOfLights, registrationNo);
		this.noOfDoors = noOfDoors;
		this.noOfPassengers = noOfPassengers;

	}

	public Car() {
	}

	public String toString() {
		return "I have no Lights";
	}

	public int getNoOfDoors() {
		return noOfDoors;
	}

	public void setNoOfDoors(int noOfDoors) {
		this.noOfDoors = noOfDoors;
	}

	public int getNoOfPassengers() {
		return noOfPassengers;
	}

	public void setNoOfPassengers(int noOfPassengers) {
		this.noOfPassengers = noOfPassengers;
	}

}
