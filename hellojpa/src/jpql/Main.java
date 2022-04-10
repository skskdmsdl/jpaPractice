package jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
	public static void main(String[] args) {
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("jpa-example");
		EntityManager em = emFactory.createEntityManager();
		String sql = "select e from Emp as e where e.departmentId = 100";
		List<Emp> list = em.createQuery(sql, Emp.class).getResultList();
		for(Emp emp : list) {
			System.out.println(emp);
		}
	}
}
