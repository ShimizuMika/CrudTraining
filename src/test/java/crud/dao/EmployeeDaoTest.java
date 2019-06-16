package crud.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import crud.DataSourceConfiguration;
import crud.entity.Employee;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {
		DataSourceConfiguration.class,
		EmployeeDaoImpl.class
})
public class EmployeeDaoTest {

	@Autowired
	EmployeeDao employeeDao;

	@Test
	public void testSelectAll() {
		List<Employee> employee = employeeDao.selectAll();
		Employee emp=employee.get(0);
		assertEquals(Integer.valueOf(30), emp.getAge());
	}
}
