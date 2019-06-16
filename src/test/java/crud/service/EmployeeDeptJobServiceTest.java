package crud.service;

import static org.junit.Assert.*;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import crud.DataSourceConfiguration;
import crud.dao.DepartmentDaoImpl;
import crud.dao.EmployeeDaoImpl;
import crud.dao.JobtypeDaoImpl;
import crud.entity.Department;
import crud.entity.EmpJoinDeptJob;
import crud.entity.Employee;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {
		DataSourceConfiguration.class,
		EmployeeDaoImpl.class,
		DepartmentDaoImpl.class,
		JobtypeDaoImpl.class,
		EmployeeDeptJobService.class})
public class EmployeeDeptJobServiceTest {

	@Autowired
	EmployeeDeptJobService empService;

	@Test
	public void testGetEmployeeList() {
		List<Employee> empItems = empService.getEmployeeList();
		for (Employee emp : empItems) {
			System.out.println(emp.getEmployeeName() + " " + emp.getEmployeeId());
		}
		assertEquals(14, empItems.size());

		assertEquals("ALLEN", empItems.get(0).getEmployeeName());
		assertEquals("WARD", empItems.get(1).getEmployeeName());
		assertEquals("JONES", empItems.get(2).getEmployeeName());
		assertEquals("MARTIN", empItems.get(3).getEmployeeName());
		//本来は14件分行う
	}

	@Test
	public void testGetEmployee() {
		Employee emp = empService.getEmployee(1);
		assertEquals("ALLEN", emp.getEmployeeName());
	}

	@Test
	public void testGetEmpJoinDeptJobList() {
		List<EmpJoinDeptJob> items = empService.getEmpJoinDeptJobList();
		for (Employee emp : items) {
			System.out.println(emp.getEmployeeName() + " " + emp.getEmployeeId());
		}
		assertEquals(14, items.size());

		EmpJoinDeptJob edj = items.get(0);
		assertEquals("ALLEN", edj.getEmployeeName());
		assertEquals("ACCOUNTING", edj.getDepartmentName());
		edj = items.get(1);
		assertEquals("WARD", edj.getEmployeeName());
		assertEquals("RESEARCH", edj.getDepartmentName());
		edj = items.get(2);
		assertEquals("SALES", edj.getDepartmentName());
		assertEquals("JONES", edj.getEmployeeName());
		edj = items.get(3);
		assertEquals("MARTIN", edj.getEmployeeName());
		assertEquals("ACCOUNTING", edj.getDepartmentName());

		//本来は14件分行う
	}

	@Test
	public void testGetEmpJoinDeptJob() {
		EmpJoinDeptJob edj = empService.getEmpJoinDeptJob(1);
		assertEquals("ALLEN", edj.getEmployeeName());
	}

	@Test
	public void testGetDepartmentList() {
		List<Department> deptItems = empService.getDepartmentList();

		assertEquals(3, deptItems.size());

		Department item1 = deptItems.get(0);
		assertEquals(Integer.valueOf(1), item1.getDepartmentId());
		assertEquals("ACCOUNTING", item1.getDepartmentName());

		Department item2 = deptItems.get(1);
		assertEquals(Integer.valueOf(2), item2.getDepartmentId());
		assertEquals("RESEARCH", item2.getDepartmentName());

		Department item3 = deptItems.get(2);
		assertEquals(Integer.valueOf(3), item3.getDepartmentId());
		assertEquals("SALES", item3.getDepartmentName());

	}
	/*
		@Test
		public void testGeDepartment() {
			fail("Not yet implemented");
		}
		@Test
		public void testGetJobTypeList() {
			fail("Not yet implemented");
		}
		@Test
		public void testGetJobType() {
			fail("Not yet implemented");
		}
	*/
	@Test
	@Transactional
	@Rollback(true)
	public void testInsert() {
		List<Employee> empItems1 = empService.getEmployeeList();
		Employee obj = new Employee();
		obj.setEmployeeName("SMILEY");
		obj.setAge(40);
		obj.setSalary(1000);
		obj.setJobtypeId(1);
		obj.setHiredate(new Date(new java.util.Date().getTime()));
		obj.setDepartmentId(1);
		obj.setInsertTimestamp(LocalDateTime.now());
		empService.insert(obj);
		List<Employee> empItems2 = empService.getEmployeeList();
		assertEquals(empItems2.size(),empItems1.size()+1);
	}

	@Test
	@Transactional
	@Rollback(true)
	public void testUpdate() {
		Employee emp = empService.getEmployee(2);

		emp.setEmployeeName("Owen");
		empService.update(emp);

		//更新できているか確認
		Employee emp2 = empService.getEmployee(2);
		assertEquals("Owen", emp2.getEmployeeName());
	}

	@Test
	@Transactional
	@Rollback(true)
	public void testDelete() {
		List<Employee> empItems1 = empService.getEmployeeList();
		empService.delete(2);
		List<Employee> empItems2 = empService.getEmployeeList();
		assertEquals(empItems2.size(),empItems1.size()-1);
	}
}
