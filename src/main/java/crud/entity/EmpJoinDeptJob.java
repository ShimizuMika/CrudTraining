package crud.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;


@Entity
public class EmpJoinDeptJob extends Employee {

	private static final long serialVersionUID = 1L;

	@Column(name = "DEPARTMENT_NAME")	
	private String departmentName;
    
    @Column(name = "JOBTYPE_NAME")	
    private String jobtypeName;

    @Override
	public String toString() {
		return "EmpJoinDeptJob [" 
				+", employeeId=" + super.getEmployeeId()
				+ ", employeeName=" + super.getEmployeeName() 
				+ ", age=" + super.getAge() 
				+ ", jobtypeId=" + super.getJobtypeId()
				+ ", jobtypeName=" + jobtypeName
				+ ", salary="+ super.getSalary()
				+", hiredate=" + super.getHiredate() 
				+", departmentId=" + super.getDepartmentId()
				+", departmentName=" + departmentName
				+ ", version=" + super.getVersion()
				+ ", insertTimestamp=" + super.getInsertTimestamp()
                + ", updateTimestamp=" + super.getUpdateTimestamp() + "]";
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getJobtypeName() {
		return jobtypeName;
	}

	public void setJobtypeName(String jobtypeName) {
		this.jobtypeName = jobtypeName;
	}

}
