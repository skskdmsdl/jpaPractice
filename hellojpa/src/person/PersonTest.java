package person;

public class PersonTest {
	public static void main(String[] args) {
		Person person1 = new Person(20, "������");
		Person person2 = new Person();
		
		System.out.println("��ü �α����� " + person1.getPopulation());
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
		System.out.println("�� �̸��� " + name + "�̸�, ���̴� " + age + "�� �Դϴ�.");
	}
	
	int getPopulation() {
		return Person.numberOfPersons;
	}
}

