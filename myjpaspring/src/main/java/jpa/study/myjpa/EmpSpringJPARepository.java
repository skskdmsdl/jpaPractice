package jpa.study.myjpa;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

@Transactional
public interface EmpSpringJPARepository extends JpaRepository<Emp, Integer>{
	List<Emp> findByDepartmentId(Integer departmentId);
	List<Emp> findByLastNameAndFirstName(String lastName, String firstName);
}
