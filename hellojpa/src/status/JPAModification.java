package status;

import java.sql.Date;
import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAModification {
	public static void main(String[] args) {
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("jpa-example");
		EntityManager em = emFactory.createEntityManager();

		MyOrder myOrder = em.find(MyOrder.class, 1L);
		System.out.println(myOrder.orderDate);
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2020);
		em.getTransaction().begin();
		// status 변경하면 실행안됨(detach)
		em.detach(myOrder);

		myOrder.orderDate = new Date(cal.getTimeInMillis());  // orderDate 변경 부분
		em.getTransaction().commit();
		myOrder = em.find(MyOrder.class, 1L);
		System.out.println(myOrder.orderDate);
		em.clear();
	}

}
