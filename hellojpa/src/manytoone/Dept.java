package manytoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
@Table(name="departments")
public class Dept {
	
	@Id
	@Column(name="department_id")
	Integer departmentId;
	
	@Column(name="department_name")
	String departmentName;

	@Override
	public String toString() {
		return "Dept [departmentId=" + departmentId + ", departmentName=" + departmentName + "]";
	}
	
}
