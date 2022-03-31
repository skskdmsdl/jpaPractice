package person;

public class PersonTest {
	public static void main(String[] args) {
		Person person = new Person();
		person.age = 20;
		person.name = "권정열";
		person.selfIntroduce();
		System.out.println(person.getPopulation());
	}
}

class Person {
	int numberOfPersons;
	int age;
	String name;
	
	public Person() {
		super();
		this.age = 12;
		this.name = "Anonymous";
		numberOfPersons++;
	}

	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	void selfIntroduce() {
		System.out.println("내 이름은 " + name + "이며, 나이는 " + age + "살 입니다.");
	}
	
	int getPopulation() {
		return numberOfPersons;
	}
}

