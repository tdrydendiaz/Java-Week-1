
public class Person {
	private String name;
	private int age;
	private String jobTitle;

	public Person(String name, String jobTitle) {
		this.name = name;
		this.jobTitle = jobTitle;

	}

	public Person(String name, String jobTitle, int age) {
		this.name = name;
		this.jobTitle = jobTitle;
		this.age = age;
	}

	public Person(int age) {
		this.age = age;

	}

	public String me() {
		return "My name is " + name + " my age is " + age + " and my occupation is " + jobTitle;

	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;

	}

	public String getJob() {
		return jobTitle;

	}
	// Create a List Implementation and store those object inside.

}
