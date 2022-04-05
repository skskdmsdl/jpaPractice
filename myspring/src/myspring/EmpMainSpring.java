package myspring;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpMainSpring {
   public static void main(String[] args) throws Exception {
      
      int deptId = 100;
      EmpServiceImpl emp = new EmpServiceImpl();
      EmpDAO dao = new EmpDAO();
      emp.setDao(dao);


      List<EmpVO> list = emp.getList(deptId);
      for(EmpVO vo : list) {
         System.out.println(vo);
      }
   }
}