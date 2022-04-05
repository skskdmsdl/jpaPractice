package myspring;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpMain {
	public static void main(String[] args) throws Exception {
		//사용자로부터 부서번호를 입력받아서 그 부서에 근무하는 사원들의 정보를 출력함
//		Scanner scan = new Scanner(System.in);
//		System.out.println("부서번호 : ");
//		int deptId = scan.nextInt();
		int deptId = 100;
		EmpDAO dao = new EmpDAO();
		//부서번호를 전달받아서 부서원의 정보목록을 리턴한다.
		//메서드명, 매개변수, 리턴타입 -> [메서드 명: getEmpList] , [int dept] , [리턴타입 : list]
		//list 안에는 EmpVO가 담긴다.
		List<EmpVO> list = dao.getEmpListByDeptId(deptId);
		for(EmpVO vo : list) {
			System.out.println(vo);
		}
	}
}