package hellojpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employees")
public class Emp {

	@Id
	@Column(name="employee_id")
	Integer employeeId;

	@Column(name="last_name")
	String lastName;

	@Override
	public String toString() {
		return "Emp [employeeId=" + employeeId + ", lastName=" + lastName + "]";
	}

}
