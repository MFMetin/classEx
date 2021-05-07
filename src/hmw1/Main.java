package hmw1;

public class Main {

	public static void main(String[] args) {
		
		Person person1 = new Person(1,"Furkan","Metin",20);
		Person person2 = new Person(2,"Engin","Demirog",30);
		Person person3 = new Person(3,"Murat","Kaya",24);
		
		PersonManager personManager = new PersonManager();
		
		personManager.add(person1);
		personManager.delete(person2);
		personManager.update(person3);
		
		
		Person[] person_ = new Person[]{
			person1,
			person2,
			person3
		};
		
		for(Person person :person_) {
			System.out.println(person.name);
			System.out.println(person.surname);
			System.out.println("---------------------");
		}
		
	}

}
