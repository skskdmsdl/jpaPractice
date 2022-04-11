package jpa.study.myjpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public class EmpRepository {

	@PersistenceContext
	EntityManager em;
	
	public Emp findOne(Integer id) {
		return em.find(Emp.class, id);
	}
}
