package onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

//@Entity
@Table(name="computer")
public class Computer {

	@Id
	@Column(name="computer_id")
	String computerId;
	
	@Column(name="computer_name")
	String computerName;
	
	@OneToOne
	@JoinColumn(name="employee_id")
	Emp emp;

	
}
