package onetomany;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
	public static void main(String[] args) {
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("jpa-example");
		EntityManager em = emFactory.createEntityManager();
		Dept dept = em.find(Dept.class, 100);
		System.out.println(dept.departmentName);
		for(Emp emp : dept.list) {
			System.out.println(emp);
		}
	}
}
