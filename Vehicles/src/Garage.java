import java.util.ArrayList;

public class Garage {

	public ArrayList<Vehicle> vehicleStats = new ArrayList<Vehicle>();

	public String getCost() {
		for (Vehicle v : vehicleStats) {

			if (v instanceof Car) {

				System.out.println("The price of Car repair is �" + (100 * ((Car) v).getNoOfDoors()));

			} else if (v instanceof Bus) {
				System.out.println("The price of Bus repair is �" + (50 * ((Bus) v).getLength()));
			} else if (v instanceof Motorbike) {
				System.out.println("The price of Car repair is �" + (35 * ((Motorbike) v).getNoDoors()));
			}

		}
		return "";
	}
}
