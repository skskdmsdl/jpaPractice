package myspring;

import java.util.List;

//함수는 정의, 선언=abstract, 추상=virtual, 호출/실행
public interface EmpService {
	
	//메서드 선언한 것 
	public abstract List<EmpVO> getList(int deptId) throws Exception;
	//인터페이스는 선언밖에 할 수 없다.
}