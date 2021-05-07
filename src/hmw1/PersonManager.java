package hmw1;

public class PersonManager {

	public void add(Person person) {
		System.out.println(person.name + " added.");
	}
	public void delete(Person person) {
		System.out.println(person.name + " removed.");
	}
	public void update(Person person) {
		System.out.println(person.name + " updated.");
	}
}
