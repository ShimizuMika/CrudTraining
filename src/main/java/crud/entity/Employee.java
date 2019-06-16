package crud.entity;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDateTime;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.GeneratedValue;
import org.seasar.doma.GenerationType;
import org.seasar.doma.Id;
import org.seasar.doma.Version;

@Entity
public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "EMPLOYEE_ID")
	private Integer employeeId;

	@Column(name = "EMPLOYEE_NAME")
	private String employeeName;

	private Integer age;

	private Integer salary;

	@Column(name = "JOBTYPE_ID")
	private Integer jobtypeId;

	private Date hiredate;

	@Column(name = "DEPARTMENT_ID")
	private Integer departmentId;

	@Version
	private Integer version;

	@Column(name = "INSERT_TIMESTAMP")
	private LocalDateTime insertTimestamp;

	@Column(name = "UPDATE_TIMESTAMP")
	private LocalDateTime updateTimestamp;

	@Override
	public String toString() {
		return "Employee [" + ", employeeId=" + employeeId + ", employeeName=" + employeeName + ", age=" + age
				+ ", jobtypeId=" + jobtypeId + ", salary=" + salary + ", hiredate=" + hiredate + ", departmentId="
				+ departmentId + ", version=" + version + ", insertTimestamp=" + insertTimestamp + ", updateTimestamp="
				+ updateTimestamp + "]";
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public Integer getJobtypeId() {
		return jobtypeId;
	}

	public void setJobtypeId(Integer jobtypeId) {
		this.jobtypeId = jobtypeId;
	}

	public Date getHiredate() {
		return hiredate;
	}

	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}

	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public LocalDateTime getInsertTimestamp() {
		return insertTimestamp;
	}

	public void setInsertTimestamp(LocalDateTime insertTimestamp) {
		this.insertTimestamp = insertTimestamp;
	}

	public LocalDateTime getUpdateTimestamp() {
		return updateTimestamp;
	}

	public void setUpdateTimestamp(LocalDateTime updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
	}

}