package myspring;

import java.util.List;

//empservice에 선언된 메서드를 재정의/정의하지 않았기에 오류가 뜸
public class EmpServiceClass implements EmpService{
	
	static EmpDAO dao;
	public void setDao(EmpDAO dao) {
	      this.dao = dao;
	   }

	@Override
	public List<EmpVO> getList(int deptId) throws Exception {
		
		return dao.getEmpListByDeptId(deptId);
	}


}
