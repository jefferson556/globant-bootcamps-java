package ExampleOfCollection;

public class Employee {
	String surname;
	String firstName;
	String position;
	int    age;

	
	public Employee(String surname, String firstName, String position, int age) {
		this.surname = surname;
		this.firstName = firstName;
		this.position = position;
		this.age = age;
	}
	public String toString() {
		return surname.toString()+" "+firstName.toString()+" "+position.toString()+" "+Integer.toString(age);
	}

	
}
