package crud.entity;

import java.io.Serializable;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

@Entity
@Table(name = "JOBTYPE")
public class Jobtype implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "JOBTYPE_ID")
	private Integer jobtypeId;

	@Column(name = "JOBTYPE_NAME")
	private String jobtypeName;

	@Override
	public String toString() {
		return "Jobtype [" + ", jobtypeId=" + jobtypeId + ", jobtypeName="
				+ jobtypeName + "]";
	}

	public Integer getJobtypeId() {
		return jobtypeId;
	}

	public void setJobtypeId(Integer jobtypeId) {
		this.jobtypeId = jobtypeId;
	}

	public String getJobtypeName() {
		return jobtypeName;
	}

	public void setJobtypeName(String jobtypeName) {
		this.jobtypeName = jobtypeName;
	}

}