package crud.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import crud.dao.DepartmentDao;
import crud.dao.EmployeeDao;
import crud.dao.JobtypeDao;
import crud.entity.EmpJoinDeptJob;


@RestController
@RequestMapping("/")
public class IndexController {

	private final EmployeeDao employeeDao;

	@Autowired
	public IndexController(EmployeeDao employeeDao,
			DepartmentDao departmentDao, JobtypeDao jobtypeDao) {
		this.employeeDao = employeeDao;
	}

	// 一覧表示
	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<EmpJoinDeptJob> index() {
		List<EmpJoinDeptJob> employeeList = employeeDao
				.selectAllEmployeeDepartmentJob();
		return employeeList;
	}

}