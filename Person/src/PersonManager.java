import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PersonManager {

	private ArrayList<Person> personList = new ArrayList<Person>();

	public void searchName(String name) {

		List<Person> filteredList = getPersonList().stream().filter(p -> p.getName().equals(name))
				.collect(Collectors.toList());
		System.out.println(filteredList.get(0).getName());

	}

	/**
	 * @return the personList
	 */
	public ArrayList<Person> getPersonList() {
		return personList;
	}

	// public void searchJob(String name) {
	// List<Person> filteredList = getPersonList().stream().filter(p ->
	// p.getJob().equals(jobTitle))
	// .collect(Collectors.toList());
	// System.out.println(filteredList.get(0).getJob());

	// }
}
