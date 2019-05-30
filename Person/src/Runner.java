
public class Runner {

	public static void main(String[] args) {

		Person tania = new Person("Tania", "Singer");
		Person lucy = new Person(30);
		Person david = new Person("David", "Dancer", 21);

		System.out.println(tania.me());
		System.out.println(david.me());
		System.out.println(lucy.me());

		PersonManager pm1 = new PersonManager();
		pm1.getPersonList().add(tania);
		pm1.getPersonList().add(david);

		System.out.println(pm1.getPersonList().get(0).getName());

		pm1.searchName("David");

	}

}
