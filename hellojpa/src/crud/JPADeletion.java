package crud;

import java.sql.Date;
import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPADeletion {
	public static void main(String[] args) {
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("jpa-example");
		EntityManager em = emFactory.createEntityManager();
		
		MyOrder myOrder = em.find(MyOrder.class, 1L);
		em.getTransaction().begin();
		em.remove(myOrder);
		em.getTransaction().commit();
		em.clear();
	}

}
