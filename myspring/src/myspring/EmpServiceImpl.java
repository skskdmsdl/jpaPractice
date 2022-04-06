package myspring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("empService")
public class EmpServiceImpl implements EmpService{

	@Autowired
	EmpDAO dao;

	@Override
	public List<EmpVO> getList(int deptId) throws Exception {

		return dao.getEmpListByDeptId(deptId);
	}


}
