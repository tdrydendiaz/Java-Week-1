
public class Users {

	private String userID;
	private int age;
	private String address;
	private String name;

	public Users(String name, String userID, int age, String address) {
		this.name = name;
		this.userID = userID;
		this.age = age;
		this.address = address;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}



	}

