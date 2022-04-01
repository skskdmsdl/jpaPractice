package person;

public class PersonTest {
	public static void main(String[] args) {
		Person person1 = new Person(20, "권정열");
		Person person2 = new Person();
		
		System.out.println("전체 인구수는 " + person1.getPopulation());
		person1.selfIntroduce();
		person2.selfIntroduce();
	}
}

class Person {
	static int numberOfPersons;
	int age;
	String name;
	
	public Person() {
		age = 12;
		name = "Anonymous";
		numberOfPersons++;
	}

	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
		numberOfPersons++;
	}
	
	void selfIntroduce() {
		System.out.println("내 이름은 " + name + "이며, 나이는 " + age + "살 입니다.");
	}
	
	int getPopulation() {
		return Person.numberOfPersons;
	}
}

