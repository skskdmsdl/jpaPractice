package jpa.study.myjpa;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpMain {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:/root-context.xml");
		EmpService es = (EmpService) ctx.getBean("empSerivce");
		//Emp emp = es.selectOne(100);
		//System.out.println(emp);
	}
}
