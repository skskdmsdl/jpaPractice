package crud;

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
		cal.set(Calendar.YEAR, 2021);
		em.getTransaction().begin();
		myOrder.orderDate = new Date(cal.getTimeInMillis());
		em.getTransaction().commit();
		myOrder = em.find(MyOrder.class, 1L);
		System.out.println(myOrder.orderDate);
		em.clear();
	}

}
