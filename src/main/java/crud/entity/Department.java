package crud.entity;

import java.io.Serializable;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;

@Entity
public class Department implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "DEPARTMENT_ID")
	private Integer departmentId;

	@Column(name = "DEPARTMENT_NAME")
	private String departmentName;

	@Override
	public String toString() {
		return "Department [" + ", departmentId=" + departmentId
				+ ", departmentName=" + departmentName + "]";
	}

	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

}