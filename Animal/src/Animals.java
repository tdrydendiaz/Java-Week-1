
public class Animals {

	private int weight;
	private int age;
	private String colour;
	private int noOfLegs;

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getNoOfLegs() {
		return noOfLegs;
	}

	public void setNoOfLegs(int noOfLegs) {
		this.noOfLegs = noOfLegs;
	}

	public void consume() {
		System.out.println("om nom nom nom");
	}

	public void reproduce() {
		System.out.println("I love babies");
	}
}
