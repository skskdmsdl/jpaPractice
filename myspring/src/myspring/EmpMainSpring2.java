package myspring;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpMainSpring2 {
	//이 클래스가 의존하는 클래스가 있나욤? 사용/의존/이용 -> empService
	//empDAO를 의존하고 있나요?ㄴ
	//empServiceImpl을 의존하고있나요?ㄴ
   public static void main(String[] args) throws Exception {
      
      int deptId = 100;
//      EmpServiceImpl emp = new EmpServiceImpl();
//      EmpDAO dao = new EmpDAO();
//      emp.setDao(dao);
      
      ApplicationContext context = 
    		  new ClassPathXmlApplicationContext("classpath:context-spring.xml");
      //인터페이스로는 실행할 수 없다 그 인터페이스를 구현한 클래스를 사용하도록 해야함 
      //의존주입
      EmpService emp = (EmpService) context.getBean("empService");
      List<EmpVO> list = emp.getList(deptId);
      //함수호출인데 
      for(EmpVO vo : list) {
         System.out.println(vo);
      }
   }
}