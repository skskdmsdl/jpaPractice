package jpa.study.myjpa;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
	"classpath:root-context.xml", 	"classpath:spring-jpa-context.xml"
}
)
public class EmpSpringJPARepositoryTestCase {

	@Autowired
	EmpSpringJPARepository er;

//	@Test
//	public void test() {
//		Emp emp = er.getById(100);
//		System.out.println(emp);
//		assertEquals(emp.getLastName(),"King");
//		for(Emp person: er.findAll()) {
//			System.out.println(person);
//		}
//	}
	@Test
	public void testFindByDepartmentId() {
		assertEquals(34, er.findByDepartmentId(80).size());
	}

}
