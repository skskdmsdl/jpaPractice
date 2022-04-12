package jpa.study.myjpa;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import jpa.study.myjpa.EmpService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:root-context.xml")
public class EmpServiceTestCase {
	
	@Autowired
	EmpService es;

	@Test
	public void test() {
//		Emp emp = es.selectOne(100);
//		System.out.println(emp);
//		assertEquals(emp.deptId.intValue(),90);
	}

}
