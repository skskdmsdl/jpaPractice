package jpa.study.myjpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("empSerivce")
public class EmpServiceImpl implements EmpService {

	@Autowired
	EmpRepository er;

	@Override
	public Emp selectOne(Integer id) {
		return er.findOne(id);
	}
}
