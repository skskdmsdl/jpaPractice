package kosta.edu.myjpa;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import jpa.study.myjpa.Emp;
import jpa.study.myjpa.EmpRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:root-context.xml")
public class EmpRepositoryTestCase {
	
	@Autowired
	EmpRepository er;

	@Test
	public void test() {
		Emp emp = er.findOne(100);
		System.out.println(emp);
		assertEquals(emp.lastName,"King");
	}

}
