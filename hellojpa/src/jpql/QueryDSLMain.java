package jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.querydsl.jpa.impl.JPAQueryFactory;

public class QueryDSLMain {
	public static void main(String[] args) {
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("jpa-example");
		EntityManager em = emFactory.createEntityManager();
		QEmp qEmp = new QEmp("e");
		JPAQueryFactory factory = new JPAQueryFactory(em);
		List<Emp> list = factory.select(qEmp)
				.from(qEmp)
				.where(qEmp.lastName.eq("King"))
				.fetch();
		for(Emp emp : list) {
			System.out.println(emp);
		}
//		String sql = "select e from Emp as e where e.departmentId = 100";
//		List<Emp> list = em.createQuery(sql, Emp.class).getResultList();
//		for(Emp emp : list) {
//			System.out.println(emp);
//		}
	}
}
