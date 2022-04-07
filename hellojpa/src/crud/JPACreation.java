package crud;

import java.sql.Date;
import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPACreation {
	public static void main(String[] args) {
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("jpa-example");
		EntityManager em = emFactory.createEntityManager();

		MyOrder myOrder = new MyOrder();
		long todayTime = Calendar.getInstance().getTime().getTime();
		myOrder.orderDate = new Date(todayTime);
		myOrder.orderId = 1L;
		em.getTransaction().begin();
		System.out.println(myOrder.orderDate);
		em.persist(myOrder);
		em.getTransaction().commit();
		em.clear();
	}

}
