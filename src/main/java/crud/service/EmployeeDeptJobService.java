package crud.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import crud.dao.DepartmentDao;
import crud.dao.EmployeeDao;
import crud.dao.JobtypeDao;
import crud.entity.Department;
import crud.entity.EmpJoinDeptJob;
import crud.entity.Employee;
import crud.entity.Jobtype;

@Service
public class EmployeeDeptJobService {

	@Autowired
	EmployeeDao employeeDao;

	@Autowired
	DepartmentDao departmentDao;

	@Autowired
	JobtypeDao jobtypeDao;

	// Employeeテーブル全雇用者情報取得
	public List<Employee> getEmployeeList() {
		return employeeDao.selectAll();
	}

	// Employeeテーブル指定ID者情報取得
	public Employee getEmployee(int id) {
		return employeeDao.selectById(id);
	}

	// Employeeテーブルと結合した部門、職種つき全雇用者情報取得
	public List<EmpJoinDeptJob> getEmpJoinDeptJobList() {
		return employeeDao.selectAllEmployeeDepartmentJob();
	}

	// Employeeテーブルと結合した部門、職種つき指定ID者情報取得
	public EmpJoinDeptJob getEmpJoinDeptJob(int id) {
		return employeeDao.selectEmployeeDepartmentJob(id);
	}

	// Departmentテーブル全部門情報取得
	public List<Department> getDepartmentList() {
		return departmentDao.selectAll();
	}

	// Departmentテーブル指定ID部門情報取得
	public Department geDepartment(int id) {
		return departmentDao.selectById(id);
	}

	// Jobtypeテーブル全職種情報取得
	public List<Jobtype> getJobTypeList() {
		return jobtypeDao.selectAll();
	}

	// Jobtypeテーブル指定ID職種情報取得
	public Jobtype getJobType(int id) {
		return jobtypeDao.selectById(id);
	}

	// 1件登録
	public void insert(Employee emp) {
		emp.setInsertTimestamp(LocalDateTime.now());//本日日付
		employeeDao.insert(emp);
	}

	// 1件更新
	public void update(Employee emp) {
		emp.setUpdateTimestamp(LocalDateTime.now());//本日日付
		employeeDao.update(emp);
	}

	// 1件削除
	public void delete(int id) {
		Employee emp = this.getEmployee(id);
		employeeDao.delete(emp);
	}
}
