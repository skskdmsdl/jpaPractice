package jpql;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="employees")
public class Emp {

	@Id
	@Column(name="employee_id")
	Integer employeeId;
	
	@Column(name="last_name")
	String lastName;
	
	@Column(name="first_name")
	String firstName;
	
	@Column(name="department_id")
	Integer departmentId;
	
	@Override
	public String toString() {
		return "Emp [employeeId=" + employeeId + ", lastName=" + lastName + ", firstName=" + firstName + "]";
	}

	

}
