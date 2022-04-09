package bidirection;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

//@Entity
@Table(name="departments")
public class Dept {

	@Id
	@Column(name="department_id")
	Integer departmentId;
	
	@Column(name="department_name")
	String departmentName;
	
	@OneToMany(mappedBy = "dept")
	//@JoinColumn(name="department_id", referencedColumnName = "department_id")
	List<Emp> list;

	@Override
	public String toString() {
		return "Dept [departmentId=" + departmentId + ", departmentName=" + departmentName + "]";
	}
	
}
